package com.OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	static WebDriver driver;
	
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
			break;
	
		case "Mozilla":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
			
		case "edge" :
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
			
		default:
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
				
		}
	}
}