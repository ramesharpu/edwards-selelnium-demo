package test;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.Login;

public class LoginValidation extends BaseTest{
	
	@Test
	public void welcomeMessageValidation() {
		String expectedResult = "Facebook helps you connect and share with the people in your life.";
		
		Login obj = new Login(driver);
		String actualResult = obj.getWelcomeMessage();

		Reporter.log("Expected Result = " + expectedResult);
		Reporter.log("Actual Result = " + actualResult);

		assertTrue(actualResult.equals(expectedResult), "Mismatch in the welcome message,");
	}
	
	@Parameters({"validUsername", "validPassword"})
	@Test
	public void validUsernameValidPasswordTest(String username, String password) {
		Login obj = new Login(driver);
		obj.loginWithCredentials(username, password);
	}
	
	@Parameters({"invalidUsername", "invalidPassword"})
	@Test // dev-1 + dev-2 changes
	public void invalidUsernameInvalidPasswordTest(String username, String password) {
		Login obj = new Login(driver);
		obj.loginWithCredentials(username, password);
	}
	
	//Dev-1 changes ==> dx
	@Parameters({"invalidUsername", "validPassword"})
	@Test
	public void invalidUsernameValidPasswordTest(String username, String password) {
		Login obj = new Login(driver);
		obj.loginWithCredentials(username, password);
	}

	//Dev-2 changes ==> dy
	@Parameters({"validUsername", "invalidPassword"})
	@Test
	public void validUsernameInvalidPasswordTest(String username, String password) {
		Login obj = new Login(driver);
		obj.loginWithCredentials(username, password);
	}

}
