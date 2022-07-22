package com.OrangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PIM_EMP_List extends BaseClass
{
	public static void main(String[] args) throws Exception 
	{
		//launch Browser 
		launchBrowser("Chrome");
		
		// driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Valid username valid password 
		LoginTC.Login("Admin","admin123");
	
		Add_Emp("Admin","ADMIN","ADMIN!");
	}
	public static void Add_Emp(String FirstName,String MiddleName,String LastName) throws Exception
	{
		//click on Emp_List Menu
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		//click on Add button
		driver.findElement(By.id("btnAdd")).click();
		
		/*String FirstName="EKTA";
		String MiddleName="Ramesh";
		String LastName="Gaikwad";
		String Emp_Id="123123";*/
		
		driver.findElement(By.id("firstName")).sendKeys(FirstName);
		driver.findElement(By.id("middleName")).sendKeys(MiddleName);
		driver.findElement(By.id("lastName")).sendKeys(LastName);
		
		//driver.findElement(By.id("employeeId")).sendKeys();
		String Emp_Id=driver.findElement(By.id("employeeId")).getAttribute("value");
		System.out.println("Emp ID "+Emp_Id);
		driver.findElement(By.id("btnSave")).click();
		
		System.out.println("User Created");
		
	//	return(Emp_Id);
		Search_EMP(FirstName,Emp_Id);
		
	}
	public static void Search_EMP(String FirstName,String Emp_Id) throws Exception
	{
		//click on Emp_List Menu
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		/*WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("empsearch_employee_name_empName")));
		*/
		WebElement empSearchName=driver.findElement(By.id("empsearch_employee_name_empName"));
		Util.fluentWait(empSearchName);
		
		driver.findElement(By.id("empsearch_employee_name_empName")).clear();
		driver.findElement(By.id("empsearch_employee_name_empName")).click(); 
		
		driver.findElement(By.xpath("//*[@id=\"empsearch_employee_name_empName\"]")).sendKeys(FirstName);
		driver.findElement(By.id("empsearch_id")).sendKeys(Emp_Id);	
		
		PIM_Emp_Status_DropDownList();
		
		PIM_Include_DropDownList();
		
		PIM_JobTitle_DropDownList();
		
		PIM_Sub_Unit_DropDownList();
			
		driver.findElement(By.id("searchBtn")).click();
		
		System.out.println("Searching for user");
	}
	public static void PIM_Emp_Status_DropDownList() throws Exception
	{
		//click on Emp_List Menu
//		driver.findElement(By.id("menu_pim_viewPimModule")).click();
				
		WebElement PIMEmpStatusDropDownList=driver.findElement(By.id("empsearch_employee_status"));
		Select select=new Select(PIMEmpStatusDropDownList);
		select.selectByIndex(1);
		//select.selectByVisibleText("Full-Time Permanent");
		
		List<WebElement> allSelectedOptions=select.getAllSelectedOptions();
		for(WebElement element:allSelectedOptions)
		{
			System.out.println(element.getText());
		}
		/*
		 * List<WebElement> allDropDownValues=select.getOptions(); for(WebElement
		 * element:allDropDownValues) { System.out.println(element.getText());
		 * if(element.getText().equals("Part-Time Contract")) {
		 * System.out.println("inside if condition"); throw new
		 * Exception("Part-Time Contract is present inside Employee Satus DropDown"); }
		 * }
		 */
	}

	public static void PIM_Include_DropDownList()
	{
		//click on Emp_List Menu
//		driver.findElement(By.id("menu_pim_viewPimModule")).click();
				
		WebElement PIMIncludeDropDownList=driver.findElement(By.id("empsearch_termination"));
		Select select=new Select(PIMIncludeDropDownList);
		select.selectByIndex(2);
		
		List<WebElement> allSelectedOptions=select.getAllSelectedOptions();
		for(WebElement element:allSelectedOptions)
		{
			System.out.println(element.getText());
		}
		/*	List<WebElement> allDropDownValues=select.getOptions();
		for(WebElement element:allDropDownValues)
		{
			System.out.println(element.getText());
			if(element.getText().equals("Past Employees Only"))
			{
				System.out.println("inside if condition");
				System.out.println("Past Employees Only is present inside Include DropDown");
			}
			
		}
		*/	
	}
	public static void PIM_JobTitle_DropDownList()
	{
		//click on Emp_List Menu
//		driver.findElement(By.id("menu_pim_viewPimModule")).click();
				
		WebElement PIMJobTitleDropDownList=driver.findElement(By.id("empsearch_job_title"));
		Select select=new Select(PIMJobTitleDropDownList);
		select.selectByIndex(3);
		
		List<WebElement> allSelectedOptions=select.getAllSelectedOptions();
		for(WebElement element:allSelectedOptions)
		{
			System.out.println(element.getText());
		}
		/*
		 * List<WebElement> allDropDownValues=select.getOptions(); for(WebElement
		 * element:allDropDownValues) { System.out.println(element.getText());
		 * if(element.getText().equals("Past Employees Only")) {
		 * System.out.println("inside if condition"); System.out.
		 * println("Customer Success Manager Only is present inside Job Title DropDown"
		 * ); }
		 * 
		 * }
		 */	
	}
	public static void PIM_Sub_Unit_DropDownList()
	{
		//click on Emp_List Menu
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
				
		WebElement PIMSubUnitDropDownList=driver.findElement(By.id("empsearch_sub_unit"));
		Select select=new Select(PIMSubUnitDropDownList);
		select.selectByIndex(2);
		
		List<WebElement> allSelectedOptions=select.getAllSelectedOptions();
		for(WebElement element:allSelectedOptions)
		{
			System.out.println(element.getText());
		}
	}
		/*List<WebElement> allDropDownValues=select.getOptions();
		for(WebElement element:allDropDownValues)
		{
			System.out.println(element.getText());
			if(element.getText().equals("  Quality Assurance"))
			{
				System.out.println("inside if condition");
				System.out.println("  Quality Assurance Only is present inside Sub Unit DropDown");
			}
			
		}
	}*/
	public static void Delete_Emp()
	{
		//click on delete Menu
		driver.findElement(By.id("btnDelete")).click();
		
//		driver.findElement(By.id("ohrmList_chkSelectRecord_11")).click();
//		WebElement deletejobTitleCheckBox=driver.findElement(By.xpath("//tr[@class=\"odd\"]/descendant::td[1]s"));
//		driver.findElement(By.xpath("//tr[@class=\"odd\"]/descendant::td[1]")).click();
		List <WebElement> userList=driver.findElements(By.xpath("//tr[@class=\"odd\"]/descendant::td[1]/input"));
		for(WebElement element:userList)
		{
			String nameresultDetails=element.getText();
			System.out.println(nameresultDetails+" name");
//			System.out.println("******************************************************************");
				
		}
		/*
		 * if(deletejobTitleCheckBox.isSelected()==true) { //select check box //
		 * driver.findElement(By.id("btnDelete")).click();
		 * System.out.println("Check box selected"); //click delete dialog box //
		 * driver.findElement(By.id("dialogDeleteBtn")).click();
		 * System.out.println("User Deleted");
		 * 
		 * } else { System.out.println("Check box Not selected"); //
		 * driver.findElement(By.id("ohrmList_chkSelectAll")).click(); //
		 * driver.findElement(By.id("btnDelete")).click(); // //click delete dialog box
		 * // driver.findElement(By.id("dialogDeleteBtn")).click(); //
		 * System.out.println("User Deleted"); }
		 */	
	}
}