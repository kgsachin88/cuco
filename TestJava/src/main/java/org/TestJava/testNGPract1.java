package org.TestJava;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testNGPract1 extends BeforeSuite {

	@Test(priority = 1)
	public void test3() {
		
		System.out.println("This is the 3rd Test");
		Assert.assertTrue(false);
	}
	
	@Test(priority = 2,dependsOnMethods = {"test3"},alwaysRun = true)
	public void test4() {
		
		System.out.println("This is the 4th Test");
	}
	
}
