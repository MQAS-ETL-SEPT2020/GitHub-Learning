package tools_qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_02_Preeti_Test {
	@Test
	void C_02_Preeti_Test() {
		WebDriverManager.chromedriver();
		Reporter.log("WebDriver Manager Setup Successfully", true);
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/buttons");
		Reporter.log("Chrome driver launched successfully", true);

		Actions act = new Actions(driver);
		Reporter.log("Created object of action class and passing the driver instance", true);

		WebElement double1 = driver.findElement(By.id("doubleClickBtn"));
		act.doubleClick(double1).perform();
		Reporter.log("Successfully clicked on double click ", true);

		WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
		act.contextClick(rightClick).perform();
		Reporter.log("Successfully clicked on right click ", true);

		WebElement click=driver.findElement(By.xpath("//button[text()='Click Me']"));
		act.click();
		Reporter.log("Successfully clicked on click me", true);

		driver.quit();
		Reporter.log("Chrome driver closed successfully", true);

	}
}
