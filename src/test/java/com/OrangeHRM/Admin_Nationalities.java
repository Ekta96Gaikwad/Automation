package com.OrangeHRM;

import org.openqa.selenium.By;

public class Admin_Nationalities extends BaseClass
{
	public static void main(String[] args) 
	{
		//launch Browser 
	launchBrowser("Chrome");
	 
	// driver.manage().window().maximize();
	 
	 driver.get("https://opensource-demo.orangehrmlive.com/");
	  
	 //Valid username valid password 
	 LoginTC.Login("Admin","admin123");
	 
	 Add_Nationality("INDIA");
	 
	}
	public static void Add_Nationality(String Nation_Name)
	{
		//click Admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
				
		//click nationality menu
		driver.findElement(By.id("menu_admin_nationality")).click();

		//click to add button
		driver.findElement(By.id("btnAdd")).click();
		
		//Enter Nation name
		driver.findElement(By.id("nationality_name")).sendKeys(Nation_Name);
		
		//Click to save button
		driver.findElement(By.id("btnSave")).click();
		
	}
	public static void DeleteNationality()
	{
		//click Admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
				
		//click nationality menu
		driver.findElement(By.id("menu_admin_nationality")).click();

		driver.findElement(By.id("btnDelete")).click();

		driver.findElement(By.id("ohrmList_chkSelectRecord_1")).click();

		driver.findElement(By.id("btnDelete")).click();
	}
}