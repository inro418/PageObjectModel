package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignInPageTest {

	WebDriver driver;

	@Test
	public void DoShopping(){ 

		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// 1. Go to https://www.ebay.co.uk/
		driver.get("https://www.ebay.co.uk/");
		
		//2. Click SignLink
		driver.findElement(By.xpath("//*[@id='gh-ug']/a")).click(); 
	
		//3. Enter username
		driver.findElement(By.name("userid")).sendKeys("inro4ebony@gmail.com"); 
		
		//4. Enter password
		driver.findElement(By.name("pass")).sendKeys("isua41888");  
		
		//5. Click SignInBtn 
		//recaptcha - This is done manually 
		driver.findElement(By.id("sgnBt")).click();
	}
}
