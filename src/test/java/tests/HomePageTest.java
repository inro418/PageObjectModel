package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HomePageTest {
	
	WebDriver driver;

	@Test
	public void Checkout(){   

		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.co.uk/"); 
	
		//1. Enter eyeslashes
		driver.findElement(By.xpath("//*[@id='gh-ac']")).sendKeys("eyeslashes"); 
	
		//2. Click search button
		driver.findElement(By.xpath("//*[@id='gh-btn']")).click(); 
		
		//3. Click imageeyeslashes 
		driver.findElement(By.xpath("//*[@id='srp-river-results-listing1']/div/div[1]/div/a/div/img")).click(); 
		
		//4. Colour 3D-A01
		//WebElement DropDownmenuColor = driver.findElement(By.xpath("//select[@name='Color']")); 
		//Select select = new Select(DropDownmenuColor);   
		//select.selectByValue("3D-A01");  
		
		//5. Quantity
		driver.findElement(By.xpath("//*[@id='qtyTextBox']")).sendKeys("1");  
		
		//6. Click Add to basket
		driver.findElement(By.xpath("//*[@id='atcRedesignId_btn']")).click();  
		
		//7. Click Checkout
		driver.findElement(By.xpath("//a[@href='https://cart.ebay.co.uk/api/xo?_trksid=p2484178.m4865.l8877']")).click();
    }
}