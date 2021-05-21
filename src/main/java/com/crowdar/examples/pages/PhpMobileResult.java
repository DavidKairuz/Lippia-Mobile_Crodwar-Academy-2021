package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;


/**
 * This class is based in the old format of Page objects. See the package services in the new format.
 */
public class PhpMobileResult extends PageBaseMobile {


  public static final String MSJ_CONFIRMA_XPATH="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.ImageView";

    public PhpMobileResult(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

 public void verificaReserva(){
        isPresent(MSJ_CONFIRMA_XPATH);
 }



}


