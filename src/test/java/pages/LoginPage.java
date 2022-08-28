package pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasicActions {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"home-nav--lg-up\"]/li[3]/a")
	private WebElement mainLoginLink;

	@FindBy(id = "signInSubmit")
	private WebElement secondaryLoginLink;

	@FindBy(id = "ap_email")
	private WebElement registerEmail;

	@FindBy(id = "ap_password")
	private WebElement registerPassword;

	public LoginPage clickOnMainSignInLink() throws Exception {

		clickElement(mainLoginLink, "main Signin Link");

		return this;
	}

	/*
	 * public LoginPage hoverAndClickOnSecondarySignIn() throws Exception {
	 * 
	 * hoverOnElement(mainLoginLink, "Sign In link");
	 * clickElement(secondaryLoginLink, "secondaryLoginLink");
	 * 
	 * return this; }
	 */

	/*
	 * public LoginPage enterEmailId(String emailID) throws Exception {
	 * 
	 * 
	 * Random rand = new Random(); String
	 * newEmailID=emailID+Integer.toString(rand.nextInt(100));
	 * 
	 * clearField(this.registerEmail, "registerEmail");
	 * inputValue(this.registerEmail, emailID, "registerEmail");
	 * 
	 * return this; }
	 */

	/*
	 * public LoginPage enterPassword(String passWord) throws Exception {
	 * 
	 * clearField(this.registerPassword, "registerPassword");
	 * inputValue(this.registerPassword, passWord, "registerPassword");
	 * 
	 * return this; }
	 * 
	 * public HomePage clickOnSecondSignInLink() throws Exception {
	 * 
	 * clickElement(secondaryLoginLink, "secondaryLoginLink"); return new
	 * HomePage(driver); }
	 */

	public HomePage successfulLogin(String username, String password) throws Exception {
		clearField(this.registerEmail, "registerEmail");
		inputValue(this.registerEmail, username, "registerEmail");
		clearField(this.registerPassword, "registerPassword");
		inputValue(this.registerPassword, password, "registerPassword");
		clickElement(secondaryLoginLink, "secondaryLoginLink");
		return new HomePage(driver);

	}

}
