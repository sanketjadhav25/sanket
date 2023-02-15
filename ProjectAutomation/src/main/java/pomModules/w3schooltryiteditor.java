package pomModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class w3schooltryiteditor {
	public WebDriver driver;
	@FindBy(xpath="//iframe[@id='iframeResult']")
	private WebElement targetframe;
	
	@FindBy(xpath="//button[@onclick='myFunction()']")
	private WebElement tryit;
	
	@FindBy(xpath="//a[@id='getwebsitebtn']")
	private WebElement getweb;
	
	//constructor
	public w3schooltryiteditor (WebDriver ldriver)
	{
		PageFactory.initElements(ldriver, this);
	}
	
	//methods
	//public void switchtotargetframe() {
		//driver.switchTo().frame(targetframe);
//	}
	public void clicktryit() {
		tryit.click();
	}
	public void clickgetweb () {
		getweb.click();
		
}
}
