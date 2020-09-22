package org.extentreport;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
//import com.relevantcodes.extentreports.LogStatus;

public class extenttest extends extebtbaseclase{

	Logger log = Logger.getLogger(this.getClass().getSimpleName());
	@Test
	public void passTest(Method m) {
		
		
		logger = extent.createTest(m.getName());
		logger.log(Status.INFO, "Test case Passed");
		log.info(m.getName()+" Test started");
				
		
		
	}
	
	@Test
	public void failTest(Method m) {
		
		logger = extent.createTest(m.getName());;
		Assert.assertEquals("we", "weeeee");
		
	}
	
	@Test
	public void skiptest(Method m) {
		
		logger = extent.createTest(m.getName());;
		throw new SkipException("Skipping thi test");
	}
	
	
		
	
	
}
