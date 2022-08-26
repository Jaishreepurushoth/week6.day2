package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead extends ProjectSpecificMethod  {

	public void dupLead(String[] args) {
		// TODO Auto-generated method stub
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABCD");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jaishree");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Purushoth");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("jai");
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		driver.findElement(By.name("description")).sendKeys("This is a Test project");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jaishree@gmail.com");
		
		WebElement dropdown1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select = new Select(dropdown1);
		select.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		String str = driver.getTitle();
		if(str.equalsIgnoreCase("View Lead | opentaps CRM"))
		{
			System.out.println("First Time Verified the Tiltle successfully "
					+ "\n" + str);
		}
		else
		{
			System.out.println("Wrong Title" + str);
		}
		
		driver.findElement(By.partialLinkText("Duplicate")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("DCBA");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Samy");
		driver.findElement(By.name("submitButton")).click();
		if(str.equalsIgnoreCase("View Lead | opentaps CRM"))
		{
			System.out.println("Second Time Verified the Tiltle successfully "
					+ "\n" + str);
		}
		else
		{
			System.out.println("Wrong Title" + str);
		}
	}

}
