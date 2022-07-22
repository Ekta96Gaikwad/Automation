package com.OrangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Leave_Report extends BaseClass
{
	public static void main(String[] args) throws Exception 
	{
		// launch Browser
		launchBrowser("Chrome");

		// driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// Valid username valid password
		LoginTC.Login("Admin", "admin123");

//		Leave_Entitlements_and_Usage_Report();//Done
		
		My_Leave_Entitlements_and_Usage_Report();
		
	}

	public static void My_Leave_Entitlements_and_Usage_Report()
	{
		// click Leave menu
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();

		// click Reports
		driver.findElement(By.id("menu_leave_Reports")).click();

		// click leave view My Leave Balance Report Menu
		driver.findElement(By.id("menu_leave_viewMyLeaveBalanceReport")).click();

		// period DropDown list select (by index)
		WebElement fromDropDownList = driver.findElement(By.id("period"));
		Select select = new Select(fromDropDownList);
		select.selectByIndex(1);
	
		WebElement selected=select.getFirstSelectedOption();
		System.out.println("Selected text in drop down list"+selected.getText());

		driver.findElement(By.id("viewBtn")).click();
	}
	public static void Leave_Entitlements_and_Usage_Report()
	{
		// click Leave menu
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();

		// click Reports
		driver.findElement(By.id("menu_leave_Reports")).click();

		// click Leave Entitlements and Usage Report
		driver.findElement(By.id("menu_leave_viewLeaveBalanceReport")).click();


		// leave_balance_report_type DropDown list select by text
		WebElement leave_balance_report_typeDropDownList = driver.findElement(By.id("leave_balance_report_type"));
		Select select = new Select(leave_balance_report_typeDropDownList);
		select.selectByVisibleText("Employee");
		
//		List<WebElement> allDropDownValues=select.getOptions();
//		for(WebElement element:allDropDownValues)
//		{
//			System.out.println(element.getText());
			WebElement selected=select.getFirstSelectedOption();
			if(selected.getText().equals("Leave Type"))
			{
				leave_balance_leave_type();
			}
			else
			{
				leave_balance_employee_empName("Admin");
			}
		
	}
	public static void leave_balance_employee_empName(String EMPName)
	{
		driver.findElement(By.id("leave_balance_employee_empName")).clear();
		
		driver.findElement(By.id("leave_balance_employee_empName")).sendKeys(EMPName);
		
		System.out.println(EMPName);
		// From DropDown list select by text
		WebElement periodDropDownList = driver.findElement(By.id("period"));
		Select periodDropDownListselect = new Select(periodDropDownList);
		periodDropDownListselect.selectByIndex(1);
		
		driver.findElement(By.id("viewBtn")).click();

	}
	public static void leave_balance_leave_type()
	{
		// leave_balance_report_type DropDown list select by text
		WebElement leave_balance_report_typeDropDownList = driver.findElement(By.id("leave_balance_leave_type"));
		Select leave_balance_report_typeDropDownListselect = new Select(leave_balance_report_typeDropDownList);
		leave_balance_report_typeDropDownListselect.selectByIndex(1);

		// From DropDown list select by text
		WebElement periodDropDownList = driver.findElement(By.id("period"));
		Select periodDropDownListselect = new Select(periodDropDownList);
		periodDropDownListselect.selectByIndex(1);
		
		// Job Title DropDown list select by text
		WebElement leave_balance_job_titleDropDownList = driver.findElement(By.id("leave_balance_job_title"));
		Select leave_balance_job_titleDropDownListselect = new Select(leave_balance_job_titleDropDownList);
		leave_balance_job_titleDropDownListselect.selectByVisibleText("Engineer");
		
		// Location DropDown list select by text
		WebElement leave_balance_locationDropDownList = driver.findElement(By.id("leave_balance_location"));
		Select leave_balance_locationDropDownListselect = new Select(leave_balance_locationDropDownList);
		leave_balance_locationDropDownListselect.selectByVisibleText("    New York Sales Office");
		
		// Sub Unit DropDown list select by text
		WebElement leave_balance_sub_unitDropDownList = driver.findElement(By.id("leave_balance_sub_unit"));
		Select leave_balance_sub_unitDropDownListselect = new Select(leave_balance_sub_unitDropDownList);
		leave_balance_sub_unitDropDownListselect.selectByVisibleText("Engineering");
		
		driver.findElement(By.id("viewBtn")).click();
	}

}