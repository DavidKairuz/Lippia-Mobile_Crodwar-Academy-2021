package com.crowdar.examples.pages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class CheapResult extends CheapBase {
    public static final String LABEL_TOTAL_ID = "com.cheaptickets:id/traveler_pricing_bottom_layout";
    public static final String BUTTON_SELECTTHIS_ID = "com.cheaptickets:id/uds_button_label";
    public static final String BUTTON_NEXT_ACCID="Next Button";

    public CheapResult(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }


    public void confirmaReserva() {
        if (isElementPresent(By.id(LABEL_TOTAL_ID))) {
            clickElement(By.id(BUTTON_SELECTTHIS_ID));

        } else {
            System.out.println("");
        }
    }


    public void compruebaReserva(){
        waitForElementClickable(MobileBy.AccessibilityId(BUTTON_NEXT_ACCID));
        Assert.assertTrue(isElementPresent(MobileBy.AccessibilityId(BUTTON_NEXT_ACCID)));
        clickElement(MobileBy.AccessibilityId(BUTTON_NEXT_ACCID));
    }

}
