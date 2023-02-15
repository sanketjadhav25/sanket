package Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing { 
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	}

}
