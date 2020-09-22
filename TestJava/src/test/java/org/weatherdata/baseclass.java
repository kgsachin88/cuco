package org.weatherdata;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

/*import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
*/
public class baseclass {

	public WebDriver driver = null;
	@BeforeMethod
	public void setup() {
		String Chromepath =".\\Resources\\chromedriver.exe";
		String url = "https://www.timeanddate.com/";
		System.setProperty("webdriver.chrome.driver", Chromepath);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
		driver.quit();
	}
	
	
	/*
	 * public ExtentReports extent; public ExtentTest logger;
	 */
	@BeforeTest
	public void startExtentTest() {
		
		/*
		 * extent = new ExtentReports(System.getProperty("user.dir")+
		 * "\\test-output\\Extent-Report.html",true); extent.addSystemInfo("Name",
		 * "Sachin");
		 */
	}
	
	/*
	 * @AfterTest public void endextentTets() { extent.flush(); extent.close(); }
	 */
	
}
