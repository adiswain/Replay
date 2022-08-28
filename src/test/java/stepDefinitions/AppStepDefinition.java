package stepDefinitions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasicActions;
import pages.HomePage;
import pages.LoginPage;
import pages.LoadBoardPage;
import pages.MyBasketPage;
import utils.PropReader;
import utils.TLDriverFactory;

public class AppStepDefinition {

	private String username = PropReader.getUser();
	private String password = PropReader.getPassword();

	private WebDriver driver = TLDriverFactory.getTLDriver();
	private LoginPage demoLoginPage = new LoginPage(driver);
	private static HomePage demoHomePage;
	private static LoadBoardPage demoLoadBoardPage;
	private static MyBasketPage demoMyBasketPage;
	private static String productDetails;

	

	


	@Given("^User clicks on SignIn on Amazon Relay$")
	public void User_clicks_on_SignIn_on_Amazon_Relay() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		demoLoginPage.clickOnMainSignInLink();
		Thread.sleep(4000);
	}
	
	@When("^User logs in using valid username and password$")
	public void user_logs_in_using_valid_username_and_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		demoHomePage = demoLoginPage.successfulLogin(username, password);

		Thread.sleep(4000);
	}
	
	@When("^login should be successfull$")
	public void login_should_be_successfull() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		demoHomePage.validateHomePage();

		Thread.sleep(4000);
	}
	
	@When("^User clicks on Load Board link$")
	public void User_clicks_on_Load_Board_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		demoLoadBoardPage=demoHomePage.clickOnLoardBoardTab();
		demoLoadBoardPage.validateLoadBoardPage();

		Thread.sleep(4000);
	}
	
	@When("^User clicks on Search link$")
	public void User_clicks_on_Search_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		demoLoadBoardPage.clickOnSearch();

		Thread.sleep(4000);
	}
	
	@When("^User enters WorkType filter value$")
	public void User_enters_WorkType_filter_value() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		demoLoadBoardPage.clickOnWorkTypeDropDown();

		Thread.sleep(4000);
	}
	
	@When("^User enters origin city \"([^\"]*)\"$")
	public void User_enters_origin_city(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		demoLoadBoardPage.enterOriginCity(arg1);

		Thread.sleep(4000);
	}
	
	@When("^User enters radius$")
	public void User_enters_radius() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		demoLoadBoardPage.clickOnRadius();

		Thread.sleep(4000);
	}
	
	@When("^User clicks on refresh$")
	public void User_clicks_on_refresh() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		demoLoadBoardPage.clickOnRefresh();

		Thread.sleep(4000);
	}

	/*
	 * @Given("^login is successfull with the username \"([^\"]*)\"$") public void
	 * login_is_successfull_with_the_username(String arg1) throws Throwable { //
	 * Write code here that turns the phrase above into concrete actions
	 * demoHomePage.validateHomePage();
	 * demoHomePage.validateUserNameOnHomePage(arg1); demoHomePage.clearCart();
	 * 
	 * Thread.sleep(4000); }
	 */

	/*
	 * @When("^user selects and adds product to cart and checksout$") public void
	 * user_selects_and_adds_product_to_cart() throws Throwable { // Write code here
	 * that turns the phrase above into concrete actions demoProductPage =
	 * demoHomePage.hoverAndClickOnBrandsLink(); productDetails =
	 * Product_details_are_saved_before_clicking_on_product_name();
	 * demoProductPage.validateProductPage(); demoProductPage.clickOnProduct();
	 * demoProductPage.clickOnAddToBasket(); demoMyBasketPage =
	 * demoProductPage.clickOnCheckOut(); Thread.sleep(4000); }
	 * 
	 * @When("^User lands on my basket page$") public void
	 * user_lands_on_my_basket_page() throws Throwable { // Write code here that
	 * turns the phrase above into concrete actions
	 * demoMyBasketPage.validateMyBasketPage(); Thread.sleep(4000); }
	 * 
	 * @Then("^validate selected product is available in my basket$") public void
	 * validate_selected_product_is_available_in_my_basket() throws Throwable { //
	 * Write code here that turns the phrase above into concrete actions
	 * demoMyBasketPage.validateProductDetailsOnMyBasketPage(productDetails);
	 * Thread.sleep(4000); }
	 * 
	 * // @When("^Product details are saved before clicking on product name$")
	 * public static String
	 * Product_details_are_saved_before_clicking_on_product_name() throws Throwable
	 * { // Write code here that turns the phrase above into concrete actions
	 * 
	 * setProductDetails(demoProductPage.collectProductName());
	 * 
	 * Thread.sleep(2000); return getProductDetails();
	 * 
	 * }
	 * 
	 * public static String getProductDetails() { return productDetails; }
	 * 
	 * public static void setProductDetails(String productDetails) {
	 * AppStepDefinition.productDetails = productDetails; }
	 */
}
