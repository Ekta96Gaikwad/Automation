package com.OrangeHRM;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Leave_Entitlements extends BaseClass 
{
	public static void main(String[] args) throws Exception 
	{
		// launch Browser
		launchBrowser("Chrome");

		// driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// Valid username valid password
		LoginTC.Login("Admin", "admin123");

//		Search_leave_Entitlements("a");//Done

//		Add_leave_Entitlements("Admin", "11");
		
//		My_Leave_Entitlements();//Done
		
	}
	public static void My_Leave_Entitlements()
	{
		// click Leave menu
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();

		// click Entitlements
		driver.findElement(By.id("menu_leave_Entitlements")).click();

		// click My Leave Entitlements
		driver.findElement(By.id("menu_leave_viewMyLeaveEntitlements")).click();


		// entitlements_leave_type DropDown list select by text
		WebElement entitlements_leave_typeDropDownList = driver.findElement(By.id("entitlements_leave_type"));
		Select select = new Select(entitlements_leave_typeDropDownList);
		select.selectByIndex(1);
		

		// entitlements_leave_type DropDown list select by text
		WebElement entitlements_leave_periodDropDownList = driver.findElement(By.id("period"));
		Select select1= new Select(entitlements_leave_periodDropDownList);
		select1.selectByIndex(1);
		
		// click to Search button
		driver.findElement(By.id("searchBtn")).click();		
	}
	public static void Add_leave_Entitlements(String Employee, String Entitlement) throws Exception 
	{
		// click Leave menu
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();

		// click Entitlements
		driver.findElement(By.id("menu_leave_Entitlements")).click();

		// click Add Entitlements
		driver.findElement(By.id("menu_leave_addLeaveEntitlement")).click();

		// clear TextField
		driver.findElement(By.id("entitlements_employee_empName")).click();
		driver.findElement(By.id("entitlements_employee_empName")).clear();

		// enter emp name
		driver.findElement(By.id("entitlements_employee_empName")).sendKeys(Employee);

		
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		
		// entitlements_leave_type DropDown list select by text
		WebElement entitlements_leave_typeDropDownList = driver.findElement(By.id("entitlements_leave_type"));
		Select select = new Select(entitlements_leave_typeDropDownList);
		select.selectByIndex(1);

		// periodDropDown list select by text
		WebElement periodDropDownList = driver.findElement(By.id("period"));
		Select select1 = new Select(periodDropDownList);
		select1.selectByIndex(1);

		driver.findElement(By.id("entitlements_entitlement")).sendKeys(Entitlement);

		System.out.println(driver.findElement(By.id("entitlements_employee_empName")).getAttribute("value"));

		// click to Save button
		driver.findElement(By.id("btnSave")).click();
	}

	public static void Search_leave_Entitlements(String Employee) throws Exception {
		// click Leave menu
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();

		// click Entitlements
		driver.findElement(By.id("menu_leave_Entitlements")).click();

		// click Employee Entitlements
		driver.findElement(By.id("menu_leave_viewLeaveEntitlements")).click();

		// clear TextField
		driver.findElement(By.xpath("//*[@id=\"entitlements_employee_empName\"]")).clear();

		// enter emp name
		driver.findElement(By.xpath("//*[@id=\"entitlements_employee_empName\"]")).sendKeys(Employee);

		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);

		// entitlements_leave_type DropDown list select by text
		WebElement entitlements_leave_typeDropDownList = driver.findElement(By.id("entitlements_leave_type"));
		Select select = new Select(entitlements_leave_typeDropDownList);
		select.selectByIndex(1);

		// periodDropDown list select by text
		WebElement periodDropDownList = driver.findElement(By.id("period"));
		Select select1 = new Select(periodDropDownList);
		select1.selectByIndex(1);

		// click Search Button
		driver.findElement(By.id("searchBtn")).click();

		// click to add button
//		driver.findElement(By.id("btnAdd")).click();
//		Add_leave_Entitlements("String Employee1");
	}
}