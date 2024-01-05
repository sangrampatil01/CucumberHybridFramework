package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class RegisterPage {
	
	WebDriver driver;
	private ElementUtils elementUtils;
	
	public RegisterPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtils = new ElementUtils(driver);
	}
	
	@FindBy(id="input-firstname")
	private WebElement firstNameField;
	
	@FindBy(id="input-lastname")
	private WebElement lastNameField;
	
	@FindBy(id="input-email")
	private WebElement emailField;
	
	@FindBy(id="input-telephone")
	private WebElement telephoneField;
	
	@FindBy(id="input-password")
	private WebElement passwordField;
	
	@FindBy(id="input-confirm")
	private WebElement confirmPasswordField;
	
	@FindBy(name="agree")
	private WebElement privacyPolicyOption;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continueButton;
	
	@FindBy(xpath="//input[@name='newsletter'][@value='1']")
	private WebElement yesNewsLetterOption;
	
	@FindBy(xpath="//div[contains(@class,'alert alert-danger alert-dismissible')]")
	private WebElement warningMessage;
	
	@FindBy(xpath="//input[@id='input-firstname']/following-sibling::div")
	private WebElement firstNameWarning;
	
	@FindBy(xpath="//input[@id='input-lastname']/following-sibling::div")
	private WebElement lastNameWarning;
	
	@FindBy(xpath="//input[@id='input-email']/following-sibling::div")
	private WebElement emailNameWarning;
	
	@FindBy(xpath="//input[@id='input-telephone']/following-sibling::div")
	private WebElement telephoneNameWarning;
	
	@FindBy(xpath="//input[@id='input-password']/following-sibling::div")
	private WebElement passwordNameWarning;
	
	public void enterFirstName(String firstNameText) {
		
		elementUtils.typeTextIntoElemet(firstNameField, firstNameText,CommonUtils.EXPLICITE_WAIT_BASIC_TIME);
	}
	
	public void enterLastName(String lastNameText) {
		
		elementUtils.typeTextIntoElemet(lastNameField, lastNameText,CommonUtils.EXPLICITE_WAIT_BASIC_TIME);
	}
	
	public void enterEmailAddress(String emailText) {
		
		elementUtils.typeTextIntoElemet(emailField, emailText,CommonUtils.EXPLICITE_WAIT_BASIC_TIME);
	}
	
	public void enterTelephoneNumber(String telephoneText) {
		
		elementUtils.typeTextIntoElemet(telephoneField, telephoneText,CommonUtils.EXPLICITE_WAIT_BASIC_TIME);
	}
	
	public void enterPassword(String passwordText) {
		
		elementUtils.typeTextIntoElemet(passwordField, passwordText,CommonUtils.EXPLICITE_WAIT_BASIC_TIME);
	}
	
	public void enterConfirmPassword(String confirmPasswordText) {
		
		elementUtils.typeTextIntoElemet(confirmPasswordField, confirmPasswordText,CommonUtils.EXPLICITE_WAIT_BASIC_TIME);
	}
	
	public void selectPrivacyPolicy() {
		
		elementUtils.clickOnElement(privacyPolicyOption,CommonUtils.EXPLICITE_WAIT_BASIC_TIME);
	}
	
	public AccountSuccessPage clickOnContinueButton() {
		
		elementUtils.clickOnElement(continueButton,CommonUtils.EXPLICITE_WAIT_BASIC_TIME);		
		return new AccountSuccessPage(driver);
	}
	
	public void selectyesNewsSelectOption() {
		
		elementUtils.clickOnElement(yesNewsLetterOption,CommonUtils.EXPLICITE_WAIT_BASIC_TIME);		
	}
	
	public String getWarningMessageText() {
		
		return elementUtils.getTextFromElement(warningMessage,CommonUtils.EXPLICITE_WAIT_BASIC_TIME);
	}
	
	public String getFirstNameWarning() {
		
		return elementUtils.getTextFromElement(firstNameWarning,CommonUtils.EXPLICITE_WAIT_BASIC_TIME);
	}
	
	public String getLastNameWarning() {
		
		return elementUtils.getTextFromElement(lastNameWarning,CommonUtils.EXPLICITE_WAIT_BASIC_TIME);
	}
	
	public String getEmailNameWarning() {
		
		return elementUtils.getTextFromElement(emailNameWarning,CommonUtils.EXPLICITE_WAIT_BASIC_TIME);
	}
	
	public String getTelephoneNameWarning() {
		
		return elementUtils.getTextFromElement(telephoneNameWarning,CommonUtils.EXPLICITE_WAIT_BASIC_TIME);
	}
	
	public String getPasswordNameWarning() {
		
		return elementUtils.getTextFromElement(passwordNameWarning,CommonUtils.EXPLICITE_WAIT_BASIC_TIME);
	}

}
