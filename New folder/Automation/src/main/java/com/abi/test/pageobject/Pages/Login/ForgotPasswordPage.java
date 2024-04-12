package com.abi.test.pageobject.Pages.Login;

import com.abi.test.pageobject.Utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class ForgotPasswordPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(ForgotPasswordPage.class);

    private static By Heading = By.xpath("//div[@class=\"head\"]");
    private static By InputValue = By.xpath("//input[@type='text']");
    private static By ResetPassword =By.xpath("//input[@type='submit']");
    private static By CansalResetPasswd =By.xpath("//input[@type='button']");
    private static By AlterMessage =By.xpath("//div[@class=\"message warning fadable\"]");

    public static Boolean IsdiplayHeading(){
        return getDriver().findElement(Heading).isDisplayed();
    }

    public static void InputUserName(String username){
        getDriver().findElement(InputValue).sendKeys(username);
    }

    public static void Resetpassword(){
        getDriver().findElement(ResetPassword).click();
    }

    public static void Clickcansal(){
        getDriver().findElement(CansalResetPasswd).click();
    }
    public static boolean IsDisplayAlterMessage(){
        return getDriver().findElement(AlterMessage).isDisplayed();
    }
    public static String getAlterMessage(){
        return getDriver().findElement(AlterMessage).getText();
    }
}
