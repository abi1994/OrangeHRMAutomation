package com.abi.test.pageobject.TestData;

import org.testng.annotations.DataProvider;

public class LoginInvalidUserDataProvider {

    @DataProvider
    public static Object[][] MultipleUserDetails(){
        return new Object[][]{
                {"",""},
                {"","Selvain@12"},
                {"abirameselvendranceymblpon@gmail.com",""},
                {"abirameselvendranceymblpon@gmail","Selvain@12"},
                {"abirameselvendranceymblpon@gmail.com","selvain@12"}
        };
    }

}
