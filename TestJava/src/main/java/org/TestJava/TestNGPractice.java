package org.TestJava;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGPractice extends BeforeSuite {

	public SoftAssert softassert ;
	@Test(description = "This is the first test",testName = "TestCase001")
	public void Test1() {
		
		System.out.println("This is the Test1 Block");
		Assert.assertEquals("Test", "Test");
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods = "Test1")
	public void Test2() {
		
		System.out.println("This is the Test2 Block");
	    softassert = new SoftAssert();
		softassert.assertTrue(true);
		
		softassert.assertAll();
	}
	
	@BeforeTest()
	public void beforeTest() {
		System.out.println("This is the Before Test Method");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This is the After Test Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is the After Method Block");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is the Before Method Block");
	}
}
