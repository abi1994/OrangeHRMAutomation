package com.abi.test.pageobject.TestData;

import org.testng.annotations.DataProvider;

public class LoginValidAdminDataProvider {

		@DataProvider
	    public static Object[][] ValidUserDetails() {
	        return new Object[][]{
	                {"admin@gmail.com", "admin"},
	        };
	    }
	

}
