package com.abi.test.pageobject.Pages.Admin.Login;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.abi.test.pageobject.Utils.AdminPageBase;

public class AdminLoginPage extends AdminPageBase {
	private static final Logger LOGGER= Logger.getLogger(AdminLoginPage.class);
    private static By HotelH1= By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div[1]/h1");
    private static By UserName= By.id("username");
    private static By Password =By.id("exampleInputPassword");
    private static By Login =By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/form/input[2]");
    private static By RememberMe =By.xpath("//*[@id=\"customCheck\"]");
    private static By InvalidUsername =By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/p[1]");
    private static By InvalidPassword =By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/p[2]");
    private static By InvalidMessage = By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/p");
    private static By ForgotPassword =By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div[2]/a");

    public static boolean IsDisplayLoginPage(){
        return getDriver().findElement(HotelH1).isDisplayed();
    }
    public static void InputUserName(String username){
        getDriver().findElement(UserName).sendKeys(username);
    }
    public static void InputPasswordName(String password){
        getDriver().findElement(Password).sendKeys(password);
    }
    public static void ClickLogin(){
    	AdminPageBase.waiTillClickable(Login, 10);
        getDriver().findElement(Login).click();
    }
    public static void ClickRemeberMe(){
    	WebElement checkBox1 = getDriver().findElement(RememberMe);
        checkBox1.click();
        //getDriver().findElement(RememberMe).click();
    }
    public static boolean IsDisplayInvalidMessage(){
        return getDriver().findElement(InvalidMessage).isDisplayed();
    }
    public static boolean IsDisplayInvalidUserName(){
        return getDriver().findElement(InvalidUsername).isDisplayed();
    }
    public static String GetLoginMessage(){
       return getDriver().findElement(InvalidUsername).getText();
    }
    public static boolean IsDisplayInvalidPassword(){
        return getDriver().findElement(InvalidPassword).isDisplayed();
    }
    public static void ClickForgotPassword(){
       getDriver().findElement(ForgotPassword).click();
    }
}