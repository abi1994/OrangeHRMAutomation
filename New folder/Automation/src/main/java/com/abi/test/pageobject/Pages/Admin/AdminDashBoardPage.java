package com.abi.test.pageobject.Pages.Admin;

import com.abi.test.pageobject.Utils.AdminPageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class AdminDashBoardPage extends AdminPageBase {
    private static final Logger LOGGER =Logger.getLogger(AdminDashBoardPage.class);

    private static By Heading= By.xpath("//h1[@class='h3 mb-0 text-gray-800']");
    private static By DashboardPage =By.xpath("//div[@class='sidebar-brand-text mx-3']");
    private static By HomePageBannersPage = By.xpath("//span[text()='HomePage Banners']/ancestor::a");
    private static By HomePageBannerAddnew =By.xpath("//a[@class='collapse-item'][text()='Add New']");
    private static By ViewHomePageBanner =By.linkText("View All");
    private static By RoomTypePage =By.linkText("RoomType");
    private static By AddRoomTypePage =By.linkText("Add New");
    private static By ViewRoomTypePage =By.linkText("View All");
    private static By RoomPage =By.linkText("Rooms");
    private static By AddRoomPage =By.linkText("View All");
    private static By ViewRoomPage =By.linkText("View All");
    private static By CustomerPage =By.linkText("Customer");
    private static By AddCustomerPage =By.linkText("View All");
    private static By ViewCustomerPage =By.linkText("View All");
    private static By BookingsPage =By.linkText("Bookings");
    private static By ServicePage =By.linkText("Service");
    private static By LogoutPage =By.linkText("Logout");
    

    public static Boolean IsDisplayHeading(){
        return getDriver().findElement(Heading).isDisplayed();
    }
    public static Boolean IsDisplayDashBoard(){
        return getDriver().findElement(DashboardPage).isDisplayed();
    }
    public static void ClickDashboardPage(){
        getDriver().findElement(DashboardPage).click();
    }
    public static void ClickHomeBanner(){
         getDriver().findElement(HomePageBannersPage).click();
    }
    public static void ClickAddHomeBanner(){
        getDriver().findElement(HomePageBannerAddnew).click();
    } 
    public static void ClickViewHomeBanner(){
        getDriver().findElement(ViewHomePageBanner).click();
    } 
    public static void ClickRoomType(){
        getDriver().findElement(RoomTypePage).click();
    }
    public static void ClickAddRoomType(){
        getDriver().findElement(AddRoomTypePage).click();
    }
    public static void ClickViewRoomType(){
        getDriver().findElement(ViewRoomTypePage).click();
    }
    public static void ClickRooms(){
        getDriver().findElement(RoomPage).click();
    }
    public static void ClickAddRooms(){
        getDriver().findElement(AddRoomPage).click();
    }
    public static void ClickViewRooms(){
        getDriver().findElement(ViewRoomPage).click();
    }
    public static void ClickCustermer(){
        getDriver().findElement(CustomerPage).click();
    }
    public static void ClickAddCustermer(){
        getDriver().findElement(AddCustomerPage).click();
    }
    public static void ClickViewCustermer(){
        getDriver().findElement(ViewCustomerPage).click();
    }
    public static void ClickBookingsPage(){
        getDriver().findElement(BookingsPage).click();
    }
    public static void ClickServicePage(){
        getDriver().findElement(ServicePage).click();
    }   
    public static void ClickLogOutPage(){
        getDriver().findElement(LogoutPage).click();
    }

}
