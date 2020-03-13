package com.abi.test.pageobject.Tests;

import com.abi.test.pageobject.Pages.DashBoard.Assign_Leave_Page;
import com.abi.test.pageobject.Pages.HomePage;
import com.abi.test.pageobject.Pages.Login.LoginPage;
import com.abi.test.pageobject.Utils.Constans;
import com.abi.test.pageobject.Utils.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.abi.test.pageobject.Utils.PageBase.implicitWait;

public class DashBoardTest extends TestBase {
    private static final Logger LOGGER =Logger.getLogger(DashBoardTest.class);

    @Test(priority = 1)
    public void Assign_Leave(){
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.IsDisplayLoginPage(),"Login Page is not Avalilable");
        LoginPage.InputUserName("Admin");
        LoginPage.InputPasswordName("admin123");
        LoginPage.Clicksubmit();
        HomePage.ClickDashboardPage();
        //System.out.println(HomePage.ButtonColour());
        //softAssert.assertEquals(Color.fromString(HomePage.ButtonColour()).asHex(),Constans.BTNCOLOUR);
        //softAssert.assertEquals(HomePage.ButtonColour(),Constans.BTNCOLOUR);
        softAssert.assertTrue(Assign_Leave_Page.IsDisplayLeaveAssine(),"DashBoard page is not Avaliable");
        Assign_Leave_Page.ClickLeaveAssine();
        Assign_Leave_Page.ClearInputEmployeeName();
        Assign_Leave_Page.InputEmployeeName(Constans.ASSIGN_LEAVE);
        Assign_Leave_Page.setDropOption(Constans.OPTION_1);
        softAssert.assertEquals(Assign_Leave_Page.getSelectedOption(),Constans.OPTION_1,"DropDown value is incorrect");
        implicitWait(2);
        Assign_Leave_Page.ClickBalanceLink();
        softAssert.assertTrue(Assign_Leave_Page.IsDisplayBalanceBox(),"Balance is Avalialbe");
        Assign_Leave_Page.ClickOkBalanceBox();
        Assign_Leave_Page.ClearLeaveFrom();
        Assign_Leave_Page.SendLeaveFrom(Constans.LEAVEFROM);
        softAssert.assertTrue(Assign_Leave_Page.IsDisplayFromCal(),"FromCalander is not Available" );
        Assign_Leave_Page.ClickLeavefrom();
        Assign_Leave_Page.ClearLeaveTo();
        Assign_Leave_Page.SendLeaveTo(Constans.LEAVETO);
        softAssert.assertTrue(Assign_Leave_Page.IsDisplayToCal(),"To Calander is not Available" );
        Assign_Leave_Page.ClickLeave();
        Assign_Leave_Page.SetPartialDays(Constans.STRINGDAYONLY);
        Assign_Leave_Page.setStratDateDay(Constans.HALFDAY);
        Assign_Leave_Page.SetStratDAte(Constans.AFTERNOON);
        Assign_Leave_Page.SendComment(Constans.COMMITE);
        Assign_Leave_Page.ClickAssine();
        softAssert.assertTrue(Assign_Leave_Page.IsDisplayConformationBox(),"Conformation box is Appear");
        softAssert.assertEquals(Assign_Leave_Page.GetConformationMessage(),Constans.CONFORMATIONMESSAGE);
        Assign_Leave_Page.ClickConformationOk();
        softAssert.assertAll();


    }
}
