package com.abi.test.pageobject.Pages.Booking;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.abi.test.pageobject.Utils.PageBase;

public class RoomBookingPage extends PageBase {
    private static final Logger LOGGER= Logger.getLogger(RoomBookingPage.class);
	
    private static By HotelH1= By.xpath("//h3[@class='mb-3' and contains(text(), 'Room Booking')]");
    private static By CheckinDate = By.xpath("//input[@name='checkin_date']");
    private static By CheckoutDate = By.xpath("//input[@name='checkout_date']");
    private static By AvaiableRoom =By.className("form-control room-list");
    private static By TotalAdults =By.xpath("//input[@name='total_adults']");
    private static By TotalChildern =By.xpath("//input[@name='total_children']");
    private static By Submit =By.className("btn btn-primary");
    
    
    public static boolean IsDisplayBookingPage(){
        return getDriver().findElement(HotelH1).isDisplayed();
    }
    
    public static void ClickCheckInDate() {
    	getDriver().findElement(CheckinDate).click();
    }
    
    public static void InputCheckinDate(String checkindate){
        getDriver().findElement(CheckinDate).sendKeys(checkindate);
    }
    
    public static void ClickCheckOutDate() {
    	getDriver().findElement(CheckoutDate).click();
    }
    
    public static void InputCheckoutDate(String checkoutdate) {
    	getDriver().findElement(CheckoutDate).sendKeys(checkoutdate);
    }
    public static void SelectAvailabeRoom() {
    	Select dropRoom =new Select(getDriver().findElement(AvaiableRoom));
    	dropRoom.selectByIndex(0);
    }
    
    public static void InputTotalAdults(String totaladults) {
    	getDriver().findElement(TotalAdults).sendKeys(totaladults);
    }
    
    public static void InputTotalChildern(String totalachildern) {
    	getDriver().findElement(TotalChildern).sendKeys(totalachildern);
    }
    
    public static void Submit() {
    	getDriver().findElement(Submit).click();
    }
}
