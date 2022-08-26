package week6.day2;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import week6.day1.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethod {

	

		@BeforeTest
		public void setup() {
			excelFileName = "dataexcel";
		}

		@Test(dataProvider = "fetch")
		public void createLead(String company, String first, String last) {
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(first);
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(last);
			driver.findElement(By.name("submitButton")).click();
			
		}
	
}
