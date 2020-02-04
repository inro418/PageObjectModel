package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	WebDriver driver;
	
	//Page Factory or Object Repository
	@FindBy(xpath = "//*[@id='gh-ug']/a")
	WebElement signInLink;  
	
	@FindBy(name = "userid")
	WebElement userid; 
	
	@FindBy(name = "pass")   
	WebElement pass;    
	
	@FindBy(id="sgnBt")  
	WebElement signInBtn; 
	
    //Initialising the Page Object
	public SignInPage(){
		PageFactory.initElements(driver, this);    
	}
	
	//Actions
	public HomePage SignIn(String username, String password){
		signInLink.click();
		userid.sendKeys(username);
		pass.sendKeys(password);
		signInBtn.click();   
		
		return new HomePage();  
	}
}
