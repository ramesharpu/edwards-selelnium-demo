package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	//instance variable
	public String url = "https://www.facebook.com";
	
	//class variable
	static WebDriver driver;
	
	@Parameters({"browser"})
	@BeforeTest
	public void setup(String browser) {
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
