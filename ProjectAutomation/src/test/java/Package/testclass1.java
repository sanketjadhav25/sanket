package Package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testclass1 {
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("Before Test-testclass1");
		}
	@BeforeClass 
	public void beforeclas() {
		System.out.println("Before Class-testclass1");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before Method-testclass1");
	}
	@Test (priority=2)
	public void test1() {
		System.out.println("test1-testclass1");
	}
	@Test (priority=1)
	public void test2() {
		System.out.println("test2-testclass1");
	}
	@Test
	public void test3() {
		System.out.println("test3-testclass1");
	}
	@Test
	public void test4() {
		System.out.println("test4-testclass1");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("After Class-testclass1");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("After Method-testclass1");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("After Test-testclass1");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("after Suite");
	}
	


}
