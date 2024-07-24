package com.abi.test.pageobject.Pages.Admin;

import com.abi.test.pageobject.Utils.AdminPageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class AdminDashBoardPage extends AdminPageBase {
    private static final Logger LOGGER =Logger.getLogger(AdminDashBoardPage.class);

    private static By Heading= By.xpath("//*[@id=\"accordionSidebar\"]/a/div[2]");
    private static By DashboardPage =By.xpath("//*[@id=\"accordionSidebar\"]/li[1]/a/span");
    private static By HomePageBannersPage = By.id("//*[@id=\"accordionSidebar\"]/li[2]/a/span");
    private static By RoomTypePage =By.xpath("//*[@id=\"accordionSidebar\"]/li[3]/a/span");
    private static By RoomPage =By.xpath("//*[@id=\"accordionSidebar\"]/li[4]/a");
    private static By CustomerPage =By.xpath("//*[@id=\"accordionSidebar\"]/li[5]/a/span");
    private static By BookingsPage =By.xpath("//*[@id=\"accordionSidebar\"]/li[6]/a");
    private static By ServicePage =By.xpath("//*[@id=\"accordionSidebar\"]/li[7]/a");
    private static By LogoutPage =By.xpath("//*[@id=\"accordionSidebar\"]/li[8]/a");
    

    public static Boolean IsDisplayHeading(){
        return getDriver().findElement(Heading).isDisplayed();
    }
    public static Boolean IsDisplayLeaveAssine(){
        return getDriver().findElement(DashboardPage).isDisplayed();
    }
    public static void ClickDashboardPage(){
        getDriver().findElement(DashboardPage).click();
    }
    public static void InputEmployeeName(String name){
         getDriver().findElement(HomePageBannersPage).sendKeys(name);
    }
    public static void ClearInputEmployeeName(){
        getDriver().findElement(HomePageBannersPage).clear();
    }
    public static String getSelectedOption(){
        Select dropDownOption =new Select(getDriver().findElement(RoomTypePage));
        return dropDownOption.getFirstSelectedOption().getText();
    }
    public static void setDropOption(String option){
        Select dropDownOption =new Select(getDriver().findElement(RoomTypePage));
        dropDownOption.selectByVisibleText(option);
    }
    public static void ClickBalanceLink(){
        getDriver().findElement(RoomPage).click();
    }
    public static boolean IsDisplayBalanceBox(){
        return getDriver().findElement(CustomerPage).isDisplayed();
    }
    public static void ClickOkBalanceBox(){
        getDriver().findElement(ServicePage).click();
    }
    public static void ClickBalanceBoxclose(){
        getDriver().findElement(BookingsPage).click();
    }
    public static void SendLeaveFrom(String from){
        getDriver().findElement(LogoutPage).sendKeys(from);
    }
    public static void ClearLeaveFrom(){
        getDriver().findElement(LogoutPage).clear();
    }
//	public static char[] ButtonColour() {
//		getDriver().findElement(DashboardPage).getCssValue(downloadFilepath);
//		return null;
//	}

}
