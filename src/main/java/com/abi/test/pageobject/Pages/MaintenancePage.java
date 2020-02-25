package com.abi.test.pageobject.Pages;

import com.abi.test.pageobject.Utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;


public class MaintenancePage extends PageBase {
    private static final Logger LOGGER =Logger.getLogger(MaintenancePage.class);
    private static By Heading = By.xpath("//h1");
    private static By Inputpwd = By.id("confirm_password");
    private static By Verify =By.xpath("//input[@type=\"submit\"]");
    private static By VerifyAlter =By.xpath("//div[@class=\"message warning fadable\"]");


    public static boolean IsDisplayHeading(){
        return getDriver().findElement(Heading).isDisplayed();
    }
    public static void InputPassWord(String pwd){
        getDriver().findElement(Inputpwd).sendKeys(pwd);
    }
    public static void ClickVerify(){
        getDriver().findElement(Verify).click();
    }
    public static boolean IsDisplayAlater(){
        return getDriver().findElement(VerifyAlter).isDisplayed();
    }
}
