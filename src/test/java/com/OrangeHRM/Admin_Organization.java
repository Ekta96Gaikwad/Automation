package com.OrangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Admin_Organization extends BaseClass
{
	/*
	 * public static void main(String arg[]
 {
	 * 
	 * //launch Browser launchBrowser("Chrome");
	 * 
	 * // driver.manage().window().maximize();
	 * 
	 * driver.get("https://opensource-demo.orangehrmlive.com/");
	 * 
	 * //Valid username valid password LoginTC.Login("Admin","admin123");
	 * 
	 * // General_Information();//Done
	 * 
	 * // Add_Location("1","2","3","4","5","6","7","8");//Done
	 * 
	 * // Location_Search("1","3","India");//Done
	 * 
	 * // viewCompanyStructure();//Done
	 * 
	 * // driver.quit(); }
	 */
	public static void General_Information()
	{
		//click Admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
				
		//click Organization menu
		driver.findElement(By.id("menu_admin_Organization")).click();
		
		//click View Organization General Information menu
		driver.findElement(By.id("menu_admin_viewOrganizationGeneralInformation")).click();

		//click Edit Button
		driver.findElement(By.id("btnSaveGenInfo")).click();
//		
		String id=driver.findElement(By.id("organization_name")).getAttribute("value");
		System.out.println("Organization Name "+id+" ");
		
		String Taxid=driver.findElement(By.id("organization_taxId")).getAttribute("value");
		System.out.println("Tax ID "+Taxid+" ");
		
		String numOfEmployees=driver.findElement(By.id("numOfEmployees")).getAttribute("value");
		System.out.println("Num Of Employees "+numOfEmployees+" ");
				
		String registraionNumber=driver.findElement(By.id("organization_registraionNumber")).getAttribute("value");
		System.out.println("Registration Number "+registraionNumber+" ");
		
		String phone=driver.findElement(By.id("organization_phone")).getAttribute("value");
		System.out.println("Organization Phone "+phone+" ");
		
		String organization_fax=driver.findElement(By.id("organization_fax")).getAttribute("value");
		System.out.println("organization fax "+organization_fax+" ");
				
		String organization_email=driver.findElement(By.id("organization_email")).getAttribute("value");
		System.out.println("organization Email"+organization_email+" ");
						
		String organization_street1=driver.findElement(By.id("organization_street1")).getAttribute("value");
		System.out.println("organization Street1 "+organization_street1+" ");
		
		//enter India in Address street 2
		driver.findElement(By.id("organization_street2")).clear();
		driver.findElement(By.id("organization_street2")).sendKeys("India");
		String organization_street2=driver.findElement(By.id("organization_street2")).getAttribute("value");
		System.out.println("organization Street2 "+organization_street2+" ");
		
		String organization_city=driver.findElement(By.id("organization_city")).getAttribute("value");
		System.out.println("organization City "+organization_city+" ");
								
		String organization_province=driver.findElement(By.id("organization_province")).getAttribute("value");
		System.out.println("organization Province "+organization_province+" ");
		
		String organization_zipCode=driver.findElement(By.id("organization_zipCode")).getAttribute("value");
		System.out.println("organization ZipCode "+organization_zipCode+" ");

		/*
		 * //DropDown list select by text WebElement
		 * organization_countryDropDownList=driver.findElement(By.id(
		 * "organization_country")); Select select=new
		 * Select(organization_countryDropDownList);
		 * select.selectByVisibleText("India");
		 */	

	/*	String organization_country=driver.findElement(By.id("organization_country")).getAttribute("value");
		System.out.println("organization Country "+organization_country+" ");
	*/
		String organization_note=driver.findElement(By.id("organization_note")).getAttribute("value");
		System.out.println("organization Note "+organization_note+" ");
														
		//Click Save Button
		driver.findElement(By.id("btnSaveGenInfo")).click();

	}
	public static void Add_Location(String LocationName,String State,String city,String Address,String zipCode,String Phone,String Fax,String Notes)
	{
		//click Admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
				
		//click Organization menu
		driver.findElement(By.id("menu_admin_Organization")).click();

		//click View Organization Locations menu
		driver.findElement(By.id("menu_admin_viewLocations")).click();
		
		//click Add button
		driver.findElement(By.id("btnAdd")).click();

		//Enter Location name
		driver.findElement(By.id("location_name")).sendKeys(LocationName);

		//DropDown list select by text
		WebElement location_countryDropDownList=driver.findElement(By.id("location_country"));
		Select select=new Select(location_countryDropDownList);
		select.selectByVisibleText("India");
	
		//Enter Location State
		driver.findElement(By.id("location_province")).sendKeys(State);

		//Enter Location city
		driver.findElement(By.id("location_city")).sendKeys(city);

		//Enter Location Address
		driver.findElement(By.id("location_address")).sendKeys(Address);
		
		//Enter Location ZipCode
		driver.findElement(By.id("location_zipCode")).sendKeys(zipCode);

		//Enter Location Phone
		driver.findElement(By.id("location_phone")).sendKeys(Phone);

		//Enter Location Fax
		driver.findElement(By.id("location_fax")).sendKeys(Fax);

		//Enter Location Notes
		driver.findElement(By.id("location_notes")).sendKeys(Notes);
				
		//Click on Add Button
		driver.findElement(By.id("btnSave")).click();	
		
	}
	public static void Location_Search(String LocationName,String City,String Country)
	{
		//click Admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
				
		//click Organization menu
		driver.findElement(By.id("menu_admin_Organization")).click();

		//click View Organization Locations menu
		driver.findElement(By.id("menu_admin_viewLocations")).click();
		
		//Enter Location name
		driver.findElement(By.id("searchLocation_name")).sendKeys(LocationName);

		//Enter Location city
		driver.findElement(By.id("searchLocation_city")).sendKeys(City);

		//Enter Location country
		WebElement location_countryDropDownList=driver.findElement(By.id("searchLocation_country"));
		Select select=new Select(location_countryDropDownList);
		select.selectByVisibleText(Country);
				
		//Click on Search Button
		driver.findElement(By.id("btnSearch")).click();	
	}
	public static void Delete_Location()
	{

		//click Admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
				
		//click Organization menu
		driver.findElement(By.id("menu_admin_Organization")).click();
		
		//click View Organization Locations menu
		driver.findElement(By.id("menu_admin_viewLocations")).click();

		//click on delete Menu
		driver.findElement(By.id("btnDelete")).click();
		
//		driver.findElement(By.id("ohrmList_chkSelectRecord_11")).click();
//		WebElement deletejobTitleCheckBox=driver.findElement(By.xpath("//tr[@class=\"odd\"]/descendant::td[1]s"));
//		driver.findElement(By.xpath("//tr[@class=\"odd\"]/descendant::td[1]")).click();
		List <WebElement> userList=driver.findElements(By.xpath("//tr[@class=\"odd\"]/descendant::td[1]/input"));
		for(WebElement element:userList)
		{
			String nameresultDetails=element.getText();
			System.out.println(nameresultDetails+" name");
//			System.out.println("******************************************************************");
				
		}
		/*
		 * if(deletejobTitleCheckBox.isSelected()==true) { //select check box //
		 * driver.findElement(By.id("btnDelete")).click();
		 * System.out.println("Check box selected"); //click delete dialog box //
		 * driver.findElement(By.id("dialogDeleteBtn")).click();
		 * System.out.println("User Deleted");
		 * 
		 * } else { System.out.println("Check box Not selected"); //
		 * driver.findElement(By.id("ohrmList_chkSelectAll")).click(); //
		 * driver.findElement(By.id("btnDelete")).click(); // //click delete dialog box
		 * // driver.findElement(By.id("dialogDeleteBtn")).click(); //
		 * System.out.println("User Deleted"); }
		 */	
	}
	public static void viewCompanyStructure()
	{
		//click Admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
				
		//click Organization menu
		driver.findElement(By.id("menu_admin_Organization")).click();
		
		//click View CompanyStructure menu
		driver.findElement(By.id("menu_admin_viewCompanyStructure")).click();
	}
}