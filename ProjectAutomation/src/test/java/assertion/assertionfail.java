package assertion;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class assertionfail {
	
	public WebDriver driver;
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("Before Test-testclass2");	
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before Class-testclass2");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before Method-testclass2");
	}
	//forcefully fail the testcase
	//in this code if result true ==true then testcase is passed means testcase is failed
	//if result true == false then testcase i failed means testcase is passed
		@Test
		public void test1() {
			System.out.println("test1-testclass2");
			String actualtitle="forgotten home page";
			String expectedtitle="forgotten home page1234";
			boolean result=actualtitle.equals(expectedtitle);
		   // Assert.fail();
		 if (result ==false) {
			 Assert.fail();
		 }
		}
	//	@Test
	//	public void test2() {
	//		System.out.println("test1-testclass2");
	//		String actualtitle="forgotten home page";
	//		String expectedtitle="forgotten home page";
	//		boolean result=actualtitle.equals(expectedtitle);
	//	 Assert.assertFalse(result,"home page title is same");
	//	}
		@AfterClass
		public void afterclass() {
			System.out.println("After Class-testclass2");
	}
		@AfterMethod
		public void aftermethod() {
			System.out.println("After Method-testclass2");
		}
		@AfterTest
		public void aftertest() {
			System.out.println("After Test-testclass2");
		}
		@AfterSuite
		public void aftersuite() {
			System.out.println("After Suite");
		}
		


}
