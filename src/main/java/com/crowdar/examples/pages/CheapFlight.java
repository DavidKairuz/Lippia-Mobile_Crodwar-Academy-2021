package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import com.crowdar.examples.constants.CheapFlightConstants;
import com.sun.mail.imap.protocol.ID;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.sl.In;
import io.cucumber.java8.Id;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class CheapFlight extends CheapBase {
    //origen y destino
    public static final String FROM_BUTTON_XPATH = "//android.widget.LinearLayout[@content-desc=\"Flying from. Button\"]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView";
    public static final String FROM_INPUT_ID = "com.cheaptickets:id/search_src_text";
    public static final String TO_BUTTON_XPATH = "//android.widget.LinearLayout[@content-desc=\"Flying to. Button\"]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView";
    public static final String TO_INPUT_ID = "com.cheaptickets:id/search_src_text";


    public static final String DATES_BUTTON_XPATH = "//android.widget.LinearLayout[@content-desc=\"Select travel dates. Button. Opens dialog\"]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView";
    public static final String MONTH_ID = "com.cheaptickets:id/month";
    public static final String DAY_MONTH_ACCID = "Friday, May 28 button";
    public static final String MOUNTHCURRENT_ACCID = "May 2021 current month";
    public static final String MONTHCURRENT_ID = "com.cheaptickets:id/current_month";
    public static final String DONECalendar_BUTTON_ID = "android:id/button1";
    public static final String NEXTMOUTH_BUTTON_ID = "com.cheaptickets:id/next_month";

    public static final String TRAVELER_BUTTON_XPATH = "//android.widget.LinearLayout[@content-desc=\"Number of travelers. Button. Opens dialog. 1 traveler\"]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText";
    public static final String ADULTADD_BUTTON_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ImageButton";
    public static final String YOUGADD_BUTTON_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ImageButton";
    public static final String CHILDADD_BUTTON_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ImageButton";
    public static final String INFANTADD_BUTTON_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ImageButton";
    public static final String DONEP_BUTTON_ID = "com.cheaptickets:id/done_button";

    public static final String PREFERENCE_BUTTON_XPATH = "//android.widget.LinearLayout[@content-desc=\"Select preferred class. Button. Opens dialog. Preferred class Economy\"]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText";

    public static final String FIRST_RADIO_ID = "com.cheaptickets:id/first_class";
    public static final String BUSINESS_RADIO_ID = "com.cheaptickets:id/business_class";
    public static final String PREMIUM_RADIO_ID = "com.cheaptickets:id/premium_economy";
    public static final String ECONOMIC_RADIO_ID = "com.cheaptickets:id/economy_class";
    public static final String DONEC_BUTTON_ID = "android:id/button1";


    public static final String SEARCH_BUTTON_ID = "com.cheaptickets:id/search_btn";

    //busquedas
    public static final String AeroparqueArg_origen_xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.TextView";
    public static final String AeropuertoBrasil_destino = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView";
    //public static final String

    public String xpathr = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]";
    public String LIST_RESULT_ID = "com.cheaptickets:id/suggestion_list";

    public static final String MSJ_TEXT_ID = "com.cheaptickets:id/empty_state_body";
    public static final String ICON_IMG_ID = "com.cheaptickets:id/empty_state_icon";
    public static final String EDIT_BUTTON_ID = "com.cheaptickets:id/uds_button_label";

    public static final String LABEL_RESULTS_ID = "com.cheaptickets:id/flight_results_price_header";
    public static final String ITEM_LIST_XPATH = "//android.widget.FrameLayout[@content-desc=\"Flight time is 14:20 to 17:00 with price $308. Flying with Aerolineas Argentinas. The flight duration is 2 hours 40 minutes with 1 stops RES to PRA. 0 hours 50 minutes. Layover 0 hours 50 minutes. PRA to AEP. 1 hour 0 minutes. Preferred class Economy + Economy Button\"]/android.widget.LinearLayout/android.widget.LinearLayout";


    public CheapFlight(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    //completa los campos de origen y destino
    public void completFromAndTo(String origin, String destino) {
        waitForElementPresence(By.xpath(FROM_BUTTON_XPATH));
        clickElement(By.xpath(FROM_BUTTON_XPATH));
        clickElement(By.id(FROM_INPUT_ID));
        completeField(By.id(FROM_INPUT_ID), origin);
        clickElement(By.xpath(AeroparqueArg_origen_xpath));//opcion elegida en la busqueda
        completeField(By.id(TO_INPUT_ID), destino);
        clickElement(By.xpath(AeropuertoBrasil_destino));//opcion elegida en la busqueda

    }

    //establece las fechas pasadas por parametro
    public void setDates(String ida, String vuelta) throws IOException, ParseException {
        String fecha1 = convertDateTravel(ida);
        String fecha2 = convertDateTravel(vuelta);
        isElementPresent(By.id(MOUNTHCURRENT_ACCID));

        if (fecha1.isEmpty() || fecha2.isEmpty()) {
            System.out.println("Fechas vacias");
        } else {
            try {
                driver.findElement(MobileBy.AccessibilityId(fecha1)).click();
                driver.findElement(MobileBy.AccessibilityId(fecha2)).click();
                clickElement(By.id(DONECalendar_BUTTON_ID));
            } catch (Exception e) {
                System.out.println("Error ");
            }
        }
    }


    //le da tantos clicks como viajeros sean
    public void setTraveler(Integer adult, Integer child) {
        clickElement(By.xpath(TRAVELER_BUTTON_XPATH));
        if (adult == 1) {
        } else {
            iteraClick(adult, ADULTADD_BUTTON_XPATH);
        }
        iteraClick(child, CHILDADD_BUTTON_XPATH);
        clickElement(MobileBy.id(DONEP_BUTTON_ID));
    }


    public void setPreferenseClass(Integer tipo) {
        clickElement(By.xpath(PREFERENCE_BUTTON_XPATH));

        switch (tipo) {
            case 1:
                clickElement(By.id(FIRST_RADIO_ID));
                break;
            case 2:
                clickElement(By.id(BUSINESS_RADIO_ID));
                break;
            case 3:
                clickElement(By.id(PREMIUM_RADIO_ID));
                break;
            case 4:
                clickElement(By.id(ECONOMIC_RADIO_ID));
                break;

        }
        clickElement(MobileBy.id(DONEC_BUTTON_ID));
    }


    public void clickButtonSearch() {
        clickElement(By.id(SEARCH_BUTTON_ID));
        //waitForElementPresence();

    }

    public void selectListFlight() {
        if (isElementPresent(By.id(MSJ_TEXT_ID)) && isElementPresent(By.id(ICON_IMG_ID))) {
            System.out.println("No hay elementos en la busqueda");
            clickElement(By.id(EDIT_BUTTON_ID));
        } else {
            Assert.assertTrue(isElementPresent(By.id(LABEL_RESULTS_ID)));
            if (isElementPresent(By.xpath(ITEM_LIST_XPATH))) {
                clickElement(By.xpath(ITEM_LIST_XPATH));
            }


        }
    }


}






