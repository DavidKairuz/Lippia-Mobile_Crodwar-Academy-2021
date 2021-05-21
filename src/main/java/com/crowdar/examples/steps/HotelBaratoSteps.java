package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.HomeService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelBaratoSteps extends PageSteps {


    @Given("el usuario se encunetra en en el inicio de la app Hotel Barato")
    public void elUsuarioSeEncunetraEnEnElInicioDeLaAppHotelBarato() {
    }

    @When("Seleccionamos un destino{string}")
    public void seleccionamosUnDestinoDestino() {
    }

    @And("seleccionamos la fecha de ida {string} y vuelta {string}")
    public void seleccionamosLaFechaDeIdaIdaYVueltaVuelta() {
    }

    @And("seleccionamos  numero de habitaciones {string} adultos {string}, menores {string} ,edad del menor{string}")
    public void seleccionamosNumeroDeHabitacionesAdultosAdultosMenoresMenorEdadDelMenorEdad() {
    }

    @And("cliackea en el boton Buscar")
    public void cliackeaEnElBotonBuscar() {
    }

    @Then("se muestran los resultados de la busqueda")
    public void seMuestranLosResultadosDeLaBusqueda() {
    }
}
