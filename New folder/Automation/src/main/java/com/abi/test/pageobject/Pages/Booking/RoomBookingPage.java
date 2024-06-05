package com.abi.test.pageobject.Pages.Booking;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.abi.test.pageobject.Utils.PageBase;

public class RoomBookingPage extends PageBase {
    private static final Logger LOGGER= Logger.getLogger(RoomBookingPage.class);
	
    private static By HotelH1= By.xpath("//h3[@class='mb-3' and contains(text(), 'Room Booking')]");
    private static By CheckinDate = By.xpath("//input[@class='form-control checkin-date']");
    private static By CheckoutDate = By.xpath("//input[@name='check_out_date' and @type='date' and @class='form-control']");
    private static By AvaiableRoom =By.cssSelector("select.form-control.room-list");
    private static By TotalAdults =By.xpath("//input[@name='total_adults']");
    private static By TotalChildern =By.xpath("//input[@name='total_children']");
    private static By Submit =By.xpath("//input[@class='btn btn-primary']");
    
    
    public static boolean IsDisplayBookingPage(){
        return getDriver().findElement(HotelH1).isDisplayed();
    }
    
    public static void ClickCheckInDate() {
    	getDriver().findElement(CheckinDate).clear();
    }
    
    public static void InputCheckinDate(String checkindate){
        getDriver().findElement(CheckinDate).sendKeys(checkindate);
    }
    
    public static void ClickCheckOutDate() {
    	getDriver().findElement(CheckoutDate).clear();
    }
    
    public static void InputCheckoutDate(String checkoutdate) {
    	getDriver().findElement(CheckoutDate).sendKeys(checkoutdate);
    }
    
    public static void SelectAvailabeRoom(String option) {
    	Select dropDownOption =new Select(getDriver().findElement(AvaiableRoom));
        dropDownOption.selectByVisibleText(option);
	
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
