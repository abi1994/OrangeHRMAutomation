package com.abi.test.pageobject.Pages;

import com.abi.test.pageobject.Utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class HomePage extends PageBase {
    private static final Logger LOGGER =Logger.getLogger(HomePage.class);


    private static By Heading = By.xpath("//h1");
    //private static By Admin_Page =By.xpath("//b[text()=\"Admin\"]");
    private static By Admin_Page =By.cssSelector("#menu_admin_viewAdminModule > b");
    private static By PIM_Page =By.xpath("//b[text()=\"PIM\"]");
    private static By Leave_Page =By.xpath("//b[text()=\"Leave\"]");
    private static By Time_Page =By.xpath("//b[text()=\"Time\"]");
    private static By Recruitment_Page =By.xpath("//b[text()=\"Recruitment\"]");
    private static By Performance_Page =By.xpath("//b[text()=\"Performance\"]");
    private static By Dashboard_Page =By.xpath("//b[text()=\"Dashboard\"]");
    private static By Directory_Page =By.xpath("//b[text()=\"Directory\"]");
    private static By Maintenance_Page =By.xpath("//b[text()=\"Maintenance\"]");


    public static boolean IsDisplayHeading(){
        return getDriver().findElement(Heading).isDisplayed();
    }

    public static void ClickAdminPage(){
        getDriver().findElement(Admin_Page).click();
    }

    public static void ClickPIMPage(){
        getDriver().findElement(PIM_Page).click();
    }

    public static void ClickLeavePage() {
        getDriver().findElement(Leave_Page).click();
    }

    public static void ClickTimePage(){
        getDriver().findElement(Time_Page).click();
    }

    public static void ClickRecruitmentPage(){
        getDriver().findElement(Recruitment_Page).click();
    }

    public static void ClickPerformancePage(){
        getDriver().findElement(Performance_Page).click();
    }

    public static void ClickDashboardPage(){
        getDriver().findElement(Dashboard_Page).click();
    }

    public static void ClickDirectoryPage(){
        getDriver().findElement(Directory_Page).click();
    }

    public static void ClickMaintenancePage(){
        getDriver().findElement(Maintenance_Page).click();
    }
}
