package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class CheapHome extends PageBaseMobile {

    public static final String TEXT_TITLE_ACCID = "CheapTickets";
    public static final String FLIGHT_BUTTON_ACCID = "Flights Button";


    public CheapHome(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }


    public void isHome(){
        waitForElementVisibility(MobileBy.AccessibilityId(TEXT_TITLE_ACCID));
        Assert.assertTrue( isElementPresent(MobileBy.AccessibilityId(TEXT_TITLE_ACCID)));
    }

    public void clickButtonFlights(){
        clickElement(MobileBy.AccessibilityId(FLIGHT_BUTTON_ACCID));
    }



}
