package My;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword {
	static WebDriver dr;
	
	public static void Login(String Username,String Password)
	{
		System.out.println("User Name "+Username+" Password "+Password);

		//Enter Log in Details
		dr.findElement(By.id("txtUsername")).sendKeys(Username);
		dr.findElement(By.id("txtPassword")).sendKeys(Password);
		dr.findElement(By.id("btnLogin")).click();
		
		/*
		WebElement Validation_Message=dr.findElement(By.id("spanMessage"));
		
		if(Validation_Message.isDisplayed())
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
		
		
		//Valid username valid password
		//Login("Admin","admin123");
		
}
	}