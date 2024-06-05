package com.abi.test.pageobject.Utils;

import com.abi.test.pageobject.Pages.Login.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.io.File;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;


public class PageBase {
    private static WebDriver driver;
    
    private static String baseUrl = "http://127.0.0.1:8000/";
    private static String webDriverLocation = "src"+ File.separator+"test"+File.separator+"resources"+File.separator+"Driver"+File.separator;
    protected static String downloadFilepath = System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"fileDownload";
    protected static String uploadFilepath = System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"fileUpload";
    protected static String osType = System.getProperty("os.type", Constans.WINDOW);
    protected static String driverType = System.getProperty("browser.type", Constans.CHROME);

    /**
     * Initialize webdriver, set driver path and maximize chrome browser window
     */  
    public static void initiateDriver() throws MalformedURLException {
        staticWait(1);
        if (Constans.CHROME.equals(driverType)) {
            if (osType.equals(Constans.WINDOW))
                System.setProperty("webdriver.chrome.driver", webDriverLocation + "chromedriver.exe");
            else
                System.setProperty("webdriver.chrome.driver", webDriverLocation + "chromedriver");

            driver = new ChromeDriver();
        } else if (Constans.FIREFOX.equals(driverType)) {
            if (osType.equals(Constans.WINDOW))
                System.setProperty("webdriver.gecko.driver", webDriverLocation + "geckodriver.exe");
            else
                System.setProperty("webdriver.gecko.driver", webDriverLocation + "geckodriver");

            HashMap<String, Object> fireFoxPrefs = new HashMap<String, Object>();
            FirefoxOptions optionsFireFox = new FirefoxOptions();
            optionsFireFox.addPreference("profile.default_content_settings.popups", 0);
            optionsFireFox.addPreference("download.prompt_for_download", "false");
            optionsFireFox.addPreference("download.default_directory", downloadFilepath);
            DesiredCapabilities capFireFox = DesiredCapabilities.firefox();
            capFireFox.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            capFireFox.setCapability(ChromeOptions.CAPABILITY, optionsFireFox);

            driver = new FirefoxDriver();
        }
        getDriver().manage().window().maximize();
        getDriver().get(baseUrl);
    }

    /*
     * Get web driver instance
     */
    public static WebDriver getDriver() {
        return driver;
    }

    /**
     * Close web driver instances
     */
    public static void closeDriver() {
        getDriver().quit();
        staticWait(10);
    }

    /**
     * Refresh web driver instances
     */
    public static void refreshDriver() {
        getDriver().navigate().refresh();
    }

    /**
     * Navigate Back
     */
    public static void navigateBack() {
        getDriver().navigate().back();
    }

    /**
     * GetCurrent Window Details
     */
    public static String getCurrentWindow() {
        return getDriver().getWindowHandle();
    }

    /**
     * Navigate to Window By Title
     * @param windowName
     */
    public static void navigateToWindow(String windowName) {
        getDriver().switchTo().window(windowName);
    }

    /**
     * Static Wait
     */
    public static void staticWait(int seconds) {
        try {
            Thread.sleep(seconds*1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Implicit Wait
     */
    public static void implicitWait(int seconds) {
        getDriver().manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    /**
     * Explicit Wait Clickable
     */
    public static void waiTillClickable(By element , int seconds) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * Explicit Wait Visible
     */
    public static void waiTillVisible(By element ,int seconds) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

  
    public static void Login(String username , String Password){
        LoginPage.InputUserName(username);
        LoginPage.InputPasswordName(Password);
        LoginPage.Clicksubmit();
    }

}