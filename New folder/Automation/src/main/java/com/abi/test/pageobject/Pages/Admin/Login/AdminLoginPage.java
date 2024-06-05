package com.abi.test.pageobject.Pages.Admin.Login;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.abi.test.pageobject.Utils.AdminPageBase;

public class AdminLoginPage extends AdminPageBase {
	private static final Logger LOGGER= Logger.getLogger(AdminLoginPage.class);
    private static By HotelH1= By.xpath("//h1[@class='h4 text-gray-900 mb-4']");
    private static By UserName= By.id("email");
    private static By Password =By.id("exampleInputPassword");
    private static By Login =By.xpath("//input[@type='submit']");
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
        implicitWait(10);
    }
    public static void InputPasswordName(String password){
        getDriver().findElement(Password).sendKeys(password);
        implicitWait(10);
    }
    public static void ClickLogin(){
        getDriver().findElement(Login).click();
        implicitWait(10);
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