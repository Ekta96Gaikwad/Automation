package My;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.OrangeHRM.BaseClass;

public class Flipkart_DropDown_List extends BaseClass
{
	static WebDriver driver;
	
	String FirstName="EKTA";
	String MiddleName="Ramesh";
	String LastName="Gaikwad";
	
	public static void main(String[] args) 
	{
		launchBrowser("Chrome");
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//div[text()='Beauty, Toys & More']")).click();
		
		
		
		/*
		public static void PIM_Emp_Status_DropDownList() throws Exception
		{
			//click on Emp_List Menu
			driver.findElement(By.id("menu_pim_viewPimModule")).click();
					
			WebElement PIMEmpStatusDropDownList=driver.findElement(By.id("empsearch_employee_status"));
			Select select=new Select(PIMEmpStatusDropDownList);
			select.selectByIndex(1);
			//select.selectByVisibleText("Full-Time Permanent");
			
			List<WebElement> allSelectedOptions=select.getAllSelectedOptions();
			for(WebElement element:allSelectedOptions)
			{
				System.out.println(element.getText());
			}
			List<WebElement> allDropDownValues=select.getOptions();
			for(WebElement element:allDropDownValues)
			{
				System.out.println(element.getText());
				if(element.getText().equals("Part-Time Contract"))
				{
					System.out.println("inside if condition");
					throw new Exception("Part-Time Contract is present inside Employee Satus DropDown");
				}
				
			}
				
		}
		 */		
	}

}