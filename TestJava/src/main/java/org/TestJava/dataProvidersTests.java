package org.TestJava;

import org.testng.annotations.Test;

import dataProviders.dataProvidersGeneric;

public class dataProvidersTests {

	@Test(dataProviderClass = dataProvidersGeneric.class,dataProvider = "UserData")
	public void doLogin(String userName,String Password) {
		
		System.out.println(userName+"-------------"+Password);
	}
	
	@Test(dataProviderClass = dataProvidersGeneric.class,dataProvider = "UserData")
	public void doReg(String userName,String Password, String Gender) {
		
		System.out.println(userName+"-------------"+Password+"------------"+Gender);
		
	}
	
	@Test(dataProviderClass = dataProvidersGeneric.class,dataProvider = "Enter Details")
	public void doReg1(String userName,String Password) {
		
		System.out.println(userName+"-------------"+Password);
		
	}
}
