package com.OrangeHRM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Admin_UserManagement extends BaseClass 
{
	public static void main(String args[]) throws Exception
	{
		 
		 //launch Browser 
		launchBrowser("Chrome");
		 
		// driver.manage().window().maximize();
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		  
		 //Valid username valid password 
		 LoginTC.Login("Admin","admin123");
	
		 Search_System_Users("Admin");
		
	}
	public static void Search_System_Users(String empName) throws Exception
	{
		//click on Admin_List Menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("searchSystemUser_userName")));
		
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(empName);

		//System.out.println(driver.findElement(By.id("searchSystemUser_userName")).getAttribute("value"));
		
		//select drop down list
		Admin_UserRole_DropDownList();
				
		//driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys(empName);	
		Admin_SearchSystemUser_status_DropDownList();
		
		driver.findElement(By.id("searchBtn")).click();
//		System.out.println("After button "+driver.findElement(By.id("searchSystemUser_userName")).getAttribute("value"));
		
		System.out.println("Searching for user");
	}
	public static void Admin_UserRole_DropDownList() throws Exception
	{
		//click on Emp_List Menu
//		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
				
		WebElement AdminUserRoleDropDownList=driver.findElement(By.id("searchSystemUser_userType"));
		
		Select select=new Select(AdminUserRoleDropDownList);
//		select.selectByIndex(1);
		
		select.selectByVisibleText("Admin");
		
		List<WebElement> allSelectedOptions=select.getAllSelectedOptions();
		for(WebElement element:allSelectedOptions)
		{
			System.out.println("Selected Option is "+element.getText());
		}
	}
	public static void Admin_SearchSystemUser_status_DropDownList() throws Exception
	{
		//click on Emp_List Menu
//		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
				
		WebElement AdminSearchSystemUserStatusDropDownList=driver.findElement(By.id("searchSystemUser_status"));
		
		Select select=new Select(AdminSearchSystemUserStatusDropDownList);
//		select.selectByIndex(1);
		
		select.selectByVisibleText("Enabled");
		
		List<WebElement> allSelectedOptions=select.getAllSelectedOptions();
		for(WebElement element:allSelectedOptions)
		{
			System.out.println("Selected Option is "+element.getText());
		}
	}
}