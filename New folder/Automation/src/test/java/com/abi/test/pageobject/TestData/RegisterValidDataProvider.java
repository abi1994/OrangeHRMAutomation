package com.abi.test.pageobject.TestData;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.abi.test.pageobject.Utils.ExcelUtils;

public class RegisterValidDataProvider {
	
	 @DataProvider
	    public Object[][] testData() throws IOException {
	        return ExcelUtils.getTestData("//HotelBookingAutomation//src//test/resources//RegisterData.xlsx", "Sheet1");
	    }

}
