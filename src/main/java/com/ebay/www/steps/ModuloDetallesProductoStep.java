package com.ebay.www.steps;

import com.ebay.www.models.EsperaExplicita;
import com.ebay.www.pageObjects.ModuloDetallesProductoPages;
import net.thucydides.core.annotations.Step;


public class ModuloDetallesProductoStep {

    ModuloDetallesProductoPages moduloDetallesProductoPages = new ModuloDetallesProductoPages();
    EsperaExplicita esperaExplicita = new EsperaExplicita();

    @Step
    public void clickAgregarCarritoCompras(){
        moduloDetallesProductoPages.getDriver().findElement(moduloDetallesProductoPages.getBtnAgregarCarritoCompras()).click();
    }
}
