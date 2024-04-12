package com.abi.test.pageobject.Pages.Login;

import com.abi.test.pageobject.Utils.PageBase;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {
    private static final Logger LOGGER= Logger.getLogger(LoginPage.class);
    private static By HotelH1= By.xpath("/html/body/main/section/div/div/div/div/div/div[2]/div/form/h5");
    private static By Emailadd = By.id("form2Example17");
    private static By Password =By.id("form2Example27");
    private static By Subbmit =By.xpath("/html/body/main/section/div/div/div/div/div/div[2]/div/form/div[4]/input");
    private static By InvalidMessage =By.xpath("/html/body/main/section/div/div/div/div/div/div[2]/div/p");
   
    private static By LogOut=By.xpath("//*[@id=\"navbarNavAltMarkup\"]/div/a[3]");


    public static boolean IsDisplayLoginPage(){
        return getDriver().findElement(HotelH1).isDisplayed();
    }
    public static void InputUserName(String emailadd){
        getDriver().findElement(Emailadd).sendKeys(emailadd);
    }
    public static void InputPasswordName(String password){
        getDriver().findElement(Password).sendKeys(password);
    }
    public static void Clicksubmit(){
        getDriver().findElement(Subbmit).click();
    }
    public static boolean IsDisplayInvalidMessage(){
        return getDriver().findElement(InvalidMessage).isDisplayed();
    }
    public static String GetLoginMessage(){
       return getDriver().findElement(InvalidMessage).getText();
    }
    
    public static boolean IsDisplayLogOut(){
        return getDriver().findElement(LogOut).isDisplayed();
    }
    
    public static void LogOutPage() {
    	getDriver().findElement(LogOut).click();
    }

}
