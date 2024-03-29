package stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SearchResultPage;

public class Search {
	
	WebDriver driver;
	
	private HomePage homePage;
	private SearchResultPage searchResultPage;
	
	@Given("User opens the application")
	public void user_opens_the_application() {
		
		driver = DriverFactory.getDriver();

	}

	@When("User enteres valid peoduct {string} into search box field")
	public void user_enteres_valid_peoduct_into_search_box_field(String productText) {
		
		homePage = new HomePage(driver);
		homePage.enterProductIntoTheSearchBox(productText);

	}

	@When("User clicks on search button")
	public void user_clicks_on_search_button() {
		
		searchResultPage = homePage.clickOnSearchButton();

	}

	@Then("User should get valid product displayed in the search results")
	public void user_should_get_valid_product_displayed_in_the_search_results() {
		
		Assert.assertTrue(searchResultPage.displayStatusOfValidHpProduct());

	}

	@When("User enteres invalid peoduct {string} into search box field")
	public void user_enteres_invalid_peoduct_into_search_box_field(String productText) {
		
		homePage = new HomePage(driver);
		homePage.enterProductIntoTheSearchBox(productText);

	}

	@Then("User should get message about no product matching")
	public void user_should_get_message_about_no_product_matching() {
		
		Assert.assertEquals("There is no product that matches the search criteria.", searchResultPage.getMessageText());
	}

	@When("User dont enter any product name into search box field")
	public void user_dont_enter_any_product_name_into_search_box_field() {
		
		homePage = new HomePage(driver);

	}


}
