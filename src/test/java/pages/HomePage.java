package pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import stepDefinitions.AppStepDefinition;

public class HomePage extends LoginPage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[@id=\"customer-service-button\"]/span")
	private WebElement fAQ	;
	
	@FindBy(xpath = "//*[@id=\"load-board-header\"]/p")
	private WebElement loadBoardTab	;


	public HomePage validateHomePage() throws Exception {

		// clickElement(this.loginLink, "loginLink");
		elementIsPresent(this.fAQ, "FAQ link present");
		return this;
	}
	
	public LoadBoardPage clickOnLoardBoardTab() throws Exception {
		 clickElement(this.loadBoardTab, "loadBoardTab");
		 
		 return new LoadBoardPage(driver);
	}

	/*
	 * public HomePage validateHomePageOnSignUp() throws Exception {
	 * 
	 * // clickElement(this.loginLink, "loginLink"); LOGGER.
	 * info("HomePage validation could not be done due to the presence of CAPTCHA");
	 * return this; }
	 */

	/*
	 * public HomePage validateUserNameOnHomePage(String userName) throws Exception
	 * {
	 * 
	 * // clickElement(this.loginLink, "loginLink");
	 * verifyFullElementText(profileUserName, "profileUserName", userName); return
	 * this; }
	 */

	/*
	 * public HomePage validateUserNameOnHomePageOnSignUp() throws Exception {
	 * 
	 * // clickElement(this.loginLink, "loginLink"); LOGGER.
	 * info("UserName validation on HomePage could not be done due to the presence of CAPTCHA"
	 * ); return this; }
	 * 
	 * public ProductPage hoverAndClickOnBrandsLink() throws Exception {
	 * 
	 * hoverOnElement(brandsLinkMainMenu, "brandsLinkMainMenu");
	 * clickElement(brandsLinkSubMenu, "brandsLinkSubMenu");
	 * clickElement(menProductSubMenu, "menProductSubMenu"); return new
	 * ProductPage(driver); }
	 */

	/*
	 * public ProductPage clearCart() throws Exception {
	 * 
	 * 
	 * 
	 * hoverOnElement(cartIcon, "cartIcon");
	 * 
	 * clickElement(checkOutBtn, "checkOutBtn");
	 * 
	 * Thread.sleep(10000);
	 * 
	 * int removeLinksCount =
	 * driver.findElements(By.xpath("//button[contains(text(),\"Remove\")]")).size()
	 * ;
	 * 
	 * if (removeLinksCount > 0) {
	 * 
	 * driver.findElement(By.xpath("//button[contains(text(),\"Remove\")]")).click()
	 * ; } return new ProductPage(driver); }
	 */

}
