package pomModules1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mesmerize {
			
	@FindBy(xpath="//*[@class='Header__Icon Icon-Wrapper Icon-Wrapper--clickable hidden-desk']")
	 WebElement drop ;
	@FindBy(xpath="(//*[contains(@class,'Collapsible__Button Heading u-h6')])[1]")
	WebElement womenjwellery ;
	@FindBy(xpath="(//*[contains(@class,'Collapsible__Button Heading Text--subdued Link Link--primary u-h7')])[2]")
	WebElement naturaljwellery ;
	//constructor
	public Mesmerize (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
	//methods
		 public void clickdrop() {
			drop.click(); 
		 }
		 public void clickwomenjwellery() {
			 womenjwellery.click(); 
		 }
		 public void clicknaturaljwellery() {
			 naturaljwellery.click();
		 }


	
				
	}
