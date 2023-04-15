package com.seleniumTester;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SeleniumTesterApplicationTests {

	WebDriver driver;

//	Launching the Chrome Browser
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
	}

//	Searching selenium training and clicking on it
	public void search() throws InterruptedException {
		driver.findElement(By.id("header_srch")).sendKeys("selenium");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='homepage-search-form']/form/button/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='search-results']/div/ul/li[2]/a/div[2]/h2")).click();
		System.out.print("The page title is :" + driver.getTitle());
	}
	//div[@id='homepage-search-form']/form/button/span
//		close browser
	public void closeBrowser() {
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		SeleniumTesterApplicationTests obj = new SeleniumTesterApplicationTests();
		obj.LaunchBrowser();
		obj.search();
		obj.closeBrowser();
	}

}
