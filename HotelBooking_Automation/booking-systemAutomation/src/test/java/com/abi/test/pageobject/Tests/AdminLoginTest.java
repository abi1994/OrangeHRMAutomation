package com.abi.test.pageobject.Tests;

import com.abi.test.pageobject.Pages.Admin.AdminDashBoardPage;
import com.abi.test.pageobject.Pages.Admin.Login.AdminLoginPage;
import com.abi.test.pageobject.TestData.LoginInvalidAdminDataProvider;
import com.abi.test.pageobject.TestData.LoginValidAdminDataProvider;
import com.abi.test.pageobject.Utils.AdminTestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AdminLoginTest extends AdminTestBase {
private static final Logger LOGGER =Logger.getLogger(AdminLoginTest.class);

@Test(priority = 1 ,dataProvider = "MultipleUserDetails",dataProviderClass = LoginInvalidAdminDataProvider.class)
    public void AdminLoginPageInvalidTest(String username ,String Password ){
    softAssert = new SoftAssert();
    softAssert.assertTrue(AdminLoginPage.IsDisplayLoginPage(),"Login Page is not Avalilable");
    AdminLoginPage.InputUserName(username);
    AdminLoginPage.InputPasswordName(Password);
    //AdminLoginPage.ClickRemeberMe();
    AdminLoginPage.ClickLogin();
    softAssert.assertTrue(AdminLoginPage.IsDisplayInvalidMessage(), "Login Page is invalid message");
    softAssert.assertAll();
}

    @Test(priority = 1)
    public void AdminLoginPageBalankTest(){
    	softAssert = new SoftAssert();
        softAssert.assertTrue(AdminLoginPage.IsDisplayLoginPage(),"Login Page is not Avalilable");
        AdminLoginPage.InputUserName("");
        AdminLoginPage.InputPasswordName("");
        //AdminLoginPage.ClickRemeberMe();
        AdminLoginPage.ClickLogin();
        softAssert.assertTrue(AdminLoginPage.IsDisplayInvalidMessage(), "Login Page is invalid message");
        softAssert.assertAll();
    }

    @Test(priority = 1)
    public void AdminLoginPageWithoutUserTest(){
    	softAssert = new SoftAssert();
        softAssert.assertTrue(AdminLoginPage.IsDisplayLoginPage(),"Login Page is not Avalilable");
        AdminLoginPage.InputUserName("");
        AdminLoginPage.InputPasswordName("admin");
        //AdminLoginPage.ClickRemeberMe();
        AdminLoginPage.ClickLogin();
        softAssert.assertTrue(AdminLoginPage.IsDisplayInvalidMessage(), "Login Page is invalid message");
        softAssert.assertAll();
    }
    @Test(priority = 1)
    public void AdminLoginPageWithoutPasswordTest(){
    	softAssert = new SoftAssert();
        softAssert.assertTrue(AdminLoginPage.IsDisplayLoginPage(),"Login Page is not Avalilable");
        AdminLoginPage.InputUserName("admin@gmail.com");
        AdminLoginPage.InputPasswordName("");
        //AdminLoginPage.ClickRemeberMe();
        AdminLoginPage.ClickLogin();
        softAssert.assertTrue(AdminLoginPage.IsDisplayInvalidMessage(), "Login Page is invalid message");
        softAssert.assertAll();
    }
    
    @Test(priority = 2,dataProvider = "ValidUserDetails",dataProviderClass = LoginValidAdminDataProvider.class)
    public void AdminLoginPagevalidTest(String username ,String Password ){
        softAssert = new SoftAssert();
        softAssert.assertTrue(AdminLoginPage.IsDisplayLoginPage(),"Login Page is not Avalilable");
        AdminLoginPage.InputUserName(username);
        AdminLoginPage.InputPasswordName(Password);
        //AdminLoginPage.ClickRemeberMe();
        AdminLoginPage.ClickLogin();
        softAssert.assertTrue(AdminDashBoardPage.IsDisplayHeading(), "Login Page is invalid message");
        softAssert.assertAll();
    }
}
