package com.abi.test.pageobject.Tests;

import com.abi.test.pageobject.Pages.HomePage;
import com.abi.test.pageobject.Pages.Login.ForgotPasswordPage;
import com.abi.test.pageobject.Pages.Login.LoginPage;
import com.abi.test.pageobject.TestData.LoginInvalidUserDataProvider;
import com.abi.test.pageobject.TestData.LoginValidUserDataProvider;
import com.abi.test.pageobject.Utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends TestBase {
    private static final Logger LOGGER =Logger.getLogger(LoginTest.class);
    @Test(priority = 1,dataProvider = "MultipleUserDetails",dataProviderClass = LoginInvalidUserDataProvider.class)
    public void LoginPageTest(String username ,String Password ){
        softAssert =new SoftAssert();
        softAssert.assertTrue(LoginPage.IsDisplayLoginPage(),"This is not Login Page ");
        LoginPage.InputUserName(username);
        LoginPage.InputPasswordName(Password);
        LOGGER.info("Login the loginpage");
        LoginPage.Clicksubmit();

        softAssert.assertTrue(LoginPage.IsDisplayInvalidMessage(),"Invalid Message is not display");
        //softAssert.assertEquals(LoginPage.GetLoginMessage(),"Invalid credentials");
        softAssert.assertAll();
    }
    @Test(priority = 2,dataProvider = "ValidUserDetails",dataProviderClass = LoginValidUserDataProvider.class)
    public void LoginPagevalidTest(String username ,String Password ){
        softAssert =new SoftAssert();
        softAssert.assertTrue(LoginPage.IsDisplayLoginPage(),"This is not Login Page ");
        LoginPage.InputUserName(username);
        LoginPage.InputPasswordName(Password);
        LOGGER.info("Login the loginpage");
        LoginPage.Clicksubmit();
        softAssert.assertTrue(HomePage.IsDisplayHeading(),"Home Page is not Display");
        softAssert.assertAll();
    }

    @Test(priority = 3)
    public void forgotpassword(){
        softAssert =new SoftAssert();
        softAssert.assertTrue(ForgotPasswordPage.IsdiplayHeading(),"forgotpassword is display");
        LoginPage.ClickForgotpassword();
        LOGGER.info("forgotpassword page ");
        ForgotPasswordPage.InputUserName("admin");
        ForgotPasswordPage.Resetpassword();
       // softAssert.assertTrue(ForgotPasswordPage.IsDisplayAlterMessage(),"Invalid Message is appear the page");
       // softAssert.assertEquals(ForgotPasswordPage.getAlterMessage(),"\n" +
          //      "Please contact HR admin in order to reset the password   \n" +
              //  "    ");
        ForgotPasswordPage.Clickcansal();

    }

}
