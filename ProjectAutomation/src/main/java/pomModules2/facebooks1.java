package pomModules2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebooks1 {
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement 	createnewacc;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement 		firstname	;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement 		lastname;
	
	@FindBy(xpath="//input[@aria-label='Mobile number or email address']")
	private WebElement 		email;
	
	@FindBy(xpath="//input[@name='reg_email_confirmation__']")
	private WebElement 	 reentermail;
	
	@FindBy(xpath="//input[@id='password_step_input']")
	private WebElement password	;
	
	@FindBy(xpath="//select[@id='day']")
	private WebElement s	;

	
	@FindBy(xpath="//*[@id='month']")
	private WebElement 	s1;

	
	@FindBy(xpath="//*[@id='year']")
	private WebElement 	s2 ;

	
	@FindBy(xpath="(//*[contains(@class,'_58mt')])[2]")
	private WebElement 		gender;

	
	@FindBy(xpath="//*[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")
	private WebElement 	signup;



    //constructor
       public facebooks1(WebDriver driver) {
    	   PageFactory.initElements(driver, this);
       }
       
       //Methods
        public void clickcreatenewacc() {
    	   createnewacc.click();
       }
       public void sendKeysfirstname(String first) {
    	   firstname.sendKeys(first);
       }
       public void sendKeyslastname(String last) {
    	   lastname.sendKeys(last);
       }
    	   
       public void sendKeysemail(String mail) {
    	   email. sendKeys(mail);
       }
    	   
       public void sendKeysreentermail(String remail) {
    	   reentermail.sendKeys(remail);
       }
    	   
       public void passwordsendKeys(String pass) {
    	   password.sendKeys (pass);
       }
    	   
       public void  sendKeyss	 (String day) {
    	   s.sendKeys(day);
       }
    	   
       public void sendKeyss1(String month) {
    	   s1.sendKeys(month);
       }
    	   
       public void sendKeyss2(String year) {
    	   s2.sendKeys(year);
       }
    	   
       public void clickgender() {
    	   gender .click();
       }
    	   
       public void clicksignup() {
    		signup.click();
       }
    	   
    	   
       }
