package com.OrangeHRM;
import org.openqa.selenium.By;

public class AddEmployee extends BaseClass 
{
	public static void 	AddEmp(String FirstName,String MiddleName,String LastName)
	{
		//click on Emp_List Menu
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
				
		//click on Add button
		driver.findElement(By.id("btnAdd")).click();

		/*String FirstName="EKTA";
		String MiddleName="Ramesh";
		String LastName="Gaikwad";
		String Emp_Id="123123";
		*/
		
		driver.findElement(By.id("firstName")).sendKeys(FirstName);
		driver.findElement(By.id("middleName")).sendKeys(MiddleName);
		driver.findElement(By.id("lastName")).sendKeys(LastName);
		
		//driver.findElement(By.id("employeeId")).sendKeys();
		//String Emp_Id=dr.findElement(By.id("employeeId")).getAttribute("value");
		System.out.println(driver.findElement(By.id("employeeId")).getAttribute("value"));
		driver.findElement(By.id("btnSave")).click();
		
		System.out.println("User Created");
	}
	public static void main(String[] args) 
	{
		//launch Browser
		launchBrowser("Chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//LogIn
		Login.Login_Method("Admin","admin123");
				
		AddEmp("Ekta","Ramesh","Gaikwad");//Static method in static are of same class using class name 
	}
}



	/*
	 *import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	 *
	 * public static void main(String[] args) 
	 
	{
		System.setProperty("webdriver.chrome.driver","G:\\CYBER\\Software\\chromedriver.exe");
		//Open Google Chrome
		WebDriver dr=new ChromeDriver();
		dr.get("https://opensource-demo.orangehrmlive.com/");
		//Enter Log in Details
		dr.findElement(By.id("txtUsername")).sendKeys("Admin");
		dr.findElement(By.id("txtPassword")).sendKeys("admin123");
		dr.findElement(By.id("btnLogin")).click();
		
		System.out.println("Successfully Loggned IN");
		//Click on PIM Menu
		dr.findElement(By.id("menu_pim_viewPimModule")).click();
		
		//click to add button
		dr.findElement(By.id("btnAdd")).click();
		
		String FirstName="EKTA";
		String MiddleName="Ramesh";
		String LastName="Gaikwad";
		String Emp_Id="123123";
		//Enter Details
		dr.findElement(By.id("firstName")).sendKeys(FirstName);
		dr.findElement(By.id("middleName")).sendKeys(MiddleName);
		dr.findElement(By.id("lastName")).sendKeys(LastName);
		dr.findElement(By.id("employeeId")).sendKeys(Emp_Id);
		
		//click to save button
		dr.findElement(By.id("btnSave")).click();
		
		System.out.println("User Created");
		//view all employee
		dr.findElement(By.id("menu_pim_viewEmployeeList")).click();
	}

}
	*/