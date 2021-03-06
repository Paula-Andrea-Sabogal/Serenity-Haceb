package interaction;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import uInterfase.HacebUserInterface;
import variablesGlobales.VariablesGlobales;

import java.util.List;
import java.util.Random;

public class ClickProductoAleatorio implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        Random random = new Random();
        List<WebElementFacade> listaBotonesProductos = HacebUserInterface.BTN_PRODUCTO_ALEATORIO_HACEB.resolveAllFor(actor);
        //List<WebElementFacade> listaNombresProductos = HacebUserInterface.LBL_NOMBRE_PRODUCTO_ALEATORIO_HACEB.resolveAllFor(actor);


        int numeroAleatorio = random.nextInt(listaBotonesProductos.size() );
        System.out.println(numeroAleatorio);
        VariablesGlobales.nombreProductoAleatorio = listaBotonesProductos.get(numeroAleatorio).getText();
        System.out.println(VariablesGlobales.nombreProductoAleatorio);
        listaBotonesProductos.get(numeroAleatorio).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

            //TODO Auto -generated catch block
            e.printStackTrace();

        }

    }
    public static Performable on() {
        return Instrumented.instanceOf(ClickProductoAleatorio.class).withProperties();
    }
}
