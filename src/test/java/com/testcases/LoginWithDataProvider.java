package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithDataProvider {

	WebDriver driver = null;
	
	
	public void browserSetup() {
		System.out.println("Opening the browser");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}	
	@Test(dataProvider = "getLoginData")
	public void validateLoginTC(String uname, String pwd) {
		System.out.println("In Login TC");
		System.out.println("Username is "+uname+" Password is "+pwd);
		
	}
	
	@DataProvider(name = "getLoginData")
	public Object[][] getDataUsingCode() {
		//row and column
		//the first parameter is the row paramter >> indicates how many times you want to execute the TC
		//the second paramter is the col parameter >> indicates how many values to pass in each iterations
		Object[][] data = new Object[3][2];
		data[0][0] = "admin";
		data[0][1] = "admin123";
		data[1][0] = "hr";
		data[1][1] = "hr123";
		data[2][0] = "finance";
		data[2][1] = "finance123";
		return data;
		
		
		//call the method which will read and return you the data
		/*
		 * ExcelReader reader = new ExcelReader();
		 * return reader.getTestDate();
		 */
		//use that data
	}
	

	public void closeBrowser() {
		System.out.println("Closing the browser");
		driver.close();
	}
}
