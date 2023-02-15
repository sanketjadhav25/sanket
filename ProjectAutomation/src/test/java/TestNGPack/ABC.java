package TestNGPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pomModules1.Mesmerize;
import pomModules1.chleopatranaturalgold;
import pomModules1.naturalpearljwellery;

public class ABC {
	
	
	
	private WebDriver driver;
	private Mesmerize Mesmerize;
	private naturalpearljwellery  naturalpearljwellery ;
	private chleopatranaturalgold chleopatranaturalgold;
	
	@Parameters ("browser")
	@BeforeSuite
	public void beforesuite() {
		System.out.println("hi");
	}
	
	@BeforeTest
	public void beforetest() {
		
			
		//System.setProperty("webdriver.chrome.driver","c:\\chromedriver_win32\\chromedriver.exe");
		//driver=new ChromeDriver();
			
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		driver=new FirefoxDriver ();
	
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		}
	
	@BeforeClass 
	public void beforeclass() {
		 Mesmerize=new Mesmerize(driver);
	     naturalpearljwellery =new naturalpearljwellery (driver);
		 chleopatranaturalgold=new chleopatranaturalgold(driver);
	}
	
	@BeforeMethod
	public void beforemethod() {
		
		driver.get("https://mesmerizeindia.com/");
	}
	
	@Test 
	public void test1() {

				
			
		Mesmerize.clickdrop();
		Mesmerize.clickwomenjwellery();
		Mesmerize.clicknaturaljwellery();
		
		naturalpearljwellery.clickcleopatraneckles();
	
		chleopatranaturalgold.clickquantity();
		chleopatranaturalgold.clickaddtocart();
		
		String actualURL=driver.getCurrentUrl();
		String expectedURL="https://mesmerizeindia.com/products/cleopatra-gold-necklace";
		Assert.assertEquals(actualURL, expectedURL);
		
		String actualtitle=driver.getTitle();
		String expectedtitle="Cleopatra Gold Natural Pearl Necklace – Mesmerize India";
		
		Assert.assertEquals(actualtitle, expectedtitle);
		}

	
	@AfterMethod
	public void aftermethod() {
		
	}

    @AfterClass
    public void afterclass() {
    	 Mesmerize=null;
         naturalpearljwellery=null;
         chleopatranaturalgold=null;
	
    }

    @AfterTest
    public void aftertest() {
	driver.close();
	driver=null;
	System.gc();
   }


}
