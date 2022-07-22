package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Admin_Configuration extends BaseClass
{
	public static void main(String[] args) 
	{
		//launch Browser 
		launchBrowser("Chrome");
		
		// driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	  
		//Valid username valid password 
		LoginTC.Login("Admin","admin123");
	 
//		Add_Social_Media_Authentication("Google","https://google.com");//Done
		
//		Save_Register_OAuth_Client("ASD","AUTH","google.com");//Done
	}
	public static void Save_Register_OAuth_Client(String ID,String Secret,String RedirectURI)
	{
		//click Admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();

		//click Configuration menu
		driver.findElement(By.id("menu_admin_Configuration")).click();
		
		//click Register OAuth Client menu
		driver.findElement(By.id("menu_admin_registerOAuthClient")).click();
		
		//Enter ID
		driver.findElement(By.id("oauth_client_id")).sendKeys(ID);
		
		//Enter Secret
		driver.findElement(By.id("oauth_client_secret")).sendKeys(Secret);
				
		//Enter Redirect URI
		driver.findElement(By.id("oauth_redirect_uri")).sendKeys(RedirectURI);
				
		//click to Save button
		driver.findElement(By.id("btnSave")).click();
	}
	public static void Add_Social_Media_Authentication(String Name,String URL)
	{
		//click Admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();

		//click Configuration menu
		driver.findElement(By.id("menu_admin_Configuration")).click();
		
		//click Provider List menu
		driver.findElement(By.id("menu_admin_openIdProvider")).click();
		
		//click to add button
		driver.findElement(By.id("btnAdd")).click();
		
		//DropDown list select by text
		WebElement TypeDropDownList=driver.findElement(By.id("openIdProvider_type"));
		Select select=new Select(TypeDropDownList);
		select.selectByIndex(0);
		
		//Enter Name
		driver.findElement(By.id("openIdProvider_name")).sendKeys(Name);
		
		//Enter URL
		driver.findElement(By.id("openIdProvider_url")).sendKeys(URL);
				
		//Click to save button
		driver.findElement(By.id("btnSave")).click();
		
	}
	public static void DeleteNationality()
	{
		//click Admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
				
		//click nationality menu
		driver.findElement(By.id("menu_admin_nationality")).click();

		driver.findElement(By.id("btnDelete")).click();

		driver.findElement(By.id("ohrmList_chkSelectRecord_1")).click();

		driver.findElement(By.id("btnDelete")).click();
	}
}