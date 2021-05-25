package com.crowdar.examples.steps;
import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.CheapFlight;
import com.crowdar.examples.pages.CheapHome;
import com.crowdar.examples.pages.CheapResult;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;

import java.io.IOException;
import java.text.ParseException;

public class CheapTicketsSteps extends PageSteps {


    @Given("el usuario se encuentra en el home de la app cheaptickets")
    public void elUsuarioSeEncuentraEnElHomeDeLaAppCheaptickets() {
        //CheapTicketsService.isViewLoaded();
        Injector._page(CheapHome.class).clickAccep();
        Injector._page(CheapHome.class).isHome();
    }

    @When("selecciono la opcion Flights")
    public void seleccionoLaOpcionFlights() {
        Injector._page(CheapHome.class).clickButtonFlights();
        //CheapTicketsService.clickbuttonFlight();
    }

    @And("selecciono el from '(.*)' , to '(.*)', fecha de ida '(.*)' regreso '(.*)',cantidad de adultos'(.*)',chicos'(.*)' y tipo servicio '(.*)'")
    public void completoCamposRequeridos(String ida, String vuelta, String fida, String fvuelta, Integer adults, Integer chicos, Integer tipo) throws IOException, ParseException {
        Injector._page(CheapFlight.class).completFromAndTo(ida, vuelta);
        Injector._page(CheapFlight.class).setDates(fida, fvuelta);
        Injector._page(CheapFlight.class).setTraveler(adults, chicos);
        Injector._page(CheapFlight.class).setPreferenseClass(tipo);
    }

    @And("clickeo en el boton search")
    public void clickeoEnElBotonSearch() {
        Injector._page(CheapFlight.class).clickButtonSearch();

    }

    @And("selecciono un elemento de la lista")
    public void seleccionoUnElementoDeLaLista() {
        Injector._page(CheapFlight.class).selectListFlight();
    }

    @Then("compruebo la reserva de ese vuelo")
    public void comprueboLaReservaDeEseVuelo() {
        Injector._page(CheapResult.class).confirmaReserva();
        Injector._page(CheapResult.class).compruebaReserva();
    }


}
