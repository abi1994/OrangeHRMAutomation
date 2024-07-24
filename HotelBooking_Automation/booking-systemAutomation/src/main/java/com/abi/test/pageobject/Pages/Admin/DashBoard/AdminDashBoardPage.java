package com.abi.test.pageobject.Pages.Admin.DashBoard;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.abi.test.pageobject.Utils.PageBase;

public class AdminDashBoardPage extends PageBase {
    private static final Logger LOGGER =Logger.getLogger(AdminDashBoardPage.class);

    private static By Heading= By.xpath("//*[@id=\"content\"]/div/div/div[1]/h6/text()");
    private static By BannerImage =By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/form/table/tbody/tr[1]/th/text()");
    private static By AltText = By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/form/table/tbody/tr[2]/th/text()");
    private static By PublishStatus =By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/form/table/tbody/tr[3]/th/text()");
    private static By BannerImageUpload =By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/form/table/tbody/tr[1]/td/input");
    private static By AltTextInput =By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/form/table/tbody/tr[2]/td/input");
    private static By CheckBox =By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/form/table/tbody/tr[3]/td/input");
    private static By Submit =By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/form/table/tbody/tr[4]/td/input");
    private static By ViewAll =By.xpath("//*[@id=\"content\"]/div/div/div[1]/h6/a");
    
    public static Boolean IsDisplayHeading(){
        return getDriver().findElement(Heading).isDisplayed();
    }
    public static Boolean IsDisplayBannerImage(){
        return getDriver().findElement(BannerImage).isDisplayed();
    }
    public static Boolean IsDispalyAltText(){
        return getDriver().findElement(AltText).isDisplayed();
    }
    public static Boolean IsDisplayPulishstatus(){
         return getDriver().findElement(PublishStatus).isDisplayed();
    }
    public static void ClickBannerImage(){
        getDriver().findElement(BannerImageUpload).click();
    }
    public static void InputAltText(String Text){
        getDriver().findElement(AltTextInput).sendKeys(Text);
    }
    public static void ClickCheckBox(){
         getDriver().findElement(CheckBox).click();
    }
    public static void ClickSubmit(){
        getDriver().findElement(Submit).click();
    }
    public static void ClickViewAll(){
       getDriver().findElement(ViewAll).click();
    }
   
}
