package com.OrangeHRM;

import org.openqa.selenium.By;

public class LoginPage extends BaseClass
{
	public static void main(String args[])
	{
			//launch Browser
					launchBrowser("Chrome");
					
					driver.manage().window().maximize();
					
					driver.get("https://opensource-demo.orangehrmlive.com/");
					
					//Valid username valid password
					Login("Admin","admin123");
					
					LogOut();
		}
		public static void LogOut()
		{
			try
			{
					//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
					driver.findElement(By.id("welcome")).click();
					
					//wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout")));
					driver.findElement(By.linkText("Logout")).click();
					System.out.println("Successfully Log Outed");
			}
			catch(Exception e)
			{
				System.out.println("Invalid credintial "+e);
			}
		}
		public static void Login(String UserName,String Password)
		{
			driver.findElement(By.id("txtUsername")).sendKeys(UserName);
			driver.findElement(By.id("txtPassword")).sendKeys(Password);
			driver.findElement(By.id("btnLogin")).click();
			try
			{
				driver.findElement(By.id("menu_pim_viewPimModule")).isDisplayed();
				System.out.println("User Successfully Loginned");
			}
			catch(Exception e)
			{
				System.out.println("Invaild Credential");
			}
		}
	}