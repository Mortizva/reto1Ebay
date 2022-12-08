package com.ebay.www.steps;

import com.ebay.www.models.EsperaExplicita;
import com.ebay.www.models.Excel;
import com.ebay.www.pageObjects.ModuloCarritoComprasPages;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.Keys;


import java.io.IOException;

public class ModuloCarritoComprasStep {

    ModuloCarritoComprasPages moduloCarritoComprasPages = new ModuloCarritoComprasPages();
    EsperaExplicita esperaExplicita = new EsperaExplicita();
    Excel excel = new Excel();

    @Step
    public void validarPrimerProducto(){
            Assert.assertThat(moduloCarritoComprasPages.getDriver().findElement(moduloCarritoComprasPages.
                    getLblArticulos1()).isDisplayed(), Matchers.is(true));


    }
    @Step
    public void validarSegundoProducto(){
        Assert.assertThat(moduloCarritoComprasPages.getDriver().findElement(moduloCarritoComprasPages.
                getLblArticulos2()).isDisplayed(), Matchers.is(true));


    }

    @Step
    public void escribirProducto() throws IOException {
        esperaExplicita.esperaExplicitaTexto(moduloCarritoComprasPages.getDriver(), moduloCarritoComprasPages.getLblCarroCompras());
        moduloCarritoComprasPages.getDriver().findElement(moduloCarritoComprasPages.getTxtBarraBusqueda())
                .sendKeys(excel.leerDatosExcel("Datos.xlsx", "Productos", 1,0), Keys.ENTER);
    }
}
