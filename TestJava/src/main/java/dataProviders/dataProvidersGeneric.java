package dataProviders;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class dataProvidersGeneric {

	@DataProvider(name = "UserData")
	public static Object[][] getData(Method m){
		
		Object[][] data = null;
		if(m.getName().equals("doLogin")) {
			data = new Object[2][2];

			data[0][0] = "Sachin";
			data[0][1] = "Password";
			
			data[1][0] = "KGS";
			data[1][1] = "Password";
 			
		}else if (m.getName().equals("doReg")) {
			data = new Object[2][3];

			data[0][0] = "Sachin";
			data[0][1] = "Password";
			data[0][2] = "Male";
			
			data[1][0] = "KGS";
			data[1][1] = "Password";
			data[1][2] = "Male";
			
			
		}
		return data;
	}
	
	@DataProvider(name = "Enter Details")
	public static Object[][] details(){
		Object[][] data2 = new 	Object[2][2];
		data2[0][0] = "Nayana";
		data2[0][1] = "Password1234";
		
		data2[1][0] = "R";
		data2[1][1] = "Password1234";
		
		return data2;
	}
	
	
}
