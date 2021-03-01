package CITest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	public static WebDriver driver;

	@BeforeSuite
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//Reporter.log("initial set up done !!!!!");
		System.out.println("Execution Started !!!!");
	}

	@Test
	public void login() {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("way2automation");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[3]/center/input[1]")).click();
	}

	@AfterSuite
	public void teardown() {
		driver.quit();
		//Reporter.log("Execution completed !!!!");
		System.out.println("Execution completed !!!!");
	}

}
