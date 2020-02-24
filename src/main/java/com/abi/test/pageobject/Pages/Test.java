package com.abi.test.pageobject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "D:\\OrangeHRM_Automation\\src\\test\\resources\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
       // driver.findElement(By.cssSelector(".login")).click();
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        //driver.findElement(By.name("passwd")).sendKeys("12345");
        driver.findElement(By.id("btnLogin")).click();
        System.out.println("Suecessfull Login");
    }
}
