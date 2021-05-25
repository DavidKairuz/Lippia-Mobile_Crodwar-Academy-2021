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

    public void iteraClick(Integer n, String xpt) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                clickElement(MobileBy.xpath(xpt));
            }
        }

    }


    public String getDay(String sday) {
        String day = "";
        switch (sday) {
            case "01":
                day = "Monday";
                break;
            case "02":
                day = "Thuesday";
                break;
            case "03":
                day = "Wednesday";
                break;
            case "04":
                day = "Thursday";
                break;
            case "05":
                day = "Friday";
                break;
            case "06":
                day = "Saturday";
                break;
            case "07":
                day = "Sunday";
                break;


        }
        return day;

    }
}

    // Pass monthName param as "August"
   /* public int getMonthNumber(String monthName) throws ParseException {
        Date date = new SimpleDateFormat("MMMM").parse(monthName);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        return calendar.get(Calendar.MONTH) + 1;
    }*/

  /*  public String getDateComplet(String date1) throws ParseException {
        String result = "";
        Date date = new SimpleDateFormat("EEE,MMM d", Locale.getDefault()).parse(date1);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return result;
    }*/

    // Pass date param as "Sun, Jul 1"
   /* public String getMonthNameInThreeChars(String date) {
        return date.substring(5, 8);
    }*/

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

