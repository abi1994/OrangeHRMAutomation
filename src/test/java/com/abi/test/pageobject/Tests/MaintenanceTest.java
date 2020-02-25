package com.abi.test.pageobject.Tests;

import com.abi.test.pageobject.Pages.HomePage;
import com.abi.test.pageobject.Pages.Login.LoginPage;
import com.abi.test.pageobject.Pages.MaintenancePage;
import com.abi.test.pageobject.Utils.Constans;
import com.abi.test.pageobject.Utils.TestBase;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class MaintenanceTest extends TestBase {
    private static final Logger LOGGER =Logger.getLogger(MaintenanceTest.class);

    @Test
    public void VerifyPassword(){
        softAssert.assertTrue(LoginPage.IsDisplayLoginPage(),"Loginpage is not Display");
        LoginPage.InputUserName(Constans.USERNAME);
        LoginPage.InputPasswordName(Constans.PASSWORD);
        LoginPage.Clicksubmit();
        HomePage.ClickMaintenancePage();
        softAssert.assertTrue(MaintenancePage.IsDisplayHeading(),"MaintenancePage is not Appear");
        MaintenancePage.InputPassWord(Constans.Verify_Password);
        MaintenancePage.ClickVerify();
        softAssert.assertTrue(MaintenancePage.IsDisplayAlater(),"Alter is not display");
    }
}
