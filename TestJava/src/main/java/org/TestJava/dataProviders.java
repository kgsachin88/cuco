package org.TestJava;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviders {

	@Test(dataProvider = "getData")
	public void login(String Un, String Pwd) {
		
		System.out.println(Un+"------"+Pwd);
	}
	
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[2][2];
		data[0][0] = "Sachin";
		data[0][1] = "TEst123";
		data[1][0] = "sghjasd";
		data[1][1] = "Password";
		
		return data;
	}
	
}
