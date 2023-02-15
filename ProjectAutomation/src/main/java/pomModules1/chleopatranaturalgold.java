package pomModules1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class chleopatranaturalgold {
	@FindBy(xpath="(//*[contains(@class,'QuantitySelector__Button Link Link--secondary')])[2]")
	WebElement quantity ;
	@FindBy(xpath="//*[text()='Add to cart']")
	WebElement addtocart ;
	//constructor
	public chleopatranaturalgold(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//methods
	public void clickquantity() {
		quantity.click();
	}
	public void clickaddtocart() {
		addtocart.click();
	}

}
