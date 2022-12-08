package com.ebay.www.steps;

import com.ebay.www.models.EsperaExplicita;
import com.ebay.www.pageObjects.ModuloCategoriaTecnologiaPages;
import net.thucydides.core.annotations.Step;


public class ModuloCategoriaTecnologiaStep {

    ModuloCategoriaTecnologiaPages moduloCategoriaTecnologiaPages = new ModuloCategoriaTecnologiaPages();
    EsperaExplicita esperaExplicita = new EsperaExplicita();

    @Step
    public void clickModuloTelefonos(){
        esperaExplicita.esperaExplicitaTexto(moduloCategoriaTecnologiaPages.getDriver(), moduloCategoriaTecnologiaPages.getLblTecnologia());
        moduloCategoriaTecnologiaPages.getDriver().findElement(moduloCategoriaTecnologiaPages.getBtnCategoriaTelefonos()).click();
    }

    @Step
    public void clickIphone(){
        moduloCategoriaTecnologiaPages.getDriver().findElement(moduloCategoriaTecnologiaPages.getBtnIphone()).click();
    }
}
