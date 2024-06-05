package com.abi.test.pageobject.Pages.RoomType;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import com.abi.test.pageobject.Utils.AdminPageBase;

public class AdminHomeViewRoomTypePage extends AdminPageBase {
    private static final Logger LOGGER =Logger.getLogger(AdminHomeViewRoomTypePage.class);

    private static By Heading= By.xpath("//*[@id=\"content\"]/div/div/div[1]/h6/text()");
    private static By number =By.xpath("//*[@id=\"dataTable\"]/thead/tr/th[1]");
    private static By Banner= By.xpath("//*[@id=\"dataTable\"]/thead/tr/th[2]");
    private static By AltText =By.xpath("//*[@id=\"dataTable\"]/thead/tr/th[3]");
    private static By Status =By.xpath("//*[@id=\"dataTable\"]/thead/tr/th[4]");
    private static By Action =By.xpath("//*[@id=\"dataTable\"]/thead/tr/th[5]");
    private static By AddNew =By.xpath("//*[@id=\"content\"]/div/div/div[1]/h6/a");
    private static By EditAction =By.xpath("//*[@id=\"dataTable\"]/tbody/tr[1]/td[5]/a[1]");
    private static By DeleteAction =By.xpath("//*[@id=\"dataTable\"]/tbody/tr[1]/td[5]/a[2]");

    public static Boolean IsDisplayHeading(){
        return getDriver().findElement(Heading).isDisplayed();
    }
    public static Boolean IsDisplayNumber(){
        return getDriver().findElement(number).isDisplayed();
    }
    public static Boolean IsDispalyAltText(){
        return getDriver().findElement(Banner).isDisplayed();
    }
    public static Boolean IsDisplayAltText(){
         return getDriver().findElement(AltText).isDisplayed();
    }
    public static Boolean IsDisplaystatus(){
        return getDriver().findElement(Status).isDisplayed();
   }
    public static Boolean IsDisplayAction(){
        return getDriver().findElement(Action).isDisplayed();
   }
    public static void ClickAddNew(){
       getDriver().findElement(AddNew).click();
    }
    public static String getEditSelectedOption(){
        Select dropDownOption =new Select(getDriver().findElement(EditAction));
        return dropDownOption.getFirstSelectedOption().getText();
    }
    public static String getDeleteSelectedOption(){
        Select dropDownOption =new Select(getDriver().findElement(DeleteAction));
        return dropDownOption.getFirstSelectedOption().getText();
    }
}
