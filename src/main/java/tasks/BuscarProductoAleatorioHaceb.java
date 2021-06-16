package tasks;

import interaction.ClickProductoAleatorio;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import uInterfase.HacebUserInterface;

public class BuscarProductoAleatorioHaceb implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HacebUserInterface.BTN_CATEGORIA_HACEB),
                ClickProductoAleatorio.on()

        );
    }

    public static BuscarProductoAleatorioHaceb on() {
        return Instrumented.instanceOf(BuscarProductoAleatorioHaceb.class).withProperties();
    }
}
