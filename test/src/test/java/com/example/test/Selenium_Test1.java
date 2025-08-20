package com.example.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Test1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//WebDriver driver1 = new FirefoxDriver();
		//driver1.get("https://www.amazon.in");
		driver.get("https://start.spring.io/");
		//System.out.println(driver1.getTitle());
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
	}
}
