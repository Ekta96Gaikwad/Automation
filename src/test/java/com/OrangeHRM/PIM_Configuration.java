package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.OrangeHRM.BaseClass;

public class PIM_Configuration extends BaseClass
{
	/*
	 * public static void main(String[] args) { //launch Browser
	 * launchBrowser("Chrome");
	 * 
	 * // driver.manage().window().maximize();
	 * driver.get("https://opensource-demo.orangehrmlive.com/");
	 * 
	 * //Valid username valid password LoginPage.Login_Method("Admin","admin123");
	 * 
	 * // Add_Custom_Fields("FieldName");//Done
	 * 
	 * // Add_Reporting_Method("INdirectly");//Done
	 * 
	 * // Add_TerminationReasons("Add_TerminationReasons");//Done }
	 */
	public static void PIM_Configuration_Add_TerminationReasons(String Name)
	{
		//click PIM menu
		driver.findElement(By.id("menu_pim_viewPimModule")).click();

		//click Configuration menu
		driver.findElement(By.id("menu_pim_Configuration")).click();

		//click Termination Reasons
		driver.findElement(By.id("menu_pim_viewTerminationReasons")).click();
		
		//click Add Button
		driver.findElement(By.id("btnAdd")).click();

		//Enter termination Reason Name
		driver.findElement(By.id("terminationReason_name")).sendKeys(Name);
		
		//click to Save button
		driver.findElement(By.id("btnSave")).click();
	}
	public static void PIM_Configuration_Add_Reporting_Method(String Name)
	{
		//click PIM menu
		driver.findElement(By.id("menu_pim_viewPimModule")).click();

		//click Configuration menu
		driver.findElement(By.id("menu_pim_Configuration")).click();

		//click ReportingMethods
		driver.findElement(By.id("menu_pim_viewReportingMethods")).click();
		
		//click Add Button
		driver.findElement(By.id("btnAdd")).click();

		//Enter Reporting Method Name
		driver.findElement(By.id("reportingMethod_name")).sendKeys(Name);
		
		//click to Save button
		driver.findElement(By.id("btnSave")).click();
	}
	public static void PIM_Configuration_Add_Custom_Fields(String FieldName)
	{
		//click PIM menu
		driver.findElement(By.id("menu_pim_viewPimModule")).click();

		//click Configuration menu
		driver.findElement(By.id("menu_pim_Configuration")).click();

		//click CustomFields Fields
		driver.findElement(By.id("menu_pim_listCustomFields")).click();
		
		//click Add Button
		driver.findElement(By.id("buttonAdd")).click();

		//Enter CustomField Name
		driver.findElement(By.id("customField_name")).sendKeys(FieldName);
				
		//Screen DropDown list select by text
		WebElement ScreenDropDownList=driver.findElement(By.id("customField_screen"));
		Select select=new Select(ScreenDropDownList);
		select.selectByIndex(2);
		
		//Screen DropDown list select by text
		WebElement TypeDropDownList=driver.findElement(By.id("customField_type"));
		Select select1=new Select(TypeDropDownList);
		select1.selectByIndex(1);
				
		//click to Save button
		driver.findElement(By.id("btnSave")).click();
	}
}