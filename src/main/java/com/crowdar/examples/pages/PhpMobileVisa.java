package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * This class is based in the old format of Page objects. See the package services in the new format.
 */
public class PhpMobileHome extends PageBaseMobile {

    private final String ACTION_BAR_XPATH = "//*[@resource-id='android:id/action_bar']";
    private final String TEXT_VIEW_XPATH = "//android.widget.TextView";

    public static final String SALIDA_INPUT_LOCATOR = "com.phptravelsnative:id/btn_origin";
    public static final String LLEGADA_INPUT_ID = "com.phptravelsnative:id/car_to";
    public static final String NOMBRE_INPUT_ID = "com.phptravelsnative:id/first_name";
    public static final String APELLIDO_INPUT_ID = "com.phptravelsnative:id/last_name";
    public static final String EMAIL_INPUT_ID ="com.phptravelsnative:id/email";
    public static final String TELEFONO_INPUT_ID ="com.phptravelsnative:id/phone";
    public static final String ASUNTO_INPUT_ID ="com.phptravelsnative:id/notes";
    public static final String VISA_BUTTON_XPATH="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView";


    public PhpMobileHome(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public String getTitle() {
        return getWebElement(By.xpath(ACTION_BAR_XPATH)).findElement(By.xpath(TEXT_VIEW_XPATH)).getText();
    }

    private WebElement getMenuElement(String menu) {
        return getWebElement(By.xpath("//android.widget.TextView[@content-desc=" + "\"" + menu + "\"" + "]"));
    }

    public void clickMenuElement(String menu) {
        WebElement element = getMenuElement(menu);
        clickElement(element);
        
    }

//hago click en el boton de visa
    public void clickButtonVisa(){
        clickElement(By.xpath(VISA_BUTTON_XPATH));
    }

    public void setFrom(){
        clickElement();
    }

    public void setData(String nombre,String apellido,String email,String telefono,String asunto){
        completeField(By.id(NOMBRE_INPUT_ID),nombre);
        completeField(By.id(APELLIDO_INPUT_ID),apellido);
        completeField(By.id(EMAIL_INPUT_ID),email);
        completeField(By.id(TELEFONO_INPUT_ID),telefono);
        completeField(By.id(ASUNTO_INPUT_ID),asunto);
    }



}
