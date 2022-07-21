package com.OrangeHRM;

import java.util.Set;

import org.openqa.selenium.By;

public class Red_Bus_Child_Windows extends BaseClass {

	public static void main(String[] args) 
	{
		//launching broswer	
		launchBrowser("Chrome");
		driver.manage().window().maximize();
		
		//Entering URL
		driver.get("https://www.redbus.in/");
		
		//click on Help link
		driver.findElement(By.partialLinkText("Help")).click();
	
		//getting ParentTabId
		String ParentTabId=driver.getWindowHandle();
		System.out.println(ParentTabId);
		
		//getting All_Open_WiindowsIDs
		Set<String> All_Open_WiindowsIDs=driver.getWindowHandles();
		System.out.println(All_Open_WiindowsIDs);
		
		//iterate set of window id and switch child window
		for(String id:All_Open_WiindowsIDs)
		{
			//check if the currrent id is not equals to parent id
			if(!id.equals(ParentTabId))
			{
				System.out.println("Id of currently open tab "+id);
				
				//switch to child window
				driver.switchTo().window(id);
				
				//printing title of child window
				System.out.println("Title of current tab "+driver.getTitle());

				//close pop up window
				driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/i")).click();
				
				//driver.findElement(By.xpath("//*[@id=\"reactContentMount\"]/div[4]/div[2]/div[1]/div[2]/span[1]")).click();
				
				//driver.findElement(By.className("login-question")).click();
				
				//driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]")).click();
				
				//closing child window
				driver.close();
				
				//switch to parent window
				driver.switchTo().window("Parent Tab ID "+ParentTabId);
			}
		}
		//getting title of current window
		System.out.println("title of current window "+driver.getTitle());
		
		//
	}
}