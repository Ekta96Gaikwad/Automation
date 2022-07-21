package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchEmp {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","G:\\CYBER\\Software\\chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		dr.get("https://opensource-demo.orangehrmlive.com/");
		
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
		dr.findElement(By.id("employeeId")).clear();
		dr.findElement(By.id("employeeId")).sendKeys(Emp_Id);
		
		//click to save button
		dr.findElement(By.id("btnSave")).click();
		
		System.out.println("User Created");
		//view all employee
		dr.findElement(By.id("menu_pim_viewEmployeeList")).click();
	
		
		WebElement UserName_TB=dr.findElement(By.xpath("//*[@id=\"empsearch_employee_name_empName\"]"));
		if(UserName_TB.isSelected())
		{
			System.out.println("Text Was Selected");
		}
		else 
		{
			System.out.println("Text Was Selected");
		}
		//dr.findElement(By.id("empsearch[employee_name][empName]")).clear();
		dr.findElement(By.xpath("//*[@id=\"empsearch_employee_name_empName\"]")).sendKeys(FirstName);
		dr.findElement(By.id("empsearch_id")).sendKeys(Emp_Id);	
		dr.findElement(By.id("searchBtn")).click();
		System.out.println("Searching for user");
		
		//dr.findElement(By.id("ohrmList_chkSelectRecord_88")).
	}
}