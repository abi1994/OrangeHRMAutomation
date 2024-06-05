package com.abi.test.pageobject.Tests;

import com.abi.test.pageobject.Pages.HomePage;
import com.abi.test.pageobject.Pages.Login.LoginPage;
import com.abi.test.pageobject.TestData.LoginInvalidUserDataProvider;
import com.abi.test.pageobject.TestData.LoginValidUserDataProvider;
import com.abi.test.pageobject.Utils.Constans;
import com.abi.test.pageobject.Utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends TestBase {
    private static final Logger LOGGER =Logger.getLogger(LoginTest.class);
    @Test(priority = 1,dataProvider = "MultipleUserDetails",dataProviderClass = LoginInvalidUserDataProvider.class)
    public void LoginPageTest(String username ,String Password ){
        softAssert =new SoftAssert();
        softAssert.assertTrue(HomePage.IsDisplayHeading(), "This is Hotel Booking Page");
        LOGGER.info("Home Page ");
        HomePage.ClickLoginPage();
        LOGGER.info("Login the loginpage");
        softAssert.assertTrue(LoginPage.IsDisplayLoginPage(),"This is not Login Page ");
        LoginPage.InputUserName(username);
        LoginPage.InputPasswordName(Password);
        LoginPage.Clicksubmit();
        softAssert.assertEquals(LoginPage.GetLoginMessage(), "Invalid email/password!!");
        softAssert.assertAll();
       
    }
    @Test(priority = 2)
    public void LoginPagevalidTest( ){
    	 softAssert =new SoftAssert();
         softAssert.assertTrue(HomePage.IsDisplayHeading(), "Hotel Booking");
         LOGGER.info("Home Page ");
         HomePage.ClickLoginPage();
         LOGGER.info("Login the loginpage");
         softAssert.assertTrue(LoginPage.IsDisplayLoginPage(),"This is not Login Page ");
         LoginPage.InputUserName(Constans.CUSTERMERNAME);
         LoginPage.InputPasswordName(Constans.CUSPASSWORD);
         LoginPage.Clicksubmit();
         LOGGER.info("login the cusermer");
         softAssert.assertTrue(LoginPage.IsDisplayLogOut(),"Logout");
         softAssert.assertAll();
    }

  

}
