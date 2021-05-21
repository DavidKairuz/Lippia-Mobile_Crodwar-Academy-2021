package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.core.pageObjects.PageBaseMobile;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.CheapConstants;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;

public class CheapTicketsService extends MobileActionManager {

    public static void isViewLoaded() {
        waitVisibility(CheapConstants.TEXT_TITLE_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(CheapConstants.FLIGHT_BUTTON_LOCATOR));
    }


    public static void clickbuttonFlight(){
        MobileActionManager.click(CheapConstants.FLIGHT_BUTTON_LOCATOR);
    }


}
