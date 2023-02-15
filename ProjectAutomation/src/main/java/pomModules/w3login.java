package pomModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class w3login {
	@FindBy(xpath="//*[text()=' Sign up']")
	private WebElement signup;
	
	//@FindBy(xpath="//*[@id='modalusername']")
	@FindBy(xpath="//*[@id='modalusername123']")
	private WebElement email;
	@FindBy(xpath="//*[@id='new-password']")
	private WebElement pass;
	@FindBy(xpath="//*[text()='Sign up for free']")
	private WebElement signupforfree;
	@FindBy(xpath="//*[@id='modal_first_name']")
	private WebElement firstname;
	@FindBy(xpath="	//*[@id='modal_last_name']")
	private WebElement lastname;
	@FindBy(xpath="//*[text()='Continue']")
	private WebElement conti;

	//constructor
	public  w3login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
		//methods
		 public void clicksignup() {
			 signup.click();
		 }
		 public void sendkeysemail(String mailid) {
			 email.sendKeys(mailid); 
		 }
		 public void sendkeyspass(String password) {
			 pass.sendKeys(password); 
		 }
		 public void clicksignupforfree() {
			 signupforfree.click(); 
		 }
		 public void sendkeysfirstname(String name) {
			 firstname.sendKeys(name); 
		 }
		 public void sendkeyslastname(String last) {
			 lastname.sendKeys(last); 
		 }
		 public void clickconti() {
			 conti.click(); 
		 }

}

