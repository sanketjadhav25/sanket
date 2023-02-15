package pomModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class w3createawebsite {
	@FindBy(xpath="//button[@class='_1VfsI _OD95i _3_H0V login']")
	private WebElement login;
	 constructor
	public  w3createawebsite (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
	
	//methods
	 public void clicklogin() {
		 login.click(); 
	 }

}
