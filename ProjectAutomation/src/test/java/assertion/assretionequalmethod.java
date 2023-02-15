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

	public class assretionequalmethod{
		
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
		//this method compare the data
		//take the decision to pass/fail
		//if actual result is equals to expected result then testcase is passed
		//if actual result is not equals to expected result then testcase is failed
		//third argument is for understand the defect present in the testcase(this message is print when testcase is failed)
		@Test
		public void test1() {
			System.out.println("test1-testclass2");
			String actualtitle="forgotten home page";
			String expectedtitle="forgotten home page";
			Assert.assertEquals(actualtitle, expectedtitle);
		}
		
		@Test
		public void test3() {
			System.out.println("test1-testclass2");
			String actualtitle="forgotten home page";
			String expectedtitle="forgotten home page1234";
			Assert.assertEquals(actualtitle, expectedtitle,"home page title is wrong");
		}

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



