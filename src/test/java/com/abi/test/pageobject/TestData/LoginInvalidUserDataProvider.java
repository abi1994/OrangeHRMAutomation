package com.abi.test.pageobject.TestData;

import org.testng.annotations.DataProvider;

public class LoginInvalidUserDataProvider {

    @DataProvider
    public static Object[][] MultipleUserDetails(){
        return new Object[][]{
                {"",""},
                {"","admin123"},
                {"Admin",""},
                {"Admin","admin"},
                {"admin","admin"}
        };
    }

}
