package My;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchEmp
{
	public static void main(String[] args) 
	{
		//Connecting to WebDriver
		System.setProperty("webdriver.chrome.driver","G:\\CYBER\\Software\\chromedriver.exe");
		
		//Going to OrangeHRM webSite
		WebDriver dr=new ChromeDriver();
		dr.get("https://opensource-demo.orangehrmlive.com/");
		
		//Forgot Password link 
		 
		//Enter UserName and Password
		dr.findElement(By.id("txtUsername")).sendKeys("Admin");
		dr.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//Click to LogIn Button
		dr.findElement(By.id("btnLogin")).click();
		
		//Click to PIM Menu		
		dr.findElement(By.id("menu_pim_viewPimModule")).click();

		dr.findElement(By.id("empsearch[employee_name][empName]")).clear();
		dr.findElement(By.id("empsearch[employee_name][empName]")).click();
		
		dr.findElement(By.id("empsearch[employee_name][empName]")).sendKeys("Ekta");
		
		dr.findElement(By.id("searchBtn")).click();
		System.out.println("Searching for user");
		/*
		//Navigation methods
		dr.navigate().to("https:\\www.google.com");
		dr.navigate().refresh();
		dr.navigate().back();
		
		//To check Checkbox is selected
		WebElement ele=dr.findElement(By.id("ohrmList_chkSelectRecord_88"));
		boolean res=ele.isSelected();
		System.out.println(res);
		
		//To check Element is Display
		WebElement ele1=dr.findElement(By.id("ohrmList_chkSelectRecord_88"));
		boolean res1=ele1.isDisplayed();
		System.out.println(res1);
				
		//To check Checkbox is enabled
		WebElement ele2=dr.findElement(By.id("ohrmList_chkSelectRecord_88"));
		boolean res2=ele2.isEnabled();
		System.out.println(res2);
				
		//Get current URL
		String CurrentURL=dr.getCurrentUrl();
		System.out.println(CurrentURL);

		//Get current URL
		String Current_URL=dr.getCurrentUrl();
		System.out.println(Current_URL);
		
		//Get Title 
		String Title=dr.getTitle();
		System.out.println(Title);
		
		*/		
				
		
	
	}
}