package com.abi.test.pageobject.Pages.Banners;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.abi.test.pageobject.Utils.AdminPageBase;


public class AdminHomeAddBannersPage extends AdminPageBase {
    private static final Logger LOGGER =Logger.getLogger(AdminHomeAddBannersPage.class);

    private static By AltText =By.xpath("//*[@id=\"content\"]/div/div/div[2]/p");
    private static By Heading =By.xpath("//h6[contains(text(), 'Add Banner')]");
    private static By UploadImg=By.xpath("//input[@name='filename']");
    private static By Alt_Text=By.xpath("//input[@name='alt_text']");
    private static By CheckBox=By.xpath("//input[@name='publish_status']");
    private static By Submit =By.xpath("//input[@type=\"submit\"]");
    private static By Viewall =By.linkText("View All");
    
    
    public static Boolean IsDisplayAltText(){
        return getDriver().findElement(AltText).isDisplayed();
    }
    
    public static Boolean IsDispalyHeading() {
    	return getDriver().findElement(Heading).isDisplayed();
    }
    
    public static void ClickUploadImage() {
    	
    	getDriver().findElement(UploadImg).sendKeys("D:\\Abirame\\New folder\\Automation\\src\\test\\resources\\img\\banner3.jpg");
    }
    
    public static void InterAltText(String text) {
    	getDriver().findElement(Alt_Text).sendKeys(text);
    }
    
    public static void CheckPublishStatus() {
    	getDriver().findElement(CheckBox).click();
    }
    
    public static void ClickSubmit() {
    	getDriver().findElement(Submit).click();
    }
    
    public static void ClickViewall() {
    	getDriver().findElement(Viewall).click();
    }
}
