package com.tech.learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(com.tech.learn.MyListener_report.class)
public class Listener_Practice {
    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.example.com");
    }

    @Test
    public void testPass() {
        Assert.assertTrue(true);
    }

    @Test
    public void testFail() {
        Assert.assertTrue(false); // This will fail and trigger screenshot
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}