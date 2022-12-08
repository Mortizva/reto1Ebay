package com.ebay.www.steps;

import com.ebay.www.models.EsperaExplicita;
import com.ebay.www.pageObjects.ModuloIphonePages;
import net.thucydides.core.annotations.Step;

public class ModuloIphoneStep {

    ModuloIphonePages moduloIphonePages = new ModuloIphonePages();
    EsperaExplicita esperaExplicita = new EsperaExplicita();

    @Step
    public void clickProductoIphone(){
        esperaExplicita.esperaExplicitaTexto(moduloIphonePages.getDriver(), moduloIphonePages.getLblAppleIphone());
        moduloIphonePages.getDriver().findElement(moduloIphonePages.getBtnProductoIphone()).click();
    }
}
