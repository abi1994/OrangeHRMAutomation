package com.abi.test.pageobject.Pages.Admin.DashBoard;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.abi.test.pageobject.Utils.PageBase;

public class AdminHomePageBannersDelete extends PageBase {
    private static final Logger LOGGER =Logger.getLogger(AdminHomePageBannersDelete.class);

    private static By AltText =By.xpath("//*[@id=\"content\"]/div/div/div[2]/p");
   
    public static Boolean IsDisplayAltText(){
        return getDriver().findElement(AltText).isDisplayed();
    }
}
