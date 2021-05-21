package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.CheapConstants;
import com.crowdar.examples.constants.CheapFlightConstants;

import java.util.List;

public class CheapFlightService extends MobileActionManager {

    public static void completFromAndTo(String origen,String destino){
        click(CheapFlightConstants.FROM_INPUT_LOCATOR);
        setInput(CheapFlightConstants.FROM_INPUT_LOCATOR,origen);
        click(CheapFlightConstants.TO_INPUT_LOCATOR);
        setInput(CheapFlightConstants.TO_INPUT_LOCATOR,destino);

    }

    public static void setDates(String ida,String vuelta){
        getText(CheapFlightConstants.MOUNTH_TEXT_LOCATOR);
        click(CheapFlightConstants.DATES_CALENDAR_LOCATOR);
        setInput(CheapFlightConstants.FROM_INPUT_LOCATOR,ida);
        click(CheapFlightConstants.DATES_CALENDAR_LOCATOR);
        setInput(CheapFlightConstants.FROM_INPUT_LOCATOR,vuelta);

    }

    public static void clickButtonDone(){
        click(CheapFlightConstants.DONEC_BUTTON_LOCATOR);
    }


    public static void clickButtonSearch(){
        click(CheapFlightConstants.SEARCH_BUTTON_LOCATOR);
    }
}
