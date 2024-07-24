package com.abi.test.pageobject.Pages.Register;
import com.abi.test.pageobject.Utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegisterUser extends PageBase {

    private static final Logger LOGGER =Logger.getLogger(RegisterUser.class);

    private static By Heading= By.xpath("//h1");
    private static By FullName= By.id("full_name");
    private static By EmailID = By.id("email");
    private static By Password =By.id("exampleInputPassword");
    private static By MobileNumber =By.id("mobile");
    private static By Address =By.id("address");
    private static By Submit =By.xpath("/html/body/main/div/div/div/div/div/div/div[2]/div/form/input[3]");
    private static By AlterMessage =By.xpath("/html/body/main/div/div/div/div/div/div/div[2]/div/p");
    

    public static Boolean IsDisplayHeading(){
        return getDriver().findElement(Heading).isDisplayed();
    }
    public static void InputFullName(String fullname){
        getDriver().findElement(FullName).sendKeys(fullname);
    }
	public static void InputEmailId(String email){
	    getDriver().findElement(EmailID).sendKeys(email);
	}   
	public static void InputPassWord(String password){
	    getDriver().findElement(Password).sendKeys(password);
	}
	public static void InputMobileNumber(String mobilenumber){
	    getDriver().findElement(MobileNumber).sendKeys(mobilenumber);
	}
	public static void InputAddress(String address){
	    getDriver().findElement(Address).sendKeys(address);
	} 
    public static void ClickSubmite(){
        getDriver().findElement(Submit).click();
    }
    public static Boolean IsDisplayAlter(){
        return getDriver().findElement(AlterMessage).isDisplayed();
    }


}
