package parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametersPractice {

	@Parameters({"browser"})
	@Test
	public void getBrowser(String browser) {
		
		System.out.println("The Browser selected is :"+browser);
	}
	
	@Parameters({"userName", "password"})
	@Test
	public void getBrowser(String userName,String password) {
		
		System.out.println(userName+"---------"+password);
	}
	
}
