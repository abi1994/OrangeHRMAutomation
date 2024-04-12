package com.abi.test.pageobject.TestData;

import org.testng.annotations.DataProvider;

public class LoginValidUserDataProvider {

    @DataProvider
    public static Object[][] ValidUserDetails() {
        return new Object[][]{
                {"abirameselvendranceymblpon@gmail.com", "Selvain@07"},
                {"abirameselvendranceymplon@gmail.com", "Abirame@06"},
        };
    }
}