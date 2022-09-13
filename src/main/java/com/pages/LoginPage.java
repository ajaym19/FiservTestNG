package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	WebDriver driver;

	public void browserSetup() {
		System.out.println("Opening the browser");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	public String getTitle() {
		return driver.getTitle();	
	}
	
	public boolean login() {
		//Next session PageFactory
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		return true;
	}
	
	public void closeSetUp() {
		driver.quit();
	}
}
