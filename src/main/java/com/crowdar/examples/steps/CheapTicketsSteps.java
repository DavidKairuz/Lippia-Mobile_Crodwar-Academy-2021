package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.CheapHome;
import com.crowdar.examples.services.CheapFlightService;
import com.crowdar.examples.services.CheapTicketsService;
import com.crowdar.examples.services.HomeService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheapTicketsSteps extends PageSteps {


    @Given("el usuario se encuentra en el home de la app cheaptickets")
    public void elUsuarioSeEncuentraEnElHomeDeLaAppCheaptickets() {

        //CheapTicketsService.isViewLoaded();
       Injector._page(CheapHome.class).isHome();
    }

    @When("selecciono la opcion Flights")
    public void seleccionoLaOpcionFlights() {
        Injector._page(CheapHome.class).clickButtonFlights();
        //CheapTicketsService.clickbuttonFlight();
    }

    @And("selecciono el from '(.*)' , to '(.*)', fecha de ida '(.*)' regreso '(.*)',cantidad de adultos'(.*)',chicos'(.*)' y tipo servicio '(.*)'")
    public void completoCamposRequeridos() {
      //  CheapFlightService.completFromAndTo( origin,destino);//origen y destino

       // CheapFlightService.clickButtonDone();//cierre
    }

    @And("clickeo en el boton search")
    public void clickeoEnElBotonSearch() {

        //CheapFlightService.clickButtonSearch();
    }

    @And("selecciono un elemento de la lista")
    public void seleccionoUnElementoDeLaLista() {
    }

    @Then("compruebo la reserva de ese vuelo")
    public void comprueboLaReservaDeEseVuelo() {
    }


}
