package tools_qa;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import mqasetl.GitHub__Learning.Basetest;

public class TC_06_Anil_Test extends Basetest{
	@Test
	public void link_page() throws InterruptedException {
		// opening demoQA page
		driver.get("https://demoqa.com/");

		// opening links page
		driver.get("https://demoqa.com/links");
		System.out.println("Links page opened successfully");

		// clicking on "Home" link
		driver.findElement(By.id("simpleLink")).click();
		System.out.println("clicked on Home link susccessfully");
	}
}
