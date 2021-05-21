package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import com.crowdar.examples.constants.CheapFlightConstants;
import io.cucumber.java.sl.In;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;

public class CheapFlight extends PageBaseMobile {

    public static final String FROM_BUTTON_XPATH = "//android.widget.LinearLayout[@content-desc=\"Flying from. Button\"]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView";
    public static final String FROM_INPUT_ID = "com.cheaptickets:id/search_src_text";
    public static final String TO_BUTTON_XPATH = "//android.widget.LinearLayout[@content-desc=\"Flying to. Button\"]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView";
    public static final String TO_INPUT_ID = "com.cheaptickets:id/search_src_text";


    public static final String DATES_BUTTON_XPATH = "//android.widget.LinearLayout[@content-desc=\"Select travel dates. Button. Opens dialog\"]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView";
    public static final String TRAVELER_BUTTON_XPATH = "//android.widget.LinearLayout[@content-desc=\"Number of travelers. Button. Opens dialog. 1 traveler\"]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText";
    public static final String ADULTADD_BUTTON_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ImageButton";
    public static final String YOUGADD_BUTTON_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ImageButton";
    public static final String CHILDADD_BUTTON_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ImageButton";
    public static final String INFANTADD_BUTTON_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ImageButton";


    public static final String PREFERENCE_BUTTON_XPATH = "//android.widget.LinearLayout[@content-desc=\"Select preferred class. Button. Opens dialog. Preferred class Economy\"]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText";

    public static final String FIRST_RADIO_ID = "com.cheaptickets:id/first_class";
    public static final String BUSINESS_RADIO_ID = "com.cheaptickets:id/business_class";
    public static final String PREMIUM_RADIO_ID = "com.cheaptickets:id/premium_economy";
    public static final String ECONOMIC_RADIO_ID = "com.cheaptickets:id/economy_class";
    public static final String DONEC_BUTTON_LOCATOR = "cheapflight.btndonec";


    public String xpathr = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]";
    public String LIST_RESULT_ID = "com.cheaptickets:id/suggestion_list";

    public CheapFlight(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }


    public void completFromAndTo(String origen, String destino) {
        clickElement(By.xpath(FROM_BUTTON_XPATH));
        completeField(By.id(FROM_INPUT_ID), origen);

        //seleccionar un resultado de la lista

        clickElement(By.xpath(TO_BUTTON_XPATH));
        completeField(By.id(TO_INPUT_ID), destino);

        //seleccionar un resultado de la lista


    }

    //verifica la lista no este vacia y hace un click sobre el elemento deberia separar y haga uno y otro por separado?!
    public void selectElementList(int id) {
        List<WebElement> webElementList = getWebElements(By.id(LIST_RESULT_ID));
        if ((webElementList.size() > 0) & id < webElementList.size()) {
            System.out.printf("la lista tiene elementos");
            webElementList.get(id).click();
        } else {
            System.out.printf("No hay resutados para la busqueda");

        }
    }


    public void setDates() {
        clickElement(By.xpath(DATES_BUTTON_XPATH));


    }

    //refactoriza un elemento de una lista obtenida
    public String refactorXpath(Integer ID) {
        String result = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[" + ID + "]";
        return result;
    }


    public void setTraveler(Integer adult, Integer young, Integer child, Integer infant) {
        clickElement(By.xpath(TRAVELER_BUTTON_XPATH));

        if (adult == 1) {

        } else {
            iteraClick(adult, ADULTADD_BUTTON_XPATH);
        }

        iteraClick(young,YOUGADD_BUTTON_XPATH);
        iteraClick(child,CHILDADD_BUTTON_XPATH);
        iteraClick(infant,INFANTADD_BUTTON_XPATH);

    }

    public void iteraClick(Integer n, String xpt) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                clickElement(By.xpath(xpt));
            }
        }

    }

    public void selecPreferenseClass(int tipo) {
        clickElement(By.xpath(PREFERENCE_BUTTON_XPATH));

        switch (tipo) {

            case 1:
                clickElement(By.xpath(FIRST_RADIO_ID));
                break;
            case 2:
                clickElement(By.xpath(BUSINESS_RADIO_ID));
                break;
            case 3:
                clickElement(By.xpath(PREMIUM_RADIO_ID));
                break;
            case 4:
                clickElement(By.xpath(ECONOMIC_RADIO_ID));
                break;

        }
    }


}






