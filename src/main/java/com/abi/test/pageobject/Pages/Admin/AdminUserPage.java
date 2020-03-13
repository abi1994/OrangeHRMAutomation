package com.abi.test.pageobject.Pages.Admin;

import com.abi.test.pageobject.Utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class AdminUserPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(AdminUserPage.class);

    private static By admin_UserManagement = By.id("menu_admin_UserManagement");
    private static By admin_UserManagementUser = By.id("menu_admin_viewSystemUsers");
    //private static By admin_UserManagementUser =By.xpath("//a[@href=\"/index.php/admin/viewSystemUsers\"]");
    //private static By admin_UserSystem =By.id("menu_admin_UserManagement");
    private static By admin_SystemUser = By.xpath("//div[@id=\"systemUser-information\"]/a");
   // private static By admin_SystemUser = By.xpath("//a[@class=\"toggle tiptip\"]");
    //private static By admin_UserSystem_Username =By.id("menu_admin_viewSystemUsers");
    private static By admin_SystemUser_Username = By.xpath("//label[text()='Username']");
    private static By SystemUserHeadingOnly = By.xpath("//a[@class=\"toggle tiptip activated\"]");
    private static By SystemUserUserName = By.id("searchSystemUser_userName");
    private static By SearchButton =By.id("searchBtn");
    private static By ResetButton =By.id("resetBtn");
    private static By table1stValue =By.xpath("//a[@href=\"saveSystemUser?userId=1\"]");
    private static By SystemUserRoll =By.id("searchSystemUser_userType");

    public static void ClickAdminUserManagement() {
        getDriver().findElement(admin_UserManagement).click();
    }
    public static void ClickAdminUser() {
        getDriver().findElement(admin_UserManagementUser).click();
    }
    public static boolean IsdisplySystemUser() {
        return getDriver().findElement(admin_SystemUser).isDisplayed();
    }
    public static void ClickSystemUser() {
        getDriver().findElement(admin_SystemUser).click();
    }
    public static boolean IsDisplayUsername() {
        return getDriver().findElement(admin_SystemUser_Username).isDisplayed();
    }
    public static boolean IsDisplaySystemHeadingOnly() {
        return getDriver().findElement(SystemUserHeadingOnly).isDisplayed();
    }
    public static void ClickSystemHeadingOnly() {
        getDriver().findElement(SystemUserHeadingOnly).click();
    }
    public static boolean IsDisplaySystemUsername() {
        return getDriver().findElement(SystemUserUserName).isDisplayed();
    }
    public static void SetUsername(String name) {
         getDriver().findElement(SystemUserUserName).sendKeys(name);
    }
    public static void ClicksearchBtn(){
        getDriver().findElement(SearchButton).click();
    }
    public static String GetSearchButton(){
        return getDriver().findElement(table1stValue).getText();
    }
    public static void ClickRestButton(){
        getDriver().findElement(ResetButton).click();
    }
    public static boolean IsDisplayUserRoll(){
        return getDriver().findElement(SystemUserRoll).isDisplayed();
    }
    public static void setUserRoll(String roll){
        Select UserRoll =new Select(getDriver().findElement(SystemUserRoll));
        UserRoll.selectByVisibleText(roll);
    }
    public static String getUserRoll(){
        Select UserRoll =new Select(getDriver().findElement(SystemUserRoll));
        return UserRoll.getFirstSelectedOption().getText();
    }

}
