package stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import utils.CommonUtils;

public class Login {
	
	WebDriver driver;
	private LoginPage loginPage;
	private AccountPage accountPage;
	
	private CommonUtils commonUtils;
	
	
	@Given("User navigates to login page")
	public void User_navigates_to_login_page() {
		
		driver = DriverFactory.getDriver();
		HomePage homePage = new HomePage(driver);
		homePage.clickOnMyAccount();
		loginPage = homePage.selectLoginOption();
		
		
	}
	@When("User enteres valid email address {string} into email fiels")
	public void User_enteres_valid_email_address_into_email_fiels(String emailText) {
		
		loginPage.enterEmailAddress(emailText);	
	}
	
	@And("Use enteres valid password {string} into password field")
	public void use_enteres_valid_password_into_password_field(String passwordText) {
		
		loginPage.enterPassword(passwordText);
	}

	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
		
		accountPage = loginPage.clickOnLoginButton();

	}

	@Then("User should get successfully loged in")
	public void user_should_get_successfully_loged_in() {
		
		Assert.assertTrue(accountPage.displayStatusOfEditYourAccountInformationOption());

	}

	@When("User enteres invalid email address into email fiels")
	public void user_enteres_invalid_email_address_into_email_fiels() {
		
		commonUtils = new CommonUtils();
		loginPage.enterEmailAddress(commonUtils.getEmailWithTimeStamp());

	}

	@When("Use has enteres invalid password {string} into password field")
	public void use_has_enteres_invalid_password_into_password_field(String invalidpasswordText) {
		
		loginPage.enterPassword(invalidpasswordText);

	}

	@Then("User should get a proper warning message about credentials mismatch")
	public void user_should_get_a_proper_warning_message_about_credentials_mismatch() {
		
		Assert.assertTrue(loginPage.getWarningMessageText().contains("Warning: No match for E-Mail Address and/or Password."));

	}

	@When("User dont enter email address into email field")
	public void user_dont_enter_email_address_into_email_field() {
		
		loginPage.enterEmailAddress("");

	}

	@When("Use dont enter password into password field")
	public void use_dont_enter_password_into_password_field() {
		
		loginPage.enterPassword("");

	}
	
}
