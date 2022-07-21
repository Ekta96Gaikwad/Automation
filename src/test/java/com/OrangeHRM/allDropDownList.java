package com.OrangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class allDropDownList extends BaseClass 
{

	public static void main(String[] args) {
//		WebDriver driver;
	}
	public static void PIM_Emp_Status_DropDownList() throws Exception
		{
			//click on Emp_List Menu
			driver.findElement(By.id("menu_pim_viewPimModule")).click();
					
			WebElement PIMEmpStatusDropDownList=driver.findElement(By.id("empsearch_employee_status"));
			Select select=new Select(PIMEmpStatusDropDownList);
			select.selectByIndex(1);
			//select.selectByVisibleText("Full-Time Permanent");
			
			List<WebElement> allSelectedOptions=select.getAllSelectedOptions();
			for(WebElement element:allSelectedOptions)
			{
				System.out.println(element.getText());
			}
			List<WebElement> allDropDownValues=select.getOptions();
			for(WebElement element:allDropDownValues)
			{
				System.out.println(element.getText());
				if(element.getText().equals("Part-Time Contract"))
				{
					System.out.println("inside if condition");
					throw new Exception("Part-Time Contract is present inside Employee Satus DropDown");
				}
				
			}
				
		}
		public static void PIM_Include_DropDownList1()
		{
			//click on Emp_List Menu
			driver.findElement(By.id("menu_pim_viewPimModule")).click();
					
			WebElement PIMIncludeDropDownList=driver.findElement(By.id("empsearch_termination"));
			Select select=new Select(PIMIncludeDropDownList);
			select.selectByIndex(1);
			
			List<WebElement> allSelectedOptions=select.getAllSelectedOptions();
			for(WebElement element:allSelectedOptions)
			{
				System.out.println(element.getText());
			}
			List<WebElement> allDropDownValues=select.getOptions();
			for(WebElement element:allDropDownValues)
			{
				System.out.println(element.getText());
				if(element.getText().equals("Past Employees Only"))
				{
					System.out.println("inside if condition");
					System.out.println("Past Employees Only is present inside Include DropDown");
				}
				
			}
				
		}
		public static void PIM_Include_DropDownList()
		{
			//click on Emp_List Menu
			driver.findElement(By.id("menu_pim_viewPimModule")).click();
					
			WebElement PIMJobTitleDropDownList=driver.findElement(By.id("empsearch_job_title"));
			Select select=new Select(PIMJobTitleDropDownList);
			select.selectByIndex(1);
			
			List<WebElement> allSelectedOptions=select.getAllSelectedOptions();
			for(WebElement element:allSelectedOptions)
			{
				System.out.println(element.getText());
			}
			List<WebElement> allDropDownValues=select.getOptions();
			for(WebElement element:allDropDownValues)
			{
				System.out.println(element.getText());
				if(element.getText().equals("Past Employees Only"))
				{
					System.out.println("inside if condition");
					System.out.println("Customer Success Manager Only is present inside Job Title DropDown");
				}
				
			}
				
		}
		public static void PIM_Sub_Unit_DropDownList()
		{
			//click on Emp_List Menu
			driver.findElement(By.id("menu_pim_viewPimModule")).click();
					
			WebElement PIMSubUnitDropDownList=driver.findElement(By.id("empsearch_sub_unit"));
			Select select=new Select(PIMSubUnitDropDownList);
			select.selectByIndex(1);
			
			List<WebElement> allSelectedOptions=select.getAllSelectedOptions();
			for(WebElement element:allSelectedOptions)
			{
				System.out.println(element.getText());
			}
			List<WebElement> allDropDownValues=select.getOptions();
			for(WebElement element:allDropDownValues)
			{
				System.out.println(element.getText());
				if(element.getText().equals("  Quality Assurance"))
				{
					System.out.println("inside if condition");
					System.out.println("  Quality Assurance Only is present inside Sub Unit DropDown");
				}
				
			}
		}
		public static void Leave_SubUnit_DropDownList()
		{
			//click on menu Leave Module Menu
			driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
					
			WebElement LeaveSubUnitDropDownList=driver.findElement(By.id("leaveList_cmbSubunit"));
			Select select=new Select(LeaveSubUnitDropDownList);
			select.selectByIndex(1);
			
			List<WebElement> allSelectedOptions=select.getAllSelectedOptions();
			for(WebElement element:allSelectedOptions)
			{
				System.out.println(element.getText());
			}
			List<WebElement> allDropDownValues=select.getOptions();
			for(WebElement element:allDropDownValues)
			{
				System.out.println(element.getText());
				if(element.getText().equals(" Development"))
				{
					System.out.println("inside if condition");
					System.out.println("   Development Only is present inside Leave Sub Unit Drop Down List");
				}
				
			}
		}
		public static void Recruitment_JobTitle_DropDownList()
		{
			//click on menu recruitment Menu
			driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
					
			WebElement RecruitmentJobTitleDropDownList=driver.findElement(By.id("candidateSearch_jobTitle"));
			Select select=new Select(RecruitmentJobTitleDropDownList);
			select.selectByIndex(1);
			
			List<WebElement> allSelectedOptions=select.getAllSelectedOptions();
			for(WebElement element:allSelectedOptions)
			{
				System.out.println(element.getText());
			}
			List<WebElement> allDropDownValues=select.getOptions();
			for(WebElement element:allDropDownValues)
			{
				System.out.println(element.getText());
				if(element.getText().equals("Database Administrator"))
				{
					System.out.println("inside if condition");
					System.out.println("Database Administrator Only is present inside Recruitment_JobTitle_DropDownList");
				}
				
			}
		}
		public static void Recruitment_Vacancy_DropDownList()
		{

			//click on menu recruitment Menu
			driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
					
			WebElement RecruitmentVacancyDropDownList=driver.findElement(By.id("candidateSearch_jobVacancy"));
			Select select=new Select(RecruitmentVacancyDropDownList);
			select.selectByIndex(1);
			
			List<WebElement> allSelectedOptions=select.getAllSelectedOptions();
			for(WebElement element:allSelectedOptions)
			{
				System.out.println(element.getText());
			}
			List<WebElement> allDropDownValues=select.getOptions();
			for(WebElement element:allDropDownValues)
			{
				System.out.println(element.getText());
				if(element.getText().equals("Senior QA Lead"))
				{
					System.out.println("inside if condition");
					System.out.println("Senior QA Lead Only is present inside Recruitment Vacancy Drop Down List");
				}
				
			}
		}
		public static void Recruitment_Hiring_Manager_DropDownList()
		{
			//click on menu recruitment Menu
			driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
					
			WebElement RecruitmentHiringManagerDropDownList=driver.findElement(By.id("candidateSearch_hiringManager"));
			Select select=new Select(RecruitmentHiringManagerDropDownList);
			select.selectByIndex(1);
			
			List<WebElement> allSelectedOptions=select.getAllSelectedOptions();
			for(WebElement element:allSelectedOptions)
			{
				System.out.println(element.getText());
			}
			List<WebElement> allDropDownValues=select.getOptions();
			for(WebElement element:allDropDownValues)
			{
				System.out.println(element.getText());
				if(element.getText().equals("Dominic Chase"))
				{
					System.out.println("inside if condition");
					System.out.println("Dominic Chase is present inside Recruitment Hiring Manager DropDownList");
				}
				
			}
		}
		public static void Recruitment_Status_DropDownList()
		{
			//click on menu recruitment Menu
			driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
					
			WebElement RecruitmentStatusDropDownList=driver.findElement(By.id("candidateSearch_hiringManager"));
			Select select=new Select(RecruitmentStatusDropDownList);
			select.selectByIndex(1);
			
			List<WebElement> allSelectedOptions=select.getAllSelectedOptions();
			for(WebElement element:allSelectedOptions)
			{
				System.out.println(element.getText());
			}
			List<WebElement> allDropDownValues=select.getOptions();
			for(WebElement element:allDropDownValues)
			{
				System.out.println(element.getText());
				if(element.getText().equals("Interview Scheduled"))
				{
					System.out.println("inside if condition");
					System.out.println("Interview Scheduled is present inside Recruitment Status DropDownList");
				}
				
			}
		}public static void Recruitment_Method_of_Application_DropDownList()
		{
			//click on menu recruitment Menu
			driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
					
			WebElement RecruitmentMethodofApplicationDropDownList=driver.findElement(By.id("candidateSearch_modeOfApplication"));
			Select select=new Select(RecruitmentMethodofApplicationDropDownList);
			select.selectByIndex(1);
			
			List<WebElement> allSelectedOptions=select.getAllSelectedOptions();
			for(WebElement element:allSelectedOptions)
			{
				System.out.println(element.getText());
			}
			List<WebElement> allDropDownValues=select.getOptions();
			for(WebElement element:allDropDownValues)
			{
				System.out.println(element.getText());
				if(element.getText().equals("Manual"))
				{
					System.out.println("inside if condition");
					System.out.println("Manual is present inside Recruitment_JobTitle_DropDownList");
				}
				
			}
		}
	
}