package com.abi.test.pageobject.Utils;

import org.openqa.selenium.WebDriver;

import java.io.File;

public class test {
    //webdriver define
    private static WebDriver driver;
    //Url
    private static String Url = "https://opensource-demo.orangehrmlive.com/";
    //driver location
    private static String WebDriverLocation = "src" + File.separator + "test" + File.separator + "resources" + File.separator + "Driver" + File.separator;
    //os type
    //
    // D:\OrangeHRM_Automation\src\test\resources\Driver\chromedriver.exe
    private static String Ostype = System.getProperty("os.type", Constans.WINDOW);
    //browser type
    private static String DriverType = System.getProperty("browser.type", Constans.CHROME);

/**
 * Initialize webdriver, set driver path and maximize chrome browser window
 */
}
