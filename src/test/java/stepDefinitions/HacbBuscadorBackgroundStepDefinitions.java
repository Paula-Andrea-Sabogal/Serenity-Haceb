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

import java.util.List;

public class HacbBuscadorBackgroundStepDefinitions {
    @Before
    public void before() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^busco un producto en el buscador$")

    public void buscoUnProductoEnElBuscador(List<Productos> productos) {

        OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoEnHaceb.on(productos.get(0).getNombreProducto()));
    }

    @Then("^podre ver el producto buscado en pantalla$")
    public void podreVerElProductoBuscadoEnPantalla() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                WebElementQuestion
                        .the(HacebUserInterface.LBL_PRODUCTO_HACEB.of(VariablesGlobales.nombreProductoAleatorio)),
                WebElementStateMatchers.containsText(VariablesGlobales.nombreProductoAleatorio)));

    }
}