package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class HomePage {
	
	WebDriver driver;
	private ElementUtils elementUtils;
	
	public HomePage (WebDriver driver) {  //<-- This is Constructor
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtils = new ElementUtils(driver);
	}
	
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myAccountDropMenu;
	
	@FindBy(linkText="Login")
	private WebElement loginOption;
	
	@FindBy(linkText="Register")
	private WebElement registerOption;
	
	@FindBy(name="search")
	public WebElement searchBoxField;
	
	@FindBy(xpath="//button[contains(@class,'btn btn-default btn-lg')]")
	public WebElement searchButton;
	
	public void clickOnMyAccount() {
		
		elementUtils.clickOnElement(myAccountDropMenu,CommonUtils.EXPLICITE_WAIT_BASIC_TIME);
	}
	
	public LoginPage selectLoginOption() {
		
		elementUtils.clickOnElement(loginOption,CommonUtils.EXPLICITE_WAIT_BASIC_TIME);
		return new LoginPage(driver);
	}
	
	public RegisterPage selectRegisterOption() {
		
		elementUtils.clickOnElement(registerOption,CommonUtils.EXPLICITE_WAIT_BASIC_TIME);
		return new RegisterPage(driver);
	}
	
	public void enterProductIntoTheSearchBox(String productText) {
		
		elementUtils.typeTextIntoElemet(searchBoxField, productText,CommonUtils.EXPLICITE_WAIT_BASIC_TIME);
	}
	
	public SearchResultPage clickOnSearchButton() {
		
		elementUtils.clickOnElement(searchButton,CommonUtils.EXPLICITE_WAIT_BASIC_TIME);
		return new SearchResultPage(driver);
	}

}
