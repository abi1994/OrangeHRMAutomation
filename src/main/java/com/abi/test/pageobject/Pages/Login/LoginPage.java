package com.abi.test.pageobject.Pages.Login;

import com.abi.test.pageobject.Utils.PageBase;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;



public class LoginPage extends PageBase {
    private static final Logger LOGGER= Logger.getLogger(LoginPage.class);
    private static By orangeHRM= By.xpath("//span[text()='( Username : Admin | Password : admin123 )']");
    private static By Username = By.id("txtUsername");
    private static By Password =By.id("txtPassword");
    private static By Subbmit =By.id("btnLogin");
    private static By forgotPassword =By.xpath("//a[@href='/index.php/auth/requestPasswordResetCode']");
    private static By InvalidMessage =By.id("spanMessage");
    private static By EmptyMessage =By.xpath("//span[text()='Username cannot be empty']");


    public static boolean IsDisplayLoginPage(){
        return getDriver().findElement(orangeHRM).isDisplayed();
    }
    public static void InputUserName(String username){
        getDriver().findElement(Username).sendKeys(username);
    }
    public static void InputPasswordName(String password){
        getDriver().findElement(Password).sendKeys(password);
    }
    public static void Clicksubmit(){
        getDriver().findElement(Subbmit).click();
    }
    public static void ClickForgotpassword(){
        getDriver().findElement(forgotPassword).click();
    }
    public static boolean IsDisplayInvalidMessage(){
        return getDriver().findElement(InvalidMessage).isDisplayed();
    }
    public static boolean IsDisplayEmptyMessage(){
        return getDriver().findElement(EmptyMessage).isDisplayed();
    }
    public static String GetLoginMessage(){
       return getDriver().findElement(InvalidMessage).getText();
    }
}
