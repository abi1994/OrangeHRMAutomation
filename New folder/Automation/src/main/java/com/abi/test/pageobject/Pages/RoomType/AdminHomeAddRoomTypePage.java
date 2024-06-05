package com.abi.test.pageobject.Pages.RoomType;

import java.io.File;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.abi.test.pageobject.Utils.AdminPageBase;


public class AdminHomeAddRoomTypePage extends AdminPageBase {
    private static final Logger LOGGER =Logger.getLogger(AdminHomeAddRoomTypePage.class);

	private static final String BASE_IMAGE_DIRECTORY = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "img" + File.separator;

    private static By Heading =By.xpath("//h6[contains(text(), 'Add RoomType')]");
    private static By Title =By.xpath("//input[@name='name']");
    private static By Price =By.xpath("//input[@name='price']");
    private static By Capacity =By.xpath("//input[@name='capacity']");
    private static By Detail =By.xpath("//textarea[@name='description']");
    private static By Submit =By.xpath("//input[@type='submit']");
    private static By UploadImg=By.xpath("//input[@name='filename']");
    private static By Viewall =By.linkText("View All");
    
    
    public static Boolean IsDispalyHeading() {
    	return getDriver().findElement(Heading).isDisplayed();
    }
    
    public static void clickUploadImage(String imageName) {
        String imagePath = BASE_IMAGE_DIRECTORY + imageName;
        getDriver().findElement(UploadImg).sendKeys(imagePath);
    }
    
    public static void EnterTitel(String text) {
    	getDriver().findElement(Title).sendKeys(text);
    }
    
    public static void EnterPrice(String text) {
    	getDriver().findElement(Price).sendKeys(text);
    }
    
    public static void EnterCapacity(String text) {
    	getDriver().findElement(Capacity).sendKeys(text);
    }
    
    public static void EnterDetail(String text) {
    	getDriver().findElement(Detail).sendKeys(text);
    }
    public static void ClickSubmit() {
    	getDriver().findElement(Submit).click();
    }
    
    public static void ClickViewall() {
    	getDriver().findElement(Viewall).click();
    }
}
