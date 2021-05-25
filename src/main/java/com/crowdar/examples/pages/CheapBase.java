package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import io.appium.java_client.MobileBy;
import net.sf.cglib.core.Local;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CheapBase extends PageBaseMobile {



    public CheapBase(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    //realiza un numero de iteraciones
    public void iteraClick(Integer n, String xpt) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                clickElement(MobileBy.xpath(xpt));
            }
        }

    }

    //Date fecha = new Date(Calendar.getInstance().getTimeInMillis()); para la fecha actual
    public String convertDateTravel(String sfecha){
        String  fechaTexto ="";
        try {
            Date fecha = new SimpleDateFormat("dd/MM/yy").parse(sfecha);//tipo de formato que recibe
            SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMMM dd ", Locale.US);//nuevo formato que queremos y para que lo devuelva en ingles
            fechaTexto = formatter.format(fecha)+ "button";
            return fechaTexto;

        } catch (ParseException e) {
            System.out.println("ParseException occured: " + e.getMessage());
        }
        return  fechaTexto;
    }









}







    /*public void setDatapicker(String date)throws IOException, ParseException {

        int thisYear = Integer.valueOf(driver.findElement(By.id("com.cheaptickets:id/current_month")).getAttribute("text"));
        String today = driver.findElement(By.id("android:id/date_picker_header_date")).getAttribute("name");
        int thisMonth = getMonthNumber(getMonthNameInThreeChars(today));

        // Split the given date into date, month and year
        String[] splitdate = date.split("\\s+");

        int givenDay = Integer.valueOf(splitdate[0]);
        int givenMonth = getMonthNumber(splitdate[1]);
        int givenYear = Integer.valueOf(splitdate[2]);

        int forwardTaps = 0;
        int backwardTaps = 0;
        int yearFactor = 0;

        if (givenYear == thisYear)
        {
            if (givenMonth >= thisMonth)
            {
                forwardTaps = givenMonth - thisMonth;
            } else {
                backwardTaps = thisMonth - givenMonth;
            }
        }
        else if (givenYear > thisYear)
        {
            yearFactor = (givenYear - thisYear) * 12;
            if (givenMonth >= thisMonth)
            {
                forwardTaps = yearFactor + (givenMonth - thisMonth);
            } else {
                forwardTaps = yearFactor - (thisMonth - givenMonth);
            }
        }
        else {
            yearFactor = (thisYear - givenYear) * 12;
            if (givenMonth >= thisMonth)
            {
                backwardTaps = yearFactor - (givenMonth - thisMonth);
            } else {
                backwardTaps = yearFactor + (thisMonth - givenMonth);
            }
        }


        for (int i=1; i<=forwardTaps; i++) {
            driver.findElement(By.id("com.cheaptickets:id/next_month")).click();

    }


}*/

