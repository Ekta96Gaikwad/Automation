package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTC {
	static WebDriver dr;
	
	public static void Login1(String Username,String Password)
	{
		System.out.println("User Name "+Username+" Password "+Password);
		dr.findElement(By.id("txtUsername")).sendKeys(Username);
		dr.findElement(By.id("txtPassword")).sendKeys(Password);
		dr.findElement(By.id("btnLogin1")).click();
	}

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","G:\\CYBER\\Software\\chromedriver.exe");
		
		dr=new ChromeDriver();
		dr.get("https://opensource-demo.orangehrmlive.com/");
		
		//InValid username Invalid password
		Login1("123Admin","PAss");
		
		//Valid username Invalid password
		Login1("Admin","PA12ss");
		
		//InValid username valid password
		Login1("Admin123","Admin123");
		
		//Valid username valid password
		Login1("Admin","admin123");
		
		//click on Emp_List Menu
		dr.findElement(By.id("menu_pim_viewPimModule")).click();
		
		//click on Add button
		dr.findElement(By.id("btnAdd")).click();

		String FirstName="EKTA";
		String MiddleName="Ramesh";
		String LastName="Gaikwad";
		String Emp_Id="123123";
		
		dr.findElement(By.id("firstName")).sendKeys(FirstName);
		dr.findElement(By.id("middleName")).sendKeys(MiddleName);
		dr.findElement(By.id("lastName")).sendKeys(LastName);
		dr.findElement(By.id("employeeId")).sendKeys(Emp_Id);
		
		dr.findElement(By.id("btnSave")).click();
		
		System.out.println("User Created");
		
		dr.findElement(By.id("menu_pim_viewEmployeeList")).click();
		dr.findElement(By.className("empsearch[employee_name][empName]")).sendKeys(FirstName);

	}
}