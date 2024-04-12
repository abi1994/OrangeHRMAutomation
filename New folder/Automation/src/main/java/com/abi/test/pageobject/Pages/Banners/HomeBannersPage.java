package com.abi.test.pageobject.Pages.Banners;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.abi.test.pageobject.Utils.PageBase;

public class HomeBannersPage extends PageBase {
    private static final Logger LOGGER =Logger.getLogger(HomeBannersPage.class);

    private static By AltText =By.xpath("//*[@id=\"content\"]/div/div/div[2]/p");
    private static By BannerImg=By.xpath("//*[@id=\"carouselExampleControls\"]/div/div[1]/img");
   
    public static Boolean IsDisplayAltText(){
        return getDriver().findElement(AltText).isDisplayed();
    }
    
    
}
