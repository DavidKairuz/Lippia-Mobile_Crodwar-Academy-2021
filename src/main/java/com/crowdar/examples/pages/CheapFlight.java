package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import com.crowdar.examples.constants.CheapFlightConstants;
import io.appium.java_client.MobileBy;
import io.cucumber.java.sl.In;
import io.cucumber.java8.Id;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

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
    public static final String DONECalendar_BUTTON_ID = "";

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


    public static final String AeroparqueArg_origen_xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.TextView";
    public static final String AeropuertoBrasil_destino = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView";


    public String xpathr = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]";
    public String LIST_RESULT_ID = "com.cheaptickets:id/suggestion_list";


    public CheapFlight(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }


    public void completFromAndTo(String origin, String destino) {
        waitForElementPresence(By.xpath(FROM_BUTTON_XPATH));
        clickElement(By.xpath(FROM_BUTTON_XPATH));
        clickElement(By.id(FROM_INPUT_ID));
        completeField(By.id(FROM_INPUT_ID), origin);
        clickElement(By.xpath(AeroparqueArg_origen_xpath));//opcion elegida en la busqueda
        completeField(By.id(TO_INPUT_ID), destino);
        clickElement(By.xpath(AeropuertoBrasil_destino));//opcion elegida en la busqueda

    }

    //verifica la lista no este vacia y hace un click sobre el elemento deberia separar y haga uno y otro por separado?!
   /* public void selectElementList(int id) {
        List<WebElement> webElementList = getWebElements(By.id(LIST_RESULT_ID));
        if ((webElementList.size() > 0) & id < webElementList.size()) {
            System.out.printf("la lista tiene elementos");
            webElementList.get(id).click();
        } else {
            System.out.printf("No hay resutados para la busqueda");

        }
    }*/


    public void setDates(String ida, String vuelta) {
        // clickElement(By.xpath(DATES_BUTTON_XPATH));
        String fecha1 = convertDate(ida);
        String fecha2 = convertDate(vuelta);
        isElementPresent(By.id(MOUNTHCURRENT_ACCID));
        List<WebElement> mes = getWebElements(By.id(MONTH_ID));
        //busca la primer fecha en el calendario
        for (int i = 0; i < mes.size(); i++) {
            WebElement element = mes.get(i);
             String namefecha= element.getAttribute("content-desc");
            if (namefecha.contains(fecha1)) {
                System.out.println(element.getText());
                element.click();
            }else{
                System.out.println("Eror no se encontro");
            }
        }
        //busca la segunda fecha en el calendario
        for (int i = 0; i < mes.size(); i++) {
            WebElement element = mes.get(i);
            String namefecha= element.getAttribute("content-desc").toString();
            if (namefecha.contains(fecha2)) {
                System.out.println(element.getText());
                element.click();
            }else{
                System.out.println("Eror no se encontro");
            }
        }
        //clickElement(By.id(DONECalendar_BUTTON_ID));
    }




    //refactoriza un elemento de una lista obtenida
    public String refactorXpath(Integer ID) {
        String result = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[" + ID + "]";
        return result;
    }

    //le da tantos clicks como viajeros sean
    public void setTraveler(Integer adult, Integer child) {
        clickElement(By.xpath(TRAVELER_BUTTON_XPATH));

        if (adult == 1) {

        } else {
            iteraClick(adult, ADULTADD_BUTTON_XPATH);
        }
        // iteraClick(young,YOUGADD_BUTTON_XPATH);
        iteraClick(child, CHILDADD_BUTTON_XPATH);
        clickElement(MobileBy.id(DONEP_BUTTON_ID));
    }


    public void iteraClick(Integer n, String xpt) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                clickElement(MobileBy.xpath(xpt));
            }
        }

    }

    public void setPreferenseClass(Integer tipo) {
        //  clickElement(By.xpath(PREFERENCE_BUTTON_XPATH));

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
        clickElement(MobileBy.id(DONEC_BUTTON_ID));
    }


    public void clickButtonSearch() {
        clickElement(By.id(SEARCH_BUTTON_ID));

    }

    //devuelve el formato Mes numero como string
    public String convertDate(String fecha) {
        int x = 3; //index mes
        int y = 5;
        int w = 0; //index fecha
        int s = 2;
        String result = "";
        if (fecha.isEmpty()) {
            System.out.println("Error fecha vacia");

        } else {
            String smes = fecha.substring(x, y);
            String sfecha = fecha.substring(w, s);

            result = getMonth(smes) + " " + sfecha;
        }
        String mes = fecha;
        return result;
    }

    //recibe la fecha en su formato dd/mm y obtine el nombre del mes
    public String getMonth(String smes) {
        String month = "";
        switch (smes) {
            case "01":
                month = "January";
                break;
            case "02":
                month = "February";
                break;
            case "03":
                month = "March";
                break;
            case "04":
                month = "April";
                break;
            case "05":
                month = "May";
                break;
            case "06":
                month = "June";
                break;
            case "07":
                month = "July";
                break;
            case "08":
                month = "August";
                break;
            case "09":
                month = "September";
                break;
            case "10":
                month = "October";
                break;
            case "11":
                month = "November";
                break;
            case "12":
                month = "December";
                break;
            default:
                System.out.print("Error fuera de rango");

        }

        return month;
    }


}






