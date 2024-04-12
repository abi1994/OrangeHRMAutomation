package com.abi.test.pageobject.Tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.abi.test.pageobject.Pages.HomePage;
import com.abi.test.pageobject.Pages.Register.RegisterUserPage;
import com.abi.test.pageobject.TestData.RegisterValidDataProvider;
import com.abi.test.pageobject.Utils.Constans;
import com.abi.test.pageobject.Utils.TestBase;

public class RegisterUserTest extends TestBase {
    private static final Logger LOGGER =Logger.getLogger(RegisterUserTest.class);
    
    
    @Test(priority = 1)
    public void RegisterPageTest( ){
        softAssert = new SoftAssert();
        softAssert.assertEquals(HomePage.IsDisplayHeading(), "Hotel Booking");
        HomePage.ClickRegisterPage();
        softAssert.assertTrue(RegisterUserPage.IsDisplayHeading(),"Login Page is not Avalilable");
        RegisterUserPage.InputFullName(Constans.FULLNAME);
        RegisterUserPage.InputEmailId(Constans.EMAIL);
        RegisterUserPage.InputPassWord(Constans.CUSPASSWORD);
        RegisterUserPage.InputMobileNumber(Constans.MOBILE);
        RegisterUserPage.InputAddress(Constans.ADDRESS);
        RegisterUserPage.ClickSubmite();
        softAssert.assertAll();
    	
    }

    @Test(priority = 2, dataProvider = "testData", dataProviderClass = RegisterValidDataProvider.class)
    public void RegisterPageWithExcelTest(String fullName, String email, String password, String mobileNumber, String address) {

        softAssert = new SoftAssert();
        softAssert.assertEquals(HomePage.IsDisplayHeading(), "Hotel Booking");
        HomePage.ClickRegisterPage();
        softAssert.assertTrue(RegisterUserPage.IsDisplayHeading(),"Login Page is not Avalilable");
        RegisterUserPage.InputFullName(fullName);
        RegisterUserPage.InputEmailId(email);
        RegisterUserPage.InputPassWord(password);
        RegisterUserPage.InputMobileNumber(mobileNumber);
        RegisterUserPage.InputAddress(address);
        RegisterUserPage.ClickSubmite();
        softAssert.assertAll();
    	
    }

}
