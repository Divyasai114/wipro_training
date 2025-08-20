package com.web;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoWebShopTest {
    WebDriver driver;
    WebDriverWait wait;

    private void pause(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Parameters({"browserName", "url"})
    @BeforeClass
    public void setUp(@Optional("chrome")String browserName,@Optional("https://demowebshop.tricentis.com/")String url) {
        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else {
            throw new IllegalArgumentException("Only Chrome browser is supported currently.");
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get(url);
        pause(2);
    }

    @Test(priority = 1)
    public void verifyHomePageTitle() {
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Demo Web Shop"), "Home page title does not match");
    }

    @Test(priority = 2)
    public void navigateToLoginPage() {
        WebElement loginLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log in")));
        loginLink.click();
        pause(2);
        Assert.assertTrue(driver.getTitle().contains("Login"), "Login page title mismatch");
    }

    @Test(priority = 3, dependsOnMethods = "navigateToLoginPage")
    public void loginTest() {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Email"))).sendKeys("testuser@example.com");
    	driver.findElement(By.id("Password")).sendKeys("Test@1234");
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        pause(2);
        Assert.assertTrue(driver.getPageSource().contains("Log out"), "Login failed or 'Log out' link not found");
    }

    @Test(priority = 4, dependsOnMethods = "loginTest")
    public void verifyProductList() {
        WebElement booksCategory = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Books")));
        booksCategory.click();
        pause(2);
        Assert.assertTrue(driver.getPageSource().contains("Books"), "Books category page not loaded");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}