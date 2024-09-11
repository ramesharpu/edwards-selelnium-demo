package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	//instance variable
	public String browser = "chrome";
	public String url = "https://www.facebook.com";
	
	//class variable
	static WebDriver driver;
	
	@BeforeTest
	public void setup() {
		//open the browser and url
		driver = new ChromeDriver();
		driver.get(url);
	}

	@AfterTest
	public void tearDown() {
		//closing the browser
		driver.quit();
	}
}
