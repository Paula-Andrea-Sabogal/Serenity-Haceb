package uInterfase;

import net.serenitybdd.screenplay.targets.Target;

public class HacebUserInterface {
    public static final  Target TXT_BUSCADOR_HACEB= Target.the("").locatedBy("//input[@id='full-search']");
    public static final  Target BTN_BUSCADOR_HACEB = Target.the("").locatedBy("//button[@class='btn btn-search']");
    public static final Target LBL_RESULTADO_HACEB = Target.the("").locatedBy("//span[contains(text(),'{0}')]");
    public static final  Target BTN_PRODUCTO_HACEB = Target.the("").locatedBy("//div[contains(@data-name,'{0}')]//span[contains(text(),'Ver producto')]");
    public static final Target LBL_PRODUCTO_HACEB = Target.the("").locatedBy("//div[contains(@class,'column')]//h1[contains(text(),'{0}')]");
    public static final Target BTN_CATEGORIA_HACEB = Target.the("").locatedBy("//a[contains(text(),'Cargadores de carro')]");
    public static final Target BTN_PRODUCTO_ALEATORIO_HACEB = Target.the("").locatedBy("//h4[contains(@class,'shelve__name')]");
}
