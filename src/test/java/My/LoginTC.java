package My;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTC {
	static WebDriver dr;
	
	public static void Login(String Username,String Password)
	{
		System.out.println("User Name "+Username+" Password "+Password);

		//Enter Log in Details
		dr.findElement(By.id("txtUsername")).sendKeys(Username);
		dr.findElement(By.id("txtPassword")).sendKeys(Password);
		dr.findElement(By.id("btnLogin")).click();
		
		/*
		WebElement Validation_Message=dr.findElement(By.id("spanMessage"));
		
		if(Validation_Message.isDisplayed())
		{
			System.out.println("Not Logged In");
		}
		else 
		{
			System.out.println(" Logged In");
		}
		*/
}

	public static void main(String[] args) 
	{
		//connect to WebDriver
		System.setProperty("webdriver.chrome.driver","G:\\CYBER\\Software\\chromedriver.exe");
		
		//Open Google Chrome
		dr=new ChromeDriver();
		dr.get("https://opensource-demo.orangehrmlive.com/");
		
		//InValid username Invalid password
		Login("123Admin","PAss");
		
		//Valid username Invalid password
		Login("Admin","PA12ss");
		
		//InValid username valid password
		Login("Admin123","Admin123");
		
		//Valid username valid password
		Login("Admin","admin123");
		
		//Click on PIM Menu
		dr.findElement(By.id("menu_pim_viewPimModule")).click();
		
		//To get Current URL
		String Current_URL=dr.getCurrentUrl();
		System.out.println("Current URL Is "+Current_URL);
		/*if(Current_URL=="https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList")
		{
			System.out.println(" Employee List  Page Displayed ");
		}
		else
		{
			System.out.println("Employee List  Page not Displayed ");
		}
		*/
		//To Open Add Menu
		dr.findElement(By.id("btnAdd")).click();
		/*
		String Current_URL1=dr.getCurrentUrl();
		if(Current_URL1=="https://opensource-demo.orangehrmlive.com/index.php/pim/addEmployee")
		{
			System.out.println("Add Employee Page Displayed ");
		}
		else
		{
			System.out.println("Add Employee Page not Displayed ");
		}
		*/
		
		String FirstName="EKTA";
		String MiddleName="Ramesh";
		String LastName="Gaikwad";
		String Emp_Id="123123";
		
		//enter User details in text Box
		dr.findElement(By.id("firstName")).sendKeys(FirstName);
		dr.findElement(By.id("middleName")).sendKeys(MiddleName);
		dr.findElement(By.id("lastName")).sendKeys(LastName);
		dr.findElement(By.id("employeeId")).clear();
		dr.findElement(By.id("employeeId")).sendKeys(Emp_Id);
		
		//click on save button
		dr.findElement(By.id("btnSave")).click();
		
		System.out.println("User Created");

		//click on employee list menu to view all employee
		dr.findElement(By.id("menu_pim_viewEmployeeList")).click();
	
		/*
		WebElement UserName_TB=dr.findElement(By.xpath("//*[@id=\"empsearch_employee_name_empName\"]"));
		if(UserName_TB.isSelected())
		{
			System.out.println("Text Was Selected");
		}
		else 
		{
			System.out.println("Text Was not Selected");
		}
		*/
		//1st clear text box cause it contain Space Holder then fill employee name and ID in text box
		
		//dr.findElement(By.id("empsearch[employee_name][empName]")).clear();
		dr.findElement(By.xpath("//*[@id=\"empsearch_employee_name_empName\"]")).clear();
		dr.findElement(By.xpath("//*[@id=\"empsearch_employee_name_empName\"]")).sendKeys(FirstName);
		
		dr.findElement(By.id("empsearch_id")).clear();
		dr.findElement(By.id("empsearch_id")).sendKeys(Emp_Id);	
		
		//Click On Search Button
		dr.findElement(By.id("searchBtn")).click();
		
		//System.out.println("Searching for user");
		
		//dr.findElement(By.id("ohrmList_chkSelectRecord_88")).
		}
}