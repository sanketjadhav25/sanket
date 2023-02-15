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

public class testclass2 {
	
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
	@Test
	public void test1() {
		System.out.println("test1-testclass2");
	}
	@Test 
	public void testa() {
		System.out.println("test a-testclass2");
	}
	@Test 
	public void testb() {
		System.out.println("test b-testclass2");
	}
	@Test 
	public void testc() {
		System.out.println("test c-testclass2");
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

