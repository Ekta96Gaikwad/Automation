package com.OrangeHRM;

import org.openqa.selenium.By;

public class WaitsExample extends BaseClass {

	public static void main(String[] args) {
		launchBrowser("Chrome");
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		LoginTC.Login1("Admin","admin123");
		
		try
		{
			if(driver.findElement(By.id("spanMessage")).isDisplayed())
			{
				String errorMessage=driver.findElement(By.id("spanMessage")).getText();
				System.out.println(errorMessage);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error Message is not available on screen "+e);
		}
	}
}
