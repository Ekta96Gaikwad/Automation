package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class flipkart extends BaseClass
{
	static WebDriver driver;
	
	public static void main(String[] args) 
	{
		try
		{
		launchBrowser("Chrome");
		//driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		//driver.findElement(By.xpath("//div[text()='Beauty, Toys & More']")).click();
	
		//for search bar
		driver.findElement(By.xpath(" //input[contains(@class,\"_3704LK\")]")).click();
		driver.findElement(By.xpath(" //input[contains(@class,\"_3704LK\")]")).sendKeys("Lip Care");
		driver.findElement(By.xpath("//button[contains(@class,\"L0Z3Pu\")]")).click();
		
		
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}