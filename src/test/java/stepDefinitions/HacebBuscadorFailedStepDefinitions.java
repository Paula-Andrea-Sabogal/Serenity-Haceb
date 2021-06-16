package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modelos.Productos;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.BuscarProductoEnHaceb;
import uInterfase.HacebUserInterface;
import variablesGlobales.VariablesGlobales;

import java.io.IOException;
import java.util.List;

public class HacebBuscadorFailedStepDefinitions {
    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @When("^busco el producto en el buscador$")
    public void buscoElProductoEnElBuscador(List<Productos> productos) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoEnHaceb.on(productos.get(0).getNombreProducto()));

    }

    @Then("^puedo validar el producto buscado en pantalla$")
    public void puedoValidarElProductoBuscadoEnPantalla() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                WebElementQuestion
                        .the(HacebUserInterface.LBL_PRODUCTO_HACEB.of(VariablesGlobales.nombreProductoAleatorio)),
                WebElementStateMatchers.containsText(VariablesGlobales.nombreProductoAleatorio)));

    }
}
