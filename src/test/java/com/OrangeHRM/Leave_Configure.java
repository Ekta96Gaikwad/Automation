package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Leave_Configure extends BaseClass
{
	public static void main(String[] args) throws Exception 
	{
		// launch Browser
		launchBrowser("Chrome");

		// driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// Valid username valid password
		LoginTC.Login("Admin", "admin123");

		Leave_Period();
	}

	public static void Leave_Period()
	{
		// click Leave menu
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();

		// click Reports
		driver.findElement(By.id("menu_leave_Reports")).click();

		// click leave view My Leave Balance Report Menu
		driver.findElement(By.id("menu_leave_viewMyLeaveBalanceReport")).click();

		//View button click
		driver.findElement(By.id("btnEdit")).click();

		// leaveperiod_cmbStartMonth DropDown list select (by index)
		WebElement StartMonthDropDownList = driver.findElement(By.id("leaveperiod_cmbStartMonth"));
		Select select = new Select(StartMonthDropDownList);
		select.selectByVisibleText("March");
		
		// leaveperiod_cmbStartMonth DropDown list select (by index)
		WebElement StartDateDropDownList = driver.findElement(By.id("leaveperiod_cmbStartDate"));
		Select select1 = new Select(StartDateDropDownList);
		select1.selectByVisibleText("Start Date");
	
		WebElement selected=select.getFirstSelectedOption();
		System.out.println("Selected text in Start Month drop down list"+selected.getText());

		WebElement selected1=select1.getFirstSelectedOption();
		System.out.println("Selected text in Start Date drop down list"+selected.getText());

		driver.findElement(By.id("btnEdit")).click();
	}
}