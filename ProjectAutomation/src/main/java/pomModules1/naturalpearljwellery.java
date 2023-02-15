package pomModules1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class naturalpearljwellery {
	@FindBy(xpath="//*[text()='Cleopatra Gold Natural Pearl Necklace']")
	WebElement cleopatraneckles ;
     //constructor
	public naturalpearljwellery(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//methods
	public void clickcleopatraneckles() {
		cleopatraneckles.click();
	}
	
	
	
}
