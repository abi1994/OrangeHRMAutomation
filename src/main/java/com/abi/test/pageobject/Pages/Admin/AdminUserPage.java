package com.abi.test.pageobject.Pages.Admin;

import com.abi.test.pageobject.Utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class AdminUserPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(AdminUserPage.class);

    private static By admin_UserManagement =By.id("menu_admin_UserManagement");
    private static By admin_UserManagementUser =By.xpath("//a[@href=\"/index.php/admin/viewSystemUsers\"]");
    private static By admin_UserSystem =By.xpath("//a[@class=\"toggle tiptip\"]");
    private static By admin_UserSystem_Username =By.xpath("//label[text()='Username']");



    public static void ClickAdminUserManagement(){
        getDriver().findElement(admin_UserManagement).click();
    }

    public static void ClickAdminUser(){
        getDriver().findElement(admin_UserManagementUser).click();
    }
    public static boolean IsdisplySystemUser(){
        return getDriver().findElement(admin_UserSystem).isDisplayed();
    }
    public static void ClickSystemUser(){
        getDriver().findElement(admin_UserSystem).click();
    }
    public static boolean IsDisblayUsername(){
        return getDriver().findElement(admin_UserSystem_Username).isDisplayed();
    }

}
