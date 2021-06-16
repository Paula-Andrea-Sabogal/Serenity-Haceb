package tasks;

import interaction.Esperar;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import uInterfase.HacebUserInterface;
import variablesGlobales.VariablesGlobales;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

    public class BuscarProductoEnHaceb implements Task {
        private String producto;

        public BuscarProductoEnHaceb(String producto) {
            this.producto = producto;
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Enter.theValue(producto).into(HacebUserInterface.TXT_BUSCADOR_HACEB),
                    Click.on(HacebUserInterface.BTN_BUSCADOR_HACEB),
                    //WaitUntil.the(HacebUserInterface.BTN_BUSCADOR_HACEB.of(producto),isVisible()),
                    Esperar.estosSegundos(30),
                    Click.on(HacebUserInterface.BTN_PRODUCTO_HACEB.of(producto))
            );
            VariablesGlobales.nombreProductoAleatorio = HacebUserInterface.LBL_PRODUCTO_HACEB.of(producto).resolveFor(actor).getText();
        }

        public static BuscarProductoEnHaceb on(String producto) {
            return Instrumented.instanceOf(BuscarProductoEnHaceb.class).withProperties(producto);
        }
}
