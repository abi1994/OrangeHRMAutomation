package com.abi.test.pageobject.TestData;

import org.testng.annotations.DataProvider;

public class LoginValidUserDataProvider {

    @DataProvider
    public static Object[][] ValidUserDetails() {
        return new Object[][]{
                {"admin", "admin123"},
                {"Admin", "admin123"}
        };
    }
}