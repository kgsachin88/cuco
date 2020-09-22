package org.extentreport;

import org.apache.log4j.PropertyConfigurator;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
/*import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;*/
import com.aventstack.extentreports.Status;



public class extebtbaseclase {

	
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;
	
	@BeforeTest
	public void startExtentTest() {
		
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\ExtentResults\\Extent-Report.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		htmlReporter.config().setDocumentTitle("Automation Report"); // Tittle of Report
		htmlReporter.config().setReportName("Extent Report V4"); // Name of the report
		htmlReporter.config().setTheme(Theme.DARK);
		
		extent.setSystemInfo("Name", "Sachin");
		
		 PropertyConfigurator.configure("Log4j.properties");
		  
		 
		
	}
	
	@AfterTest
	public void endextentTets() {
		extent.flush();
		
	}
	
	@AfterMethod
	public void getResult(ITestResult r) {
		
		if(r.getStatus() == ITestResult.SUCCESS) {
			logger.log(Status.PASS, r.getName() +" Test case Passed");
			
			
		}else if (r.getStatus() == ITestResult.FAILURE) {
			logger.log(Status.FAIL, r.getName() +" Test case failed ");
			
		}else if (r.getStatus()== ITestResult.SKIP) {
			logger.log(Status.SKIP, r.getName()+"Test Skipped");
			
		}}
	
}
