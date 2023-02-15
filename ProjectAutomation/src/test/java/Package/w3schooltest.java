package Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomModules.w3createawebsite;
import pomModules.w3login;
import pomModules.w3school;
import pomModules.w3schooltryiteditor;

public class w3schooltest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		w3school w3school=new w3school(driver);
		w3school.clicktryityourself();
		
		
		
		w3schooltryiteditor w3schooltryiteditor=new w3schooltryiteditor(driver);
	  //  w3schooltryiteditor.switchtotargetframe();
		w3schooltryiteditor.clicktryit();
		w3schooltryiteditor.clickgetweb();
		
		w3createawebsite w3createawebsite=new w3createawebsite(driver);
		w3createawebsite.clicklogin();
	

		w3login w3login=new w3login(driver);
		w3login.clicksignup();
		w3login.sendkeysemail("jadhavsanket2525@gmail.com");
		w3login.sendkeyspass("sank@2525");
		w3login.clicksignupforfree();
		w3login.sendkeysfirstname("sanket");
		w3login.sendkeyslastname("jadhav");
		w3login.clickconti();
	
	}

}
