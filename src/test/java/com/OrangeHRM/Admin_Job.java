package com.OrangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Admin_Job extends BaseClass
{
	public static void main(String arg[])
	{

		//launch Browser
		launchBrowser("Chrome");
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");

		//Valid username valid password
		LoginTC.Login("Admin","admin123");

//		Job.add_job_Title("JOBTitle11","JOBDesc111","JOBNot11e");//Done
		
//		Job.delete_job_Title();
		
//		Job.add_pay_grade("PG112");//Done
		
//		Job.delete_pay_grade();
		
//		Job.add_Employment_Status("EmpStaus123");//Done

//		Job.delete_Employment_Status();

//		Job.add_Job_Categories("Job Catogories123");//Done
		
//		Job.delete_Job_Categories();
		
//		Job.add_Work_Shifts("WorkShift123");
		
//		Job.delete_Work_Shifts();
		
//		driver.quit();
	}
	public static void add_job_Title(String JobTitle,String JobDesc,String JobNote)
	{
		//click Admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		
		//click Job menu
		driver.findElement(By.id("menu_admin_Job")).click();

		//click Job Titles menu
		driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
		
		//click Add Button
		driver.findElement(By.id("btnAdd")).click();
		
		//Add Job Title
		driver.findElement(By.id("jobTitle_jobTitle")).sendKeys(JobTitle);

		//Add JobDesc Title
		driver.findElement(By.id("jobTitle_jobDescription")).sendKeys(JobDesc);

		//Add JobNote Title
		driver.findElement(By.id("jobTitle_note")).sendKeys(JobNote);
		
		//Click on Add Button
		driver.findElement(By.id("btnSave")).click();
		
		System.out.println(JobTitle+JobDesc+JobNote+" Added");
	}
	public static void delete_job_Title()
	{
		//click Admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		
		//click Job menu
		driver.findElement(By.id("menu_admin_Job")).click();

		//click Job Titles menu
		driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
		
		//click Delete Button
		driver.findElement(By.id("btnDelete")).click();
		
		//Select Job Title check box for delete
		driver.findElement(By.id("ohrmList_chkSelectRecord_11")).click();
				
		//Click on Delete Button
		driver.findElement(By.id("btnDelete")).click();	
		
		//click OK On Dialog Box
		driver.findElement(By.id("dialogDeleteBtn")).click();
	
	}
	public static void add_pay_grade(String PayGradeName)
	{
		//click Admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
			
		//click Job menu
		driver.findElement(By.id("menu_admin_Job")).click();

		//click PayGrades menu
		driver.findElement(By.id("menu_admin_viewPayGrades")).click();

		//click Add Button
		driver.findElement(By.id("btnAdd")).click();
		
		//Enter Name Of Pay Grade
		driver.findElement(By.id("payGrade_name")).sendKeys(PayGradeName);
		
		//click Save Button
		driver.findElement(By.id("btnSave")).click();

		System.out.println(PayGradeName+" Added");
		
		add_Currency("INR - Indian Rupee","10","15230");	
		
	}
	public static void add_Currency(String Currency,String MINCurrency,String MAXCurrency)
	{
//		String Currency="INR - Indian Rupee";
		
		//click Add Button
		driver.findElement(By.id("btnAddCurrency")).click();
		
		//Enter Name Of Currency
		driver.findElement(By.id("payGradeCurrency_currencyName")).sendKeys(Currency);
		
		//Enter MINCurrency
		driver.findElement(By.id("payGradeCurrency_minSalary")).sendKeys(MINCurrency);
		
		//Enter MAXCurrency
		driver.findElement(By.id("payGradeCurrency_maxSalary")).sendKeys(MAXCurrency);
				
		//click Save Button
		driver.findElement(By.id("btnSaveCurrency")).click();

		System.out.println(Currency+" "+MINCurrency+" "+ MAXCurrency+" Added");
		
		delete_Currency();	
	}
	public static void delete_Currency()
	{
		
		//Select Pay Grade check box for delete
		driver.findElement(By.name("delCurrencies[]")).click();
		
		//click Delete Button
		driver.findElement(By.id("btnDelete")).click();
				
		//click OK On Dialog Box
		driver.findElement(By.id("dialogDeleteBtn")).click();
	
	}
	public static void delete_pay_grade()
	{
		//click Admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
			
		//click Job menu
		driver.findElement(By.id("menu_admin_Job")).click();

		//click PayGrades menu
		driver.findElement(By.id("menu_admin_viewPayGrades")).click();

		//click delete Button
		driver.findElement(By.id("btnDelete")).click();
		
		//Select Pay Grade check box for delete
		driver.findElement(By.id("ohrmList_chkSelectRecord_1")).click();
		
		//click Delete Button
		driver.findElement(By.id("btnDelete")).click();
				
		//click OK On Dialog Box
		driver.findElement(By.id("dialogDeleteBtn")).click();
	
	}
	public static void add_Employment_Status(String EmpStatusName)
	{
		//click Admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
			
		//click Job menu
		driver.findElement(By.id("menu_admin_Job")).click();

		//click employmentStatus menu
		driver.findElement(By.id("menu_admin_employmentStatus")).click();

		//click Add Button
		driver.findElement(By.id("btnAdd")).click();
		
		//Enter Name Of Emp Status
		driver.findElement(By.id("empStatus_name")).sendKeys(EmpStatusName);
		
		//click Save Button
		driver.findElement(By.id("btnSave")).click();

		System.out.println(EmpStatusName+" Added");

	}
	public static void delete_Employment_Status()
	{
		//click Admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
			
		//click Job menu
		driver.findElement(By.id("menu_admin_Job")).click();

		//click employmentStatus menu
		driver.findElement(By.id("menu_admin_employmentStatus")).click();

		//click delete Button
		driver.findElement(By.id("btnDelete")).click();
		
		//Select Emp Status Name check box for delete
		driver.findElement(By.id("ohrmList_chkSelectRecord_1")).click();
		
		//click Save Button
		driver.findElement(By.id("btnDelete")).click();

		//click OK On Dialog Box
		driver.findElement(By.id("dialogDeleteBtn")).click();
	}	
	public static void add_Job_Categories(String JobCategoriesName)
	{
		//click Admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
			
		//click Job menu
		driver.findElement(By.id("menu_admin_Job")).click();

		//click JobCategories menu
		driver.findElement(By.id("menu_admin_jobCategory")).click();

		//click Add Button
		driver.findElement(By.id("btnAdd")).click();
		
		//Enter Name Of Emp Status
		driver.findElement(By.id("jobCategory_name")).sendKeys(JobCategoriesName);
		
		//click Save Button
		driver.findElement(By.id("btnSave")).click();
		
		System.out.println(JobCategoriesName+" Added");
	}
	public static void delete_Job_Categories()
	{
		//click Admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
			
		//click Job menu
		driver.findElement(By.id("menu_admin_Job")).click();

		//click JobCategories menu
		driver.findElement(By.id("menu_admin_jobCategory")).click();

		//Select Job Category Name check box for delete
		driver.findElement(By.id("ohrmList_chkSelectRecord_1")).click();
		
		//click delete Button
		driver.findElement(By.id("btnDelete")).click();
				
		//click OK On Dialog Box
		driver.findElement(By.id("dialogDeleteBtn")).click();
	}
	public static void add_Work_Shifts(String WorkShiftsName)
	{
		//click Admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
			
		//click Job menu
		driver.findElement(By.id("menu_admin_Job")).click();

		//click workShift menu
		driver.findElement(By.id("menu_admin_workShift")).click();

		//click Add Button
		driver.findElement(By.id("btnAdd")).click();
		
		//Enter Name Of workShift name
		driver.findElement(By.id("workShift_name")).sendKeys(WorkShiftsName);
		
		WebElement workShift_availableEmpDropDownList=driver.findElement(By.id("workShift_availableEmp"));
		Select select=new Select(workShift_availableEmpDropDownList);
		
		List<WebElement> AllworkShift_availableEmpList=select.getOptions();
		System.out.println("AllworkShift_availableEmpList");
		for(WebElement element:AllworkShift_availableEmpList)
		{
			System.out.println(element.getText());
		}
	
		select.selectByIndex(1);
		//click Add>>> Button
		driver.findElement(By.id("btnAssignEmployee")).click();
			
		select.selectByIndex(1);
		//click Add>>> Button
		driver.findElement(By.id("btnAssignEmployee")).click();
		
		select.selectByIndex(1);
		//click Add>>> Button
		driver.findElement(By.id("btnAssignEmployee")).click();
		
		WebElement workShift_Assigned_Employees=driver.findElement(By.id("workShift_availableEmp"));
		Select select1=new Select(workShift_Assigned_Employees);
		List<WebElement> workShift_Assigned_EmployeesList=select1.getOptions();

		select1.selectByIndex(1);
		//click Remov<<< Button
		driver.findElement(By.id("btnRemoveEmployee")).click();
		
		select1.selectByIndex(1);
		//click Remov<<< Button
		driver.findElement(By.id("btnRemoveEmployee")).click();
		
		System.out.println("workShift_Assigned_EmployeesList");
		
		for(WebElement element:workShift_Assigned_EmployeesList)
		{
			System.out.println(element.getText());			
		}	
							
		//click Save Button
		driver.findElement(By.id("btnSave")).click();

		System.out.println(WorkShiftsName+" Added");
	}
	public static void delete_Work_Shifts()
	{
		//click Admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
			
		//click Job menu
		driver.findElement(By.id("menu_admin_Job")).click();

		//click Work Shift menu
		driver.findElement(By.id("menu_admin_workShift")).click();

		//Select Work Shift Name check box for delete
		driver.findElement(By.id("ohrmList_chkSelectRecord_1")).click();
		
		//click delete Button
		driver.findElement(By.id("btnDelete")).click();
				
		//click OK On Dialog Box
		driver.findElement(By.id("dialogDeleteBtn")).click();
	}
}