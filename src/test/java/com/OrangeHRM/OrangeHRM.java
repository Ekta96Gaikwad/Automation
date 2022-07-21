
package com.OrangeHRM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM extends BaseClass
{
	static WebDriver driver;
	
	//static WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	
	String FirstName="EKTA";
	String MiddleName="Ramesh";
	String LastName="Gaikwad";
	String Emp_Id="123123";
	
	public static void launchBrowser(String browserName)
	{
		switch(browserName)
		{
			case "Chrome":
				/*System.setProperty("webdriver.chrome.driver","G:\\CYBER\\Software\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/");
				 */
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/");
				break;
			case "Mozilla":
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/");
				break;
			case "edge" :
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/");
				break;
			default:
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/");
		}
	}
	public static void Emp_Login(String UserName,String Password)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		driver.findElement(By.id("btnLogin")).click();
		try
		{
			driver.findElement(By.id("menu_pim_viewPimModule")).isDisplayed();
			System.out.println("User Successfully Loginned");
		}
		catch(Exception e)
		{
			System.out.println("Invaild Credential");
		}
	}
	public static void AddEmp(String FirstName,String MiddleName,String LastName)
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
		EmpSearch(FirstName,Emp_Id);
		
	}
	public static void EmpSearch(String FirstName,String Emp_Id)
	{
		//click on Emp_List Menu
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		/*WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("empsearch_employee_name_empName")));
		*/
		WebElement empSearchName=driver.findElement(By.id("empsearch_employee_name_empName"));
		Util.fluentWait(empSearchName);
		
		driver.findElement(By.xpath("//*[@id=\"empsearch_employee_name_empName\"]")).sendKeys(FirstName);
		driver.findElement(By.id("empsearch_id")).sendKeys(Emp_Id);	
		driver.findElement(By.id("searchBtn")).click();
		System.out.println("Searching for user");
	}
	public static void ForgotPassword(String username)
	{

		driver.findElement(By.xpath("//*[@id=\"forgotPasswordLink\"]/a")).click();
		driver.findElement(By.id("securityAuthentication_userName")).sendKeys(username);
		driver.findElement(By.id("btnSearchValues")).click();
		
	}
	public static void DeleteUser()
	{
		WebElement CheckBox=driver.findElement(By.id("ohrmList_chkSelectAll"));
		//driver.findElement(By.id("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr/td[1]/input")).isSelected();
		
		if(CheckBox.isSelected()==true)
		{
			//select check box
			driver.findElement(By.id("btnDelete")).click();
			System.out.println("Check box selected");
			//click delete dialog box
			driver.findElement(By.id("dialogDeleteBtn")).click();
			System.out.println("User Deleted");

		}
		else
		{
			System.out.println("Check box selected");
			driver.findElement(By.id("ohrmList_chkSelectAll")).click();
			driver.findElement(By.id("btnDelete")).click();
			//click delete dialog box
			driver.findElement(By.id("dialogDeleteBtn")).click();
			System.out.println("User Deleted");
		}
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
	public static void PIM_Include_DropDownList()
	{
		//click on Emp_List Menu
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
				
		WebElement PIMIncludeDropDownList=driver.findElement(By.id("empsearch_termination"));
		Select select=new Select(PIMIncludeDropDownList);
		select.selectByIndex(2);
		
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
	public static void PIM_JobTitle_DropDownList()
	{
		//click on Emp_List Menu
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
				
		WebElement PIMJobTitleDropDownList=driver.findElement(By.id("empsearch_job_title"));
		Select select=new Select(PIMJobTitleDropDownList);
		select.selectByIndex(3);
		
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
		select.selectByIndex(2);
		
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
		select.selectByIndex(0);
		
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
	}
	public static void Recruitment_Method_of_Application_DropDownList()
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
	public static void Emp_LogOut()
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			driver.findElement(By.id("welcome")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout")));
			driver.findElement(By.linkText("Logout")).click();
			System.out.println("Successfully Log Outed");
		}
		catch(Exception e)
		{
			System.out.println("Invalid credintial "+e);
		}
	}
	public static void main(String[] args) throws Exception 
	{
		
		//launch Browser
		launchBrowser("Chrome");
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//InValid username Invalid password
		Emp_Login("123Admin","PAss");
		
		//Valid username Invalid password
		Emp_Login("Admin","PA12ss");
		
		//InValid username valid password
		Emp_Login("Admin123","Admin123");
		
		ForgotPassword("Ekta");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

		
		//Valid username valid password
		Emp_Login("Admin","admin123");
				
		//Add Employee 
		AddEmp("Ekta","Ramesh","Gaikwad"); 
	
		Recruitment_Method_of_Application_DropDownList();
		
		DeleteUser();
		
		Emp_LogOut();
	}
}