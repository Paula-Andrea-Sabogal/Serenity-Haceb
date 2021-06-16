package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import driver.SeleniumWebDriver;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.BuscarProductoEnHaceb;
import uInterfase.HacebUserInterface;

import java.io.IOException;

public class HacebBuscadorStepDefinitions {

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^me encuentro en la pagina de Haceb con la url (.*)$")
    public void meEncuentroEnLaPaginaDeHacebConLaUrlHttpsHacebComCo(String Url) {
        OnStage.theActorCalled("Paula").can(BrowseTheWeb.with(SeleniumWebDriver.ChromeWebDriver().on(Url)));

    }

    @When("^busco el producto (.*) en el buscador$")
    public void buscoElProductoLavadoraDigitalAtlasKgPanelTraseroONIXEnElBuscador(String producto) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoEnHaceb.on(producto));

    }

    @Then("^podre ver el producto (.*) en la pantalla$")
    public void podreVerElProductoLavadoraDigitalAtlasKgPanelTraseroONIXEnLaPantalla(String producto) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(HacebUserInterface.LBL_PRODUCTO_HACEB.of(producto)),
                WebElementStateMatchers.containsText(producto)));

    }


}


