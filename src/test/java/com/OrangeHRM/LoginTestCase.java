
package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

//ERROR
public class LoginTestCase extends BaseClass {

	public static void main(String[] args) {
		
//		LoginTestCase obj=new LoginTestCase();
		LoginTestCase.launchBrowser("Chrome");
		
		//navigate to OrangeHRM URL
		driver.navigate().to("https://opensource-demo.orangehrmlive.com");
		
		WebElement restUserName=null;
		try
		{
			driver.findElement(By.partialLinkText("Forgot your")).click();
			
			restUserName =driver.findElement(By.id("securityAuthentication[userName]"));
			
			restUserName.sendKeys("test@test.com");
			
			driver.findElement(By.id("btnSearchValues")).click();
			
			restUserName.click();
		}
		catch(StaleElementReferenceException | ElementNotVisibleException e)
		{
			driver.navigate().refresh();
			
		}
	}
}