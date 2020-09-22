package org.TestJava;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BeforeSuite {
	
	@BeforeClass
	public void setup() {
		System.out.println("This is the Before Class block");
	}
	
	@AfterClass
	public void TearDown() {
		System.out.println("This is the After Class Block");
	}

}
