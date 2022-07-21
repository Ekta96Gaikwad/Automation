package com.OrangeHRM;
import org.openqa.selenium.By;

public class Login extends BaseClass
{
	public static void Login_Method(String UserName,String Password)
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
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
	
	/*public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","G:\\CYBER\\Software\\chromedriver.exe");
		
		dr.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	*/

}