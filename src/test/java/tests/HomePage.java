package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	//Page Factory or Object Repository
	
	@FindBy(xpath = "//*[@id='gh-ac']")
	WebElement eyelashes; 
	
	@FindBy(xpath = "//*[@id='gh-btn']")
	WebElement Search;  
	
	@FindBy(xpath = "//*[@id='srp-river-results-listing1']/div/div[1]/div/a/div/img")
	WebElement imageeyelashes;
	
	@FindBy(xpath = "//select[@name='Color']")
	WebElement Color; 
	
	@FindBy(xpath ="//*[@id='qtyTextBox']")
	WebElement Quantity; 
	
	@FindBy(xpath ="//*[@id='atcRedesignId_btn']")
	WebElement Addtobasket; 
	
	@FindBy(xpath ="//*[@id='atcRedesignId_overlay-atc-container']/div/div[1]/div/div[2]/a[1]")
	WebElement Checkout; 
	
	//Initialising the page object
	  public HomePage(){
	  PageFactory.initElements(driver, this);   
	}
	  
    //Actions 
	 public void Home_Page(){
		 eyelashes.sendKeys("eyelashes");
		 Search.click();
		 imageeyelashes.click();
		 Color.isDisplayed();
		 Quantity.sendKeys("1");   
		 Addtobasket.click();
		 Checkout.click();
	 }
}
