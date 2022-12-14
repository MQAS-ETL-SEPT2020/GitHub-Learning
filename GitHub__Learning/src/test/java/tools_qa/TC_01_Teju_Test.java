package tools_qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import mqasetl.GitHub__Learning.Basetest;

public class TC_01_Teju_Test extends Basetest {
	@Test
	public void Testcase() {

		WebDriverManager.chromedriver().setup();
		System.out.println("webdriver setup is successfully");

		// Maximize the Browser
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");

		// Launching the application
		driver.get("https://demoqa.com/checkbox");
		System.out.println("Application launched successfully");

		// Clicking the checkbox module
		driver.findElement(By.className("rct-checkbox")).click();
		System.out.println("successfully clicked on checkbox module");


	}
}
