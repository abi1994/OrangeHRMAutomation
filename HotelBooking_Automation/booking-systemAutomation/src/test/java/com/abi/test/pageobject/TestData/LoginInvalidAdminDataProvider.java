package com.abi.test.pageobject.TestData;

import org.testng.annotations.DataProvider;

public class LoginInvalidAdminDataProvider {
    @DataProvider
    public static Object[][] MultipleUserDetails(){
        return new Object[][]{

                {"admin@gmail","admin"},
                {"admin@gmail","Admin"}
        };
    }
	
	
}
