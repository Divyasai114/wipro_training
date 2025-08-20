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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WebOrders {
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
    public void setUp(String browserName, String url) {
        System.out.println("Launching WebOrders on " + browserName);
        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else {
            // You can add other browsers if needed
            throw new IllegalArgumentException("Only Chrome is supported currently.");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.get(url);
        pause(2);
    }

    @Test(priority = 1)
    public void loginTest() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_MainContent_username"))).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        pause(2);

        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.contains("Web Orders"), "Login failed or unexpected page title.");
    }

    @Test(priority = 2, dependsOnMethods = "loginTest")
    public void verifyViewAllOrders() {
        WebElement viewOrdersLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("View all orders")));
        viewOrdersLink.click();
        pause(2);

        Assert.assertTrue(driver.getPageSource().contains("List of All Orders"), "Orders list not displayed.");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed.");
        }
    }
}
