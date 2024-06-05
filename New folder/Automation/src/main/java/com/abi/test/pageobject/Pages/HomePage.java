package com.abi.test.pageobject.Pages;

import com.abi.test.pageobject.Utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;

public class HomePage extends PageBase {
    private static final Logger LOGGER =Logger.getLogger(HomePage.class);


    private static By Heading = By.xpath("/html/body/nav/div/a");
    private static By Services_Page=By.xpath("//*[@id=\"navbarNavAltMarkup\"]/div/a[1]");
    private static By Gallery_Page =By.xpath("//*[@id=\"navbarNavAltMarkup\"]/div/a[2]");
    private static By Login_Page =By.xpath("//*[@id=\"navbarNavAltMarkup\"]/div/a[3]");
    private static By Register_Page =By.xpath("//*[@id=\"navbarNavAltMarkup\"]/div/a[4]");
    private static By Booking_Page =By.xpath("//a[@class='nav-link btn btn-sm btn-danger']");
    private static By Services =By.xpath("services");
    private static By PoolsideBar =By.xpath("/html/body/main/div[2]/div[2]/div[2]/h3");
    private static By PoolsideBar_Page =By.xpath("/html/body/main/div[2]/div[2]/div[2]/p[2]/a");
    private static By PoolsideBar_Services=By.xpath("/html/body/main/div/h3");
    private static By Dining =By.xpath("/html/body/main/div[2]/div[1]/div[2]/h3");
    private static By Dining_Page =By.xpath("/html/body/main/div[2]/div[1]/div[2]/p[2]/a");
    private static By Dining_Services=By.xpath("/html/body/main/div/h3");
    private static By Dining1 =By.xpath("/html/body/main/div[2]/div[3]/div[2]/h3");
    private static By Dining_Page1 =By.xpath("/html/body/main/div[2]/div[3]/div[2]/p[2]/a");
    private static By Dining_Services1=By.xpath("/html/body/main/div/h3");
    private static By Gallery = By.id("gallery");
    private static By Luxuryrooms = By.id("/html/body/main/div[3]/div/div[1]/div/h5");
    
    public static boolean IsDisplayHeading(){
        return getDriver().findElement(Heading).isDisplayed();
    }
    
    public static void ClickHeadingPage(){
        getDriver().findElement(Heading).click();
    }
    
    public static void ClickServicesPage(){
        getDriver().findElement(Services_Page).click();
    }

    public static void ClickGalleryPage(){
        getDriver().findElement(Gallery_Page).click();
    }

    public static void ClickLoginPage() {
        getDriver().findElement(Login_Page).click();
    }

    public static void ClickRegisterPage(){
        getDriver().findElement(Register_Page).click();
    }

    public static void ClickBookingPage(){
        getDriver().findElement(Booking_Page).click();
    }

    public static void IsDisplayservices(){
        getDriver().findElement(Services).isDisplayed();
    }

    public static void IsDisplayPoolsideBar(){
        getDriver().findElement(PoolsideBar).isDisplayed();
    }

    public static void ClickPoolsideBarPage(){
        getDriver().findElement(PoolsideBar_Page).click();
    }

    public static void IsDisplayPoolsideBarServices(){
        getDriver().findElement(PoolsideBar_Services).isDisplayed();
    }

    public static void IsDisplayDining(){
        getDriver().findElement(Dining).isDisplayed();
    }

    public static void ClickDiningPage(){
        getDriver().findElement(Dining_Page).click();
    }

    public static void IsDisplayDiningServices(){
        getDriver().findElement(Dining_Services).isDisplayed();
    }
    
    public static void IsDisplayDining1(){
        getDriver().findElement(Dining1).isDisplayed();
    }

    public static void ClickDiningPage1(){
        getDriver().findElement(Dining_Page1).click();
    }

    public static void IsDisplayDiningServices1(){
        getDriver().findElement(Dining_Services1).isDisplayed();
    }
   
    public static void IsDisplayGallery(){
        getDriver().findElement(Gallery).isDisplayed();
    }
    public static void IsDisplayLuxuryrooms(){
        getDriver().findElement(Luxuryrooms).isDisplayed();
    }
}
