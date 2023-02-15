package Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pomModules1.Mesmerize;
import pomModules1.chleopatranaturalgold;
import pomModules1.naturalpearljwellery;

public class mesmerize{
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","c:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get("https://mesmerizeindia.com/");
		
		Mesmerize Mesmerize=new Mesmerize(driver);
		Mesmerize.clickdrop();
		Mesmerize.clickwomenjwellery();
		Mesmerize.clicknaturaljwellery();
		
		naturalpearljwellery  naturalpearljwellery =new naturalpearljwellery (driver);
		naturalpearljwellery.clickcleopatraneckles();
		
		chleopatranaturalgold chleopatranaturalgold=new chleopatranaturalgold(driver);
		chleopatranaturalgold.clickquantity();
		chleopatranaturalgold.clickaddtocart();
		
		String actualURL=driver.getCurrentUrl();
		String actualtitle=driver.getTitle();
		
		String expectedURL="https://mesmerizeindia.com/products/cleopatra-gold-necklace";
		String expectedtitle="Cleopatra Gold Natural Pearl Necklace – Mesmerize India";
		
		if(actualURL.equals(expectedURL)&& actualtitle.equals(expectedtitle))
		{
			System.out.println("test pass");
		}
		else 
		{
			System.out.println("test fail");
		}
		//System.out.println(actualURL);
		//System.out.println(actualtitle);
		
		}
			

}
