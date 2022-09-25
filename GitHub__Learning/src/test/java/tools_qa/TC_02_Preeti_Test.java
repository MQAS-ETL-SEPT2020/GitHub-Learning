package tools_qa;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

public class TC_02_Preeti_Test {
		public static void main(String[] args) {	
			
			System.out.println("WebDriver Manager Setup Successfully");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demoqa.com/buttons");
			System.out.println("Chrome driver launched successfully");
			
			Actions act = new Actions(driver);
			System.out.println("Created object of action class and passing the driver instance");
			
			WebElement double1 = driver.findElement(By.id("doubleClickBtn"));
			act.doubleClick(double1).perform();
			System.out.println("Successfully clicked on double click ");
			
			WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
			act.contextClick(rightClick).perform();
			System.out.println("Successfully clicked on right click ");
			
			driver.findElement(By.xpath("//button[text()='Click Me']")).click();
			System.out.println("Successfully clicked on click me");

			driver.quit();
			System.out.println("Chrome driver closed successfully");

		}
	}

