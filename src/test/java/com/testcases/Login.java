package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	WebDriver driver;
	LoginPage lp = new LoginPage();

	@BeforeMethod
	public void browserSetup() {
		lp.browserSetup();
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		lp.closeSetUp();
	}

	@Test(priority = 1, groups = "regression")
	public void validateTitleTC() {
		String expTitle = "OrangeHRM";
		String actTile = lp.getTitle();
		Assert.assertEquals(actTile, expTitle);
	}

	@Test(enabled = true, priority = 4, groups = "smoke")
	public void validateLoginTC() {
		boolean result = lp.login();
		Assert.assertTrue(result);
	}

//	@Test(priority = 2)
//	public void ATC() {
//		System.out.println("TC 3");
//	}
//
//	@Test (priority = 3, dependsOnMethods = "validateLoginTC", groups = "smoke")
//	public void validateHomePageTC() {
//		System.out.println("TC 2");
//	}
//	
//	@Test(priority = 5, dependsOnMethods = "validateLoginTC", groups = "smoke")
//	public void addUsers() {
//		System.out.println("Adding Users");
//	}
//	
//	@Test(groups = "sanity")
//	public void lpm1() {
//		System.out.println("Login Page m1 method");
//	}
//	


}
