package My;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SYSTEM {
	static WebDriver dr;
	
	public static void Login(String Username,String Password)
	{
		System.out.println("User Name "+Username+" Password "+Password);

		//Enter Log in Details
		dr.findElement(By.id("txtUsername")).sendKeys(Username);
		dr.findElement(By.id("txtPassword")).sendKeys(Password);
		dr.findElement(By.id("btnLogin")).click();
		/*
		boolean Validation_Message=dr.findElement(By.id("spanMessage")).isDisplayed();
		
		if(Validation_Message==true)
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
		

		dr.findElement(By.xpath("//*[@id=\"forgotPasswordLink\"]/a")).click();
		dr.findElement(By.id("securityAuthentication_userName")).sendKeys("EKTA");
		
		dr.findElement(By.id("btnSearchValues")).click();
		
		//Navigation methods
		//dr.navigate().to("https:\\www.google.com");
		dr.navigate().back();
		dr.navigate().refresh();
		dr.navigate().to("https://opensource-demo.orangehrmlive.com/");
				
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
	
		//Get Title 
		String Title=dr.getTitle();
		System.out.println(Title);
	
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
		
		//enter User details in text Box
		dr.findElement(By.id("firstName")).sendKeys(FirstName);
		dr.findElement(By.id("middleName")).sendKeys(MiddleName);
		dr.findElement(By.id("lastName")).sendKeys(LastName);
		
		//Getting Emp ID 
		String Emp_Id=dr.findElement(By.id("employeeId")).getAttribute("value");
		
		//click on save button
		dr.findElement(By.id("btnSave")).click();
		
		System.out.println("User Created");

		//click on employee list menu to view all employee
		dr.findElement(By.id("menu_pim_viewEmployeeList")).click();
	
		boolean UserName_TB=dr.findElement(By.xpath("//*[@id=\"empsearch_employee_name_empName\"]")).isSelected();
		if(UserName_TB==true)
		{
			System.out.println("Text Was Selected");
		}
		else 
		{
			System.out.println("Text Was not Selected");
		}
		
		//1st clear text box cause it contain Space Holder then fill employee name and ID in text box
		
		//*[@id="empsearch_employee_name_empName"]
		dr.findElement(By.id("empsearch_employee_name_empName")).clear();
		dr.findElement(By.id("empsearch_employee_name_empName")).sendKeys(FirstName);
		
		dr.findElement(By.id("empsearch_id")).clear();
		dr.findElement(By.id("empsearch_id")).sendKeys(Emp_Id);	
		
		//Click On Search Button
		dr.findElement(By.id("searchBtn")).click();
		
		System.out.println("Searching for user");

		//Select All searched User
		dr.findElement(By.id("ohrmList_chkSelectAll")).click();

		//click delete button
		dr.findElement(By.id("btnDelete")).click();
		
		//delete button on dialog box
		dr.findElement(By.id("dialogDeleteBtn")).click();

		dr.findElement(By.id("menu_admin_viewAdminModule")).click();
		
		//For Logout
		//click welcome 
		dr.findElement(By.id("welcome")).click();
//		dr.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();

		boolean LogOut_button= dr.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).isDisplayed();
		
		if(LogOut_button==true)
		{
			dr.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();
		}
		else
		{
			System.out.println("Log out Button is Not displayed");
		}
		//dr.findElement(By.id("ohrmList_chkSelectAll")).
		}
}