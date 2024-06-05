package com.abi.test.pageobject.Tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.abi.test.pageobject.Pages.Admin.AdminDashBoardPage;
import com.abi.test.pageobject.Pages.Admin.Login.AdminLoginPage;
import com.abi.test.pageobject.Pages.Banners.AdminHomeAddBannersPage;
import com.abi.test.pageobject.Pages.RoomType.AdminHomeAddRoomTypePage;
import com.abi.test.pageobject.Utils.AdminTestBase;
import com.abi.test.pageobject.Utils.Constans;



public class RoomTypeTest extends AdminTestBase {
	private static final Logger LOGGER =Logger.getLogger(RoomTypeTest.class);

	@Test(priority = 1 )
	    public void RoomAddTypeAddTest( ){
        softAssert = new SoftAssert();
        softAssert.assertTrue(AdminLoginPage.IsDisplayLoginPage(),"Login Page is not Avalilable");
        AdminLoginPage.InputUserName(Constans.USERNAME);
        LOGGER.info("Input the email");
        AdminLoginPage.InputPasswordName(Constans.PASSWORD);
        LOGGER.info("Input the Password");
        AdminLoginPage.ClickLogin();
        LOGGER.info("Login the Admin");
        softAssert.assertTrue(AdminDashBoardPage.IsDisplayHeading(), "Login Page is invalid message");
        AdminDashBoardPage.ClickRoomType();
        LOGGER.info("Click the RoomType Page");
        AdminDashBoardPage.ClickAddRoomType();
        LOGGER.info("Click the AddRoomType in AdminHomePage");
        softAssert.assertTrue(AdminHomeAddRoomTypePage.IsDispalyHeading(), "This is AddRoomType Page");
        AdminHomeAddRoomTypePage.EnterTitel(Constans.TITEL);
        LOGGER.info("Enter Room Title");
        AdminHomeAddRoomTypePage.EnterPrice(Constans.PRICE);
        LOGGER.info("Enter Room Price");
        AdminHomeAddRoomTypePage.EnterCapacity(Constans.CAPACITY);
        LOGGER.info("Enter Room Capacity");
        AdminHomeAddRoomTypePage.EnterDetail(Constans.DETAIL);
        LOGGER.info("Enter Room Detail");
        AdminHomeAddRoomTypePage.clickUploadImage("p1.jpg");
        LOGGER.info("Enter Room Iamge");
        AdminHomeAddRoomTypePage.ClickSubmit();
        LOGGER.info("Image Added");
        softAssert.assertAll();
		
	}
	
	@Test(priority = 2 )
    	public void RoomViewTypeAddTest( ){
	    softAssert = new SoftAssert();
	    softAssert.assertTrue(AdminLoginPage.IsDisplayLoginPage(),"Login Page is not Avalilable");
	    AdminLoginPage.InputUserName(Constans.USERNAME);
	    LOGGER.info("Input the email");
	    AdminLoginPage.InputPasswordName(Constans.PASSWORD);
	    LOGGER.info("Input the Password");
	    AdminLoginPage.ClickLogin();
	    LOGGER.info("Login the Admin");
	    softAssert.assertTrue(AdminDashBoardPage.IsDisplayHeading(), "Login Page is invalid message");
	    AdminDashBoardPage.ClickRoomType();
	    LOGGER.info("Click the RoomType Page");
	    AdminDashBoardPage.ClickAddRoomType();
	    LOGGER.info("Click the AddRoomType in AdminHomePage");
	    softAssert.assertTrue(AdminHomeAddRoomTypePage.IsDispalyHeading(), "This is AddRoomType Page");
	    AdminHomeAddRoomTypePage.EnterTitel(Constans.TITEL);
	    LOGGER.info("Enter Room Title");
	    AdminHomeAddRoomTypePage.EnterPrice(Constans.PRICE);
	    LOGGER.info("Enter Room Price");
	    AdminHomeAddRoomTypePage.EnterCapacity(Constans.CAPACITY);
	    LOGGER.info("Enter Room Capacity");
	    AdminHomeAddRoomTypePage.EnterDetail(Constans.DETAIL);
	    LOGGER.info("Enter Room Detail");
	    AdminHomeAddRoomTypePage.clickUploadImage("p2.jpg");
	    LOGGER.info("Enter Room Iamge");
	    AdminHomeAddRoomTypePage.ClickSubmit();
	    LOGGER.info("Image Added");
	    AdminHomeAddRoomTypePage.ClickViewall();
	    softAssert.assertAll();
	
	}
}
