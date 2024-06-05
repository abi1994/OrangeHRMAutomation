package com.abi.test.pageobject.Tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.abi.test.pageobject.Pages.HomePage;
import com.abi.test.pageobject.Pages.Booking.RoomBookingPage;
import com.abi.test.pageobject.Pages.Login.LoginPage;
import com.abi.test.pageobject.Pages.Register.RegisterUserPage;
import com.abi.test.pageobject.Utils.Constans;
import com.abi.test.pageobject.Utils.TestBase;

public class CusermerBookingTest extends TestBase {
    private static final Logger LOGGER =Logger.getLogger(CusermerBookingTest.class);
    @Test(priority = 1)
    public void RoomBooking( ){
   	 	softAssert =new SoftAssert();
//        softAssert.assertEquals(HomePage.IsDisplayHeading(), "Hotel Booking");
//        HomePage.ClickRegisterPage();
//        softAssert.assertTrue(RegisterUserPage.IsDisplayHeading(),"Login Page is not Avalilable");
//        RegisterUserPage.InputFullName(Constans.FULLNAME);
//        RegisterUserPage.InputEmailId(Constans.EMAIL);
//        RegisterUserPage.InputPassWord(Constans.CUSPASSWORD);
//        RegisterUserPage.InputMobileNumber(Constans.MOBILE);
//        RegisterUserPage.InputAddress(Constans.ADDRESS);
//        RegisterUserPage.ClickSubmite();
//	    LOGGER.info("Cusermer Register done");
//	    softAssert.assertTrue(LoginPage.IsDisplayLoginPage(),"This is not Login Page ");
   	 	HomePage.ClickLoginPage();
	    LoginPage.InputUserName(Constans.EMAIL);
	    LoginPage.InputPasswordName(Constans.CUSPASSWORD);
	    LoginPage.Clicksubmit();
	    LOGGER.info("login the cusermer");
	    softAssert.assertTrue(LoginPage.IsDisplayLogOut(),"Logout");
        LOGGER.info("Login page apprear");
        HomePage.ClickBookingPage();
        RoomBookingPage.IsDisplayBookingPage();
        RoomBookingPage.ClickCheckInDate();
        RoomBookingPage.InputCheckinDate("/04/29/2024");
        RoomBookingPage.ClickCheckOutDate();
        RoomBookingPage.InputCheckoutDate("/04/30/2024");
        LOGGER.info("enter checkoutdate");
        RoomBookingPage.SelectAvailabeRoom("single - Standard Room");
        LOGGER.info("Select room");
        RoomBookingPage.InputTotalAdults("2");
        LOGGER.info("Enter adults");
        RoomBookingPage.InputTotalChildern("0");
        LOGGER.info("Enter childern");
        RoomBookingPage.Submit();
        softAssert.assertAll();
       
    }
}
