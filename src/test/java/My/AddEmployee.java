package My;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddEmployee 
{
	static WebDriver dr;
	
	public static void Login(String Username,String Password)
	{
		System.out.println("User Name "+Username+"Password "+Password);
		//Enter Log in Details
		dr.findElement(By.id("txtUsername")).sendKeys(Username);
		dr.findElement(By.id("txtPassword")).sendKeys(Password);
		dr.findElement(By.id("btnLogin")).click();
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
		
		//Valid username valid password
		Login("Admin","admin123");

		//System.out.println("Successfully Loggned IN");
		
		//Click on PIM Menu
		dr.findElement(By.id("menu_pim_viewPimModule")).click();
		
		//To Open Add Menu
		dr.findElement(By.id("btnAdd")).click();

		String FirstName="EKTA";
		String MiddleName="Ramesh";
		String LastName="Gaikwad";
		String Emp_Id="123123";
		//enter User details in text Box
		dr.findElement(By.id("firstName")).sendKeys(FirstName);
		dr.findElement(By.id("middleName")).sendKeys(MiddleName);
		dr.findElement(By.id("lastName")).sendKeys(LastName);
		dr.findElement(By.id("employeeId")).sendKeys(Emp_Id);
		
		//click on save button
		dr.findElement(By.id("btnSave")).click();
		
		System.out.println("User Created");
		
		//click on employee list menu
		dr.findElement(By.id("menu_pim_viewEmployeeList")).click();
		
		//fill employee name in text box
		String EMP_NAME_TF="empsearch[employee_name][empName]";
		dr.findElement(By.className(EMP_NAME_TF)).sendKeys(FirstName);
		//System.out.println("User name entered");
		
		//dr.findElement(By.id("searchBtn")).click();
		
	
	}

}