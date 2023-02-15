package pomModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class w3school {
	@FindBy(xpath="//a[@href='tryit.asp?filename=tryjs_alert']")
	private WebElement tryityourself;

	
	//constructor
	public w3school(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
	
	//methods
	 public void clicktryityourself() {
		 tryityourself.click(); 
	 }
}
