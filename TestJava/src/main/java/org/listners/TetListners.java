package org.listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TetListners implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+" Test Execution Started");
		
	}


	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case Passed");
		Reporter.log("Test Case Passed");
		
	}


	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Capturing the Screen Shot");
	}


	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}


	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}


	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
