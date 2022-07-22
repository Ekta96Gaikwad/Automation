package com.OrangeHRM;

import org.openqa.selenium.By;

public class PIM_EMP_Report extends BaseClass
{
	public static void main(String[] args) 
	{
		//launch Browser 
		launchBrowser("Chrome");
		
		// driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Valid username valid password 
		LoginTC.Login("Admin","admin123");
	
//		Add_Employee_Reports("ReportsName");//Done
		
//		Search_Employee_Reports("ReportsName");//Done
	}
	public static void Add_Employee_Reports(String ReportsName)
	{
		//click PIM menu
		driver.findElement(By.id("menu_pim_viewPimModule")).click();

 		//click Reports
		driver.findElement(By.id("menu_core_viewDefinedPredefinedReports")).click();
		
		//click Add Button
		driver.findElement(By.id("btnAdd")).click();

		//Enter termination Reason Name
		driver.findElement(By.id("report_report_name")).sendKeys(ReportsName);
		
		
		driver.findElement(By.id("btnAddDisplayField")).click();
		
		driver.findElement(By.id("display_group_1")).click();
		//click to Save button
		driver.findElement(By.id("btnSave")).click();
	}	
	public static void Search_Employee_Reports(String ReportsName)
	{
		//click PIM menu
		driver.findElement(By.id("menu_pim_viewPimModule")).click();

 		//click Reports Menu
		driver.findElement(By.id("menu_core_viewDefinedPredefinedReports")).click();

		//Enter Reports Name
		driver.findElement(By.id("search_search")).sendKeys(ReportsName);

		//click to Search button
		driver.findElement(By.xpath("//*[@id=\"searchForm\"]/fieldset/p/input[1]")).click();
	}
	
}