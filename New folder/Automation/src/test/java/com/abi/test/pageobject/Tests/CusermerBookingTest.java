package com.abi.test.pageobject.Tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.abi.test.pageobject.Pages.HomePage;
import com.abi.test.pageobject.Pages.Booking.RoomBookingPage;
import com.abi.test.pageobject.Pages.Login.LoginPage;

import com.abi.test.pageobject.Utils.Constans;
import com.abi.test.pageobject.Utils.TestBase;

public class CusermerBookingTest extends TestBase {
    private static final Logger LOGGER =Logger.getLogger(CusermerBookingTest.class);
    @Test(priority = 1)
    public void RoomBooking( ){
        softAssert =new SoftAssert();
        softAssert.assertTrue(HomePage.IsDisplayHeading(), "This is Hotel Booking Page");
        LOGGER.info("Home Page ");
        HomePage.ClickLoginPage();
        LOGGER.info("Login the loginpage");
        softAssert.assertTrue(LoginPage.IsDisplayLoginPage(),"This is not Login Page ");
        LoginPage.InputUserName(Constans.USERNAME);
        LoginPage.InputPasswordName(Constans.PASSWORD);
        LoginPage.Clicksubmit();
        LOGGER.info("Login page apprear");
        HomePage.ClickBookingPage();
        RoomBookingPage.IsDisplayBookingPage();
        RoomBookingPage.ClickCheckInDate();
        RoomBookingPage.InputCheckinDate("22.04.2024");
        RoomBookingPage.ClickCheckOutDate();
        RoomBookingPage.InputCheckoutDate("23/04/2024");
        LOGGER.info("enter checkoutdate");
        RoomBookingPage.SelectAvailabeRoom();
        LOGGER.info("Select room");
        RoomBookingPage.InputTotalAdults("2");
        LOGGER.info("Enter adults");
        RoomBookingPage.InputTotalChildern("0");
        LOGGER.info("Enter childern");
        RoomBookingPage.Submit();
        softAssert.assertAll();
       
    }
}
