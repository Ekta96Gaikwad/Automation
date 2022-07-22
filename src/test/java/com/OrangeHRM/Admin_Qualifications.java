package com.OrangeHRM;

import org.openqa.selenium.By;

public class Admin_Qualifications extends BaseClass
{
	public static void main(String[] args) 
	{
		 
		 //launch Browser 
		launchBrowser("Chrome");
		 
		// driver.manage().window().maximize();
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		  
		 //Valid username valid password 
		 LoginTC.Login("Admin","admin123");
		 
//		 Add_Skill("SkillName","skillDescription");//Done

		 //Delete_Skill();
		 
//		 Add_Education("ABC"); //Done
		 
//		 Add_Licenses("ABC"); //Done
		 
//		 Add_Languages("Indian");//Done
		 
//		 Add_Memberships("MEMBership");//Done
	}
	public static void Add_Memberships(String MembershipsName)
	{
		//click Admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
				
		//click Qualifications menu
		driver.findElement(By.id("menu_admin_Qualifications")).click();

		//click membership menu
		driver.findElement(By.id("menu_admin_membership")).click();
		
		//click Add button
		driver.findElement(By.id("btnAdd")).click();

//		String membership_name=driver.findElement(By.xpath("//*[@id=\"recordsListTable\"]/tbody/tr[1]/td[2]")).getText();
		
		//Enter  membership name
		driver.findElement(By.id("membership_name")).sendKeys(MembershipsName);
			
		//Click on Save Button
		driver.findElement(By.id("btnSave")).click();	
	}
	public static void Delete_Memberships()
	{
		//click Admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
				
		//click Qualifications menu
		driver.findElement(By.id("menu_admin_Qualifications")).click();

		//click View Skills menu
		driver.findElement(By.id("menu_admin_viewSkills")).click();
		
		//click Delete button
		driver.findElement(By.id("btnDel")).click();

	}	public static void Add_Skill(String skillname,String skillDescription)
	{
		//click Admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
				
		//click Qualifications menu
		driver.findElement(By.id("menu_admin_Qualifications")).click();

		//click View Skills menu
		driver.findElement(By.id("menu_admin_viewSkills")).click();
		
		//click Add button
		driver.findElement(By.id("btnAdd")).click();

		//Enter skill name
		driver.findElement(By.id("skill_name")).sendKeys(skillname);

		//Enter skill Description State
		driver.findElement(By.id("skill_description")).sendKeys(skillDescription);
				
		//Click on Save Button
		driver.findElement(By.id("btnSave")).click();	
		
	}
	public static void Add_Education(String Level)
	{
		//click Admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
				
		//click Qualifications menu
		driver.findElement(By.id("menu_admin_Qualifications")).click();

		//click View Skills menu
		driver.findElement(By.id("menu_admin_viewEducation")).click();
		
		//click Add button
		driver.findElement(By.id("btnAdd")).click();

//		String Level=driver.findElement(By.xpath("//*[@id=\"recordsListTable\"]/tbody/tr[1]/td[2]")).getText();
		//Enter Level education name
		driver.findElement(By.id("education_name")).sendKeys(Level);
			
		//Click on Save Button
		driver.findElement(By.id("btnSave")).click();	
		
	}
	public static void Delete_Skill()
	{
		//click Admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
				
		//click Qualifications menu
		driver.findElement(By.id("menu_admin_Qualifications")).click();

		//click View Skills menu
		driver.findElement(By.id("menu_admin_viewSkills")).click();
		
		//click Delete button
		driver.findElement(By.id("btnDel")).click();

	}
	public static void Add_Licenses(String license_name)
	{
		//click Admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
				
		//click Qualifications menu
		driver.findElement(By.id("menu_admin_Qualifications")).click();

		//click Licenses menu
		driver.findElement(By.id("menu_admin_viewLicenses")).click();
		
		//click Add button
		driver.findElement(By.id("btnAdd")).click();

//		String license_name=driver.findElement(By.xpath("//*[@id=\"recordsListTable\"]/tbody/tr[1]/td[2]")).getText();
		//Enter license name
		driver.findElement(By.id("license_name")).sendKeys(license_name);
			
		//Click on Save Button
		driver.findElement(By.id("btnSave")).click();	
	}
	public static void Delete_Licenses(String license_name)
	{
		//click Admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
				
		//click Qualifications menu
		driver.findElement(By.id("menu_admin_Qualifications")).click();

		//click Licenses menu
		driver.findElement(By.id("menu_admin_viewLicenses")).click();
		
		//click Add button
		driver.findElement(By.id("btnDel")).click();

		//Click on Save Button
		driver.findElement(By.id("btnSave")).click();	
	}
	public static void Add_Languages(String Languages)
	{
		//click Admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
				
		//click Qualifications menu
		driver.findElement(By.id("menu_admin_Qualifications")).click();

		//click Languages menu
		driver.findElement(By.id("menu_admin_viewLanguages")).click();
		
		//click Add button
		driver.findElement(By.id("btnAdd")).click();

//		String language_name=driver.findElement(By.xpath("//*[@id=\"recordsListTable\"]/tbody/tr[1]/td[2]")).getText();
		//Enter  language name
		driver.findElement(By.id("language_name")).sendKeys(Languages);
			
		//Click on Save Button
		driver.findElement(By.id("btnSave")).click();	
		
	}
	public static void Delete_Languages()
	{
		//click Admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
				
		//click Qualifications menu
		driver.findElement(By.id("menu_admin_Qualifications")).click();

		//click View Skills menu
		driver.findElement(By.id("menu_admin_viewSkills")).click();
		
		//click Delete button
		driver.findElement(By.id("btnDel")).click();

	}



}