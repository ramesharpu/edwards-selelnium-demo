package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Login {
	
	private WebDriver driver;
	
	@CacheLookup
	@FindBy(id = "email")
	WebElement email;
	
	@CacheLookup
	@FindBy(id = "pass")
	WebElement passwd;
	
	@CacheLookup
	@FindBy(xpath = "//h2[@class='_8eso']")
	WebElement welMsg;
	
	@CacheLookup
	@FindBy(tagName = "button")
	WebElement loginBtn;

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getWelcomeMessage() {
		return welMsg.getText();
	}
	
	public void enterUsername(String username) {
		Reporter.log("Username = " + username);
		email.clear();
		email.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		Reporter.log("password = " + password);
		passwd.clear();
		passwd.sendKeys(password);
	}
	
	public void clickLoginBtn() {
		loginBtn.click();
	}
	
	public void loginWithCredentials(String username, String password) {
		enterUsername(username);
		enterPassword(password);
//		clickLoginBtn();
	}
}
















