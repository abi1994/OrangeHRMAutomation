package com.abi.test.pageobject.Pages.Leave;
import com.abi.test.pageobject.Utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class AssignLeavePage extends PageBase {

    private static final Logger LOGGER =Logger.getLogger(AssignLeavePage.class);

    private static By Heading= By.xpath("//h1");
    private static By LeaveAssine =By.xpath("//a[@href=\"/index.php/leave/assignLeave\"]/img");
    private static By EmployeeName = By.id("assignleave_txtEmployee_empName");
    private static By AlterMessage =By.linkText("Required");
    private static By LeaveType =By.id("assignleave_txtLeaveType");
    private static By BalanceLink =By.id("leaveBalance_details_link");
    private static By BalanceLinkBox =By.id("leaveBalance_details_link");
    private static By BalanceBoxClose =By.xpath("//div[@id=\"multiperiod_balance\"]/div/a");
    private static By BalanceLinkOk =By.id("closeButton");
    private static By LevaeForm =By.id("assignleave_txtFromDate");
    private static By LeaveFromCal =By.id("ui-datepicker-div");
    private static By LevaeTo =By.id("assignleave_txtToDate");
    private static By LeaveToCal =By.id("ui-datepicker-div");
    private static By assignleave_partialDays=By.id("assignleave_partialDays");
    private static By StratDateDay =By.id("assignleave_firstDuration_duration");
    private static By StratDate =By.id("assignleave_firstDuration_ampm");
    private static By Comment =By.id("assignleave_txtComment");
    private static By Assine =By.id("assignBtn");
    private static By ConformationAlertBox=By.id("leaveBalanceConfirm");
    private static By ConformationAlertOk=By.id("confirmOkButton");
    private static By ConformationCansal=By.id("confirmCancelButton");
    private static By AlterConformationMessage=By.xpath("//div[@id=\"leaveBalanceConfirm\"]/div[2]");


    public static Boolean IsDisplayHeading(){
        return getDriver().findElement(Heading).isDisplayed();
    }
    public static Boolean IsDisplayLeaveAssine(){
        return getDriver().findElement(LeaveAssine).isDisplayed();
    }
    public static void ClickLeaveAssine(){
        getDriver().findElement(LeaveAssine).click();
    }
    public static void InputEmployeeName(String name){
        getDriver().findElement(EmployeeName).sendKeys(name);
    }
    public static void ClearInputEmployeeName(){
        getDriver().findElement(EmployeeName).clear();
    }
    public static Boolean IsDisplayAlter(){
        return getDriver().findElement(AlterMessage).isDisplayed();
    }
    public static String getSelectedOption(){
        Select dropDownOption =new Select(getDriver().findElement(LeaveType));
        return dropDownOption.getFirstSelectedOption().getText();
    }
    public static void setDropOption(String option){
        Select dropDownOption =new Select(getDriver().findElement(LeaveType));
        dropDownOption.selectByVisibleText(option);
    }
    public static void ClickBalanceLink(){
        getDriver().findElement(BalanceLink).click();
    }
    public static boolean IsDisplayBalanceBox(){
        return getDriver().findElement(BalanceLinkBox).isDisplayed();
    }
    public static void ClickOkBalanceBox(){
        getDriver().findElement(BalanceLinkOk).click();
    }
    public static void ClickBalanceBoxclose(){
        getDriver().findElement(BalanceBoxClose).click();
    }
    public static void SendLeaveFrom(String from){
        getDriver().findElement(LevaeForm).sendKeys(from);
    }
    public static void ClearLeaveFrom(){
        getDriver().findElement(LevaeForm).clear();
    }
    public static void SendLeaveTo(String to){
        getDriver().findElement(LevaeTo).sendKeys(to);
    }
    public static void ClearLeaveTo(){
        getDriver().findElement(LevaeTo).clear();
    }
    public static boolean IsDisplayFromCal(){
        return getDriver().findElement(LeaveFromCal).isDisplayed();
    }
    public static boolean IsDisplayToCal(){
        return getDriver().findElement(LeaveToCal).isDisplayed();
    }
    public static String getSelectedpartialDays(){
        Select partialDay =new Select(getDriver().findElement(assignleave_partialDays));
        return partialDay.getFirstSelectedOption().getText();
    }
    public static void SetPartialDays(String day){
        Select partialday =new Select(getDriver().findElement(assignleave_partialDays));
        partialday.selectByVisibleText(day);
    }
    public static void ClickLeave(){
        getDriver().findElement(LeaveToCal).click();
    }
    public static void ClickLeavefrom(){
        getDriver().findElement(LeaveFromCal).click();
    }
    public static void setStratDateDay(String day){
        Select stratDateDay =new Select(getDriver().findElement(StratDateDay));
        stratDateDay.selectByVisibleText(day);

    }
    public static void SetStratDAte(String day){
        Select setDate =new Select(getDriver().findElement(StratDate));
        setDate.selectByValue(day);
    }
    public static void SendComment(String cmd){
        getDriver().findElement(Comment).sendKeys(cmd);
    }
    public static void ClickAssine(){
        getDriver().findElement(Assine).click();
    }
    public static Boolean IsDisplayConformationBox(){
        return getDriver().findElement(ConformationAlertBox).isDisplayed();
    }
    public static void ClickConformationOk(){
        getDriver().findElement(ConformationAlertOk).click();
    }
    public static void ClickConformationCansal(){
        getDriver().findElement(ConformationCansal).click();
    }
    public static String GetConformationMessage(){
        return getDriver().findElement(AlterConformationMessage).getText();
    }
}
