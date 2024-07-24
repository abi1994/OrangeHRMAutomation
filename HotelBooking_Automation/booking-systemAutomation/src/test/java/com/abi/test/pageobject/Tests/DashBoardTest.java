package com.abi.test.pageobject.Tests;

import com.abi.test.pageobject.Pages.Admin.AdminDashBoardPage;
import com.abi.test.pageobject.Pages.Admin.Login.AdminLoginPage;
import com.abi.test.pageobject.Utils.AdminTestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DashBoardTest extends AdminTestBase {
    private static final Logger LOGGER =Logger.getLogger(DashBoardTest.class);

    @Test(priority = 1)
    public void DashBoardTest() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(AdminLoginPage.IsDisplayLoginPage(),"Login Page is not Avalilable");
        AdminLoginPage.InputUserName("Admin@gmail.com");
        AdminLoginPage.InputPasswordName("admin");
        AdminLoginPage.ClickLogin();
        softAssert.assertTrue(AdminDashBoardPage.IsDisplayHeading(), "Admin Home Page is not Avaliable");
        AdminDashBoardPage.ClickDashboardPage();
        
        softAssert.assertAll();
    }
}
