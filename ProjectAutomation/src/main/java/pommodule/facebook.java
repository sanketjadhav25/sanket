package pommodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebook {
	
	@FindBy(xpath="//*[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//*[@id='pass']")
	private WebElement pass;
	
	@FindBy(xpath="//button[@name='login']")
	 private WebElement login;
	
	
	public facebook (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//methods
	
	public void sendKeysemail(String mail) {
		email.sendKeys(mail);
	}
	public void sendKeyspass(String password) {
		pass.sendKeys(password);
	}
	
	public void clicklogin() {
		login.click();
	}
	

}
