package tools_qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import mqasetl.GitHub__Learning.Basetest;
import static org.testng.Assert.assertEquals;


public class TC_04_MeghaD_Test extends Basetest {
		@Test
		public void testcase4() {
			driver.get("https://demoqa.com/text-box");
			Reporter.log("demoqa launched Successfully", true);

			driver.findElement(By.id("userName")).sendKeys("Megha");
			Reporter.log("Username entered Successfully", true);
			WebElement username = driver.findElement(By.id("userName"));
			String ExpectedResult = "Megha";
			String ActualResult = username.getAttribute("value");
			assertEquals(ExpectedResult, ActualResult, "username is not entered");

			driver.findElement(By.id("userEmail")).sendKeys("meghadmeghad@gmail.com");
			Reporter.log("Usermail entered Successfully", true);
			WebElement email = driver.findElement(By.id("userEmail"));
			String ExpectedResult1 = "meghadmeghad@gmail.com";
			String ActualResult1 = email.getAttribute("value");
			assertEquals(ExpectedResult1, ActualResult1, "Usermail is not entered");

			driver.findElement(By.id("currentAddress")).sendKeys("Katreguppe");
			Reporter.log("Current Address entered Successfully", true);
			WebElement CurrentResult = driver.findElement(By.id("currentAddress"));
			String ExpectedResult2 = "Katreguppe";
			String ActualResult2 = CurrentResult.getAttribute("value");
			assertEquals(ExpectedResult2, ActualResult2, "Current Address is not entered");

			driver.findElement(By.id("permanentAddress")).sendKeys("Chitradurga");
			Reporter.log("Permanent Address entered Successfully", true);
			WebElement PermanentResult = driver.findElement(By.id("currentAddress"));
			String ExpectedResult3 = "Katreguppe";
			String ActualResult3 = PermanentResult.getAttribute("value");
			assertEquals(ExpectedResult3, ActualResult3, "Permanent Address is not entered");

//			driver.findElement(By.id("submit")).click();
//			Reporter.log("submit is clicked Successfully", true);
//			WebElement submit1 = driver.findElement(By.id("submit"));
//			assertTrue(submit1.isDisplayed(), "submit is not clicked");
		
		}
	}

