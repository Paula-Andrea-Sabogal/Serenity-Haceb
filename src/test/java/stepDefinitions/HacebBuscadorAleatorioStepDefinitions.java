package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.BuscarProductoAleatorioHaceb;

public class HacebBuscadorAleatorioStepDefinitions {
    @Before
    public void before() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^busco un producto aleatorio en la pagina$")
    public void buscoUnProductoAleatorioEnLaPagina() {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoAleatorioHaceb.on());

    }

    @Then("^podre ver un producto aleatorio en pantalla$")
    public void podreVerUnProductoAleatorioEnPantalla() {

    }
}
