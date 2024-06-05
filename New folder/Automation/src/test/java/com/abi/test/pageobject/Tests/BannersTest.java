package com.abi.test.pageobject.Tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.abi.test.pageobject.Pages.Admin.AdminDashBoardPage;
import com.abi.test.pageobject.Pages.Admin.Login.AdminLoginPage;
import com.abi.test.pageobject.Pages.Banners.AdminHomeAddBannersPage;
import com.abi.test.pageobject.Utils.AdminTestBase;
import com.abi.test.pageobject.Utils.Constans;



public class BannersTest extends AdminTestBase {
	private static final Logger LOGGER =Logger.getLogger(BannersTest.class);

	@Test(priority = 1 )
	    public void BannersAddTest( ){
        softAssert = new SoftAssert();
        softAssert.assertTrue(AdminLoginPage.IsDisplayLoginPage(),"Login Page is not Avalilable");
        AdminLoginPage.InputUserName(Constans.USERNAME);
        LOGGER.info("Input the email");
        AdminLoginPage.InputPasswordName(Constans.PASSWORD);
        LOGGER.info("Input the Password");
        AdminLoginPage.ClickLogin();
        LOGGER.info("Login the Admin");
        softAssert.assertTrue(AdminDashBoardPage.IsDisplayHeading(), "Login Page is invalid message");
        AdminDashBoardPage.ClickHomeBanner();
        LOGGER.info("Click the AdminHomeBannerPage");
        AdminDashBoardPage.ClickAddHomeBanner();
        LOGGER.info("Click the AddBanner in AdminHomePage");
        softAssert.assertTrue(AdminHomeAddBannersPage.IsDispalyHeading(), "This is AddBanner Page");
        LOGGER.info("Add Banner page appear");
        AdminHomeAddBannersPage.ClickUploadImage();
        AdminHomeAddBannersPage.InterAltText(Constans.ALTTEXT);
        AdminHomeAddBannersPage.CheckPublishStatus();
        AdminHomeAddBannersPage.ClickSubmit();
        softAssert.assertAll();
		
	}
}
