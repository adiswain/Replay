package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoadBoardPage extends HomePage {

	public LoadBoardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[@id=\"title\" and contains(text(),\"Load Board\")]")
	private WebElement loadBoradHeader;

	@FindBy(xpath = "//*[@id=\"rlb-top-nav-bar\"]/div/label[2]/span/div")
	private WebElement searchLink;

	@FindBy(xpath = "//div[@class=\"css-14lg5yy\"]/label")
	private WebElement workTypeLabel;
	
	@FindBy(xpath = "(//div[@class=\"css-14lg5yy\"]/div/div)[1]")
	private WebElement selectedValue;
	
	@FindBy(xpath = "(//*[@class=\"css-1erby4s\"]/span)[1]")
	private WebElement firstCrossButton;
	
	@FindBy(xpath = "//div[@id=\"filter-summary__result-summary\"]/p")
	private WebElement resultsRange;
	
	
	  @FindBy(xpath = "(//div[@class=\"css-14lg5yy\"]/div/div)[2]") 
	  private WebElement inputOriginlabel;
	 
	
	@FindBy(xpath = "(//div[@class=\"css-14lg5yy\"]/div/input)[1]")
	private WebElement inputOrigin;
	
	@FindBy(xpath = "(//div[@class=\"css-14lg5yy\"]/div/div)[3]")
	private WebElement selectedRadius;
	
	@FindBy(xpath = "(//span[@class=\"css-1gp38wa\"])[1]")
	private WebElement refreshButton;
	
	@FindBy(xpath = "//*[@id=\"rlb-top-nav-bar\"]/div/label[3]/span/div")
	private WebElement postATruckLabel;
	
	

	/*
	 * @FindBy(xpath="//div[@class=\"css-1gughuu\"]/span[2]") private WebElement
	 * productName;
	 */

	public LoadBoardPage validateLoadBoardPage() throws Exception

	{
		elementIsPresent(loadBoradHeader, "loadBoradHeader");
		return this;
	}
	
	
	public LoadBoardPage clickOnSearch() throws Exception

	{
		elementIsPresent(searchLink, "searchLink");
		clickElement(searchLink, "searchLink");
		clickElement(firstCrossButton, "firstCrossButton");
		clickElement(firstCrossButton, "firstCrossButton");
		//clickElement(secondCrossButton, "secondCrossButton");
		
		return this;
	}
	
	public LoadBoardPage clickOnWorkTypeDropDown() throws Exception

	{
		
		clickElement(selectedValue, "selectedValue");
		Actions actions = new Actions(driver);
	    
	    int getX = selectedValue.getLocation().getX(); 
	    LOGGER.info("X coordinate: " +getX); 
	     int getY = selectedValue.getLocation().getY(); 
	     LOGGER.info("Y coordinate: " +getY);
	     
			/*
			 * int getX1 = resultsRange.getLocation().getX(); LOGGER.info("X1 coordinate: "
			 * +getX1); int getY1 = resultsRange.getLocation().getY();
			 * LOGGER.info("Y1 coordinate: " +getY1);
			 */
			
	     actions.moveByOffset(getX, getY+80).click().build().perform();
	     clickElement(selectedValue, "selectedValue");
			 
	     
	    Thread.sleep(10000);
	    LOGGER.info("clicked successfully");
		
		return this;
	}
	
	public LoadBoardPage enterOriginCity(String cityName) throws Exception

	{
		
		clickElement(inputOriginlabel, "inputOriginlabel");
		inputValue(this.inputOrigin, cityName, "inputOrigin");
		inputOrigin.sendKeys(Keys.ENTER);		
		return this;
	}
	
	public LoadBoardPage clickOnRadius() throws Exception

	{
		
		clickElement(selectedRadius, "selectedRadius");
		Actions actions = new Actions(driver);
	    
	    int getX = selectedRadius.getLocation().getX(); 
	    LOGGER.info("X coordinate: " +getX); 
	     int getY = selectedRadius.getLocation().getY(); 
	     LOGGER.info("Y coordinate: " +getY);
	     
	     
			  int getX1 = postATruckLabel.getLocation().getX(); 
			  LOGGER.info("X1 coordinate: "+getX1);
			  int getY1 = postATruckLabel.getLocation().getY();
			  LOGGER.info("Y1 coordinate: " +getY1);
			 
	     
			
	     actions.moveByOffset(getX, getY-210).click().build().perform();
	     clickElement(selectedRadius, "selectedRadius");
			 
	     
	    Thread.sleep(10000);
	    LOGGER.info("clicked successfully");
		
		return this;
	}
	
	public LoadBoardPage clickOnRefresh() throws Exception

	{
		elementIsPresent(refreshButton, "refreshButton");
		clickElement(refreshButton, "refreshButton");
		
		return this;
	}
	

	/*
	 * public LoadBoardPage clickOnProduct() throws Exception
	 * 
	 * {
	 * 
	 * clickElement(productLinks, "productLinks"); return this; }
	 * 
	 * public LoadBoardPage clickOnAddToBasket() throws Exception
	 * 
	 * {
	 * 
	 * clickElement(addToBasket, "addToBasket"); return this; }
	 */

	/*
	 * public MyBasketPage clickOnCheckOut() throws Exception
	 * 
	 * {
	 * 
	 * clickElement(checkOut, "checkOut"); return new MyBasketPage(driver); }
	 * 
	 * public String collectProductName() throws Exception
	 * 
	 * {
	 * 
	 * return productLinks.getText(); }
	 */
}
