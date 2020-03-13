package com.abi.test.pageobject.Tests;

import com.abi.test.pageobject.Pages.Admin.AdminUserPage;
import com.abi.test.pageobject.Pages.HomePage;
import com.abi.test.pageobject.Pages.Login.LoginPage;
import com.abi.test.pageobject.Utils.Constans;
import com.abi.test.pageobject.Utils.PageBase;
import com.abi.test.pageobject.Utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.locks.Condition;

import static com.abi.test.pageobject.Utils.PageBase.implicitWait;

public class AdminTest extends TestBase {
private static final Logger LOGGER =Logger.getLogger(AdminTest.class);

@Test(priority = 1)
    public void UserManagemantSearchWithUserName(){
    softAssert = new SoftAssert();
    softAssert.assertTrue(LoginPage.IsDisplayLoginPage(),"Login Page is not Avalilable");
    LoginPage.InputUserName("Admin");
    LoginPage.InputPasswordName("admin123");
    LoginPage.Clicksubmit();
    HomePage.ClickAdminPage();
    softAssert.assertTrue(AdminUserPage.IsdisplySystemUser(),"Admin User management Button Is not Display");
    AdminUserPage.ClickAdminUserManagement();
    softAssert.assertTrue(AdminUserPage.IsDisplayUsername(),"Admin User managementUser Button Is not Display");
    AdminUserPage.ClickAdminUser();
    softAssert.assertTrue(AdminUserPage.IsdisplySystemUser(),"SystemUser Is not Display");
    AdminUserPage.ClickSystemUser();
    softAssert.assertTrue(AdminUserPage.IsDisplaySystemHeadingOnly(),"SystemHeadingOnly is Not Display");
    AdminUserPage.ClickSystemHeadingOnly();
    softAssert.assertTrue(AdminUserPage.IsDisplaySystemUsername(),"AdminUsername is not display");
    AdminUserPage.SetUsername(Constans.AdminUsername);
    PageBase.implicitWait(4);
    AdminUserPage.ClicksearchBtn();
    softAssert.assertEquals(AdminUserPage.GetSearchButton(),Constans.AdminUsername,"sdftghjkl");
    softAssert.assertAll();
}

    @Test(priority = 2)
    public void UserManagemantReset(){
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.IsDisplayLoginPage(),"Login Page is not Avalilable");
        LoginPage.InputUserName("Admin");
        LoginPage.InputPasswordName("admin123");
        LoginPage.Clicksubmit();
        HomePage.ClickAdminPage();
        softAssert.assertTrue(AdminUserPage.IsdisplySystemUser(),"Admin User management Button Is not Display");
        AdminUserPage.ClickAdminUserManagement();
        softAssert.assertTrue(AdminUserPage.IsDisplayUsername(),"Admin User managementUser Button Is not Display");
        AdminUserPage.ClickAdminUser();
        softAssert.assertTrue(AdminUserPage.IsdisplySystemUser(),"SystemUser Is not Display");
        AdminUserPage.ClickSystemUser();
        softAssert.assertTrue(AdminUserPage.IsDisplaySystemHeadingOnly(),"SystemHeadingOnly is Not Display");
        AdminUserPage.ClickSystemHeadingOnly();
        softAssert.assertTrue(AdminUserPage.IsDisplaySystemUsername(),"AdminUsername is not display");
        AdminUserPage.SetUsername(Constans.AdminUsername);
        PageBase.implicitWait(4);
        AdminUserPage.ClicksearchBtn();
        softAssert.assertEquals(AdminUserPage.GetSearchButton(),Constans.AdminUsername,"sdftghjkl");
        implicitWait(2);
        AdminUserPage.ClickRestButton();
        softAssert.assertAll();
    }

    @Test(priority = 1)
    public void UserManagemantSearchWithUserRoll(){
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.IsDisplayLoginPage(),"Login Page is not Avalilable");
        PageBase.Login("Admin","admin123");
        HomePage.ClickAdminPage();
        LOGGER.info("Click AdminPage");
        implicitWait(3);
        softAssert.assertTrue(AdminUserPage.IsdisplySystemUser(),"Admin User management Button Is not Display");
        implicitWait(3);
        AdminUserPage.ClickAdminUserManagement();
        LOGGER.info("Click AdminPage");
        implicitWait(3);
        softAssert.assertTrue(AdminUserPage.IsDisplayUsername(),"Admin User managementUser Button Is not Display");
        implicitWait(3);
        AdminUserPage.ClickAdminUser();
        LOGGER.info("Click AdminPage");
//        softAssert.assertTrue(AdminUserPage.IsdisplySystemUser(),"SystemUser Is not Display");
//        AdminUserPage.ClickSystemUser();
//        softAssert.assertTrue(AdminUserPage.IsDisplaySystemHeadingOnly(),"SystemHeadingOnly is Not Display");
//        AdminUserPage.ClickSystemHeadingOnly();
//        softAssert.assertTrue(AdminUserPage.IsDisplayUserRoll(),"Admin UserRoll is not display");
//        AdminUserPage.setUserRoll(Constans.ESS);
//        PageBase.implicitWait(4);
//        AdminUserPage.ClicksearchBtn();
//        softAssert.assertEquals(AdminUserPage.GetSearchButton(),Constans.AdminUsername,"Admin Search is not Display");
//        implicitWait(2);
       // AdminUserPage.ClickRestButton();
        softAssert.assertAll();
    }

}
