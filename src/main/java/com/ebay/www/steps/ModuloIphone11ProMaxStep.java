package com.ebay.www.steps;

import com.ebay.www.models.EsperaExplicita;
import com.ebay.www.pageObjects.ModuloIphone11ProMaxPages;
import net.thucydides.core.annotations.Step;

public class ModuloIphone11ProMaxStep {

    ModuloIphone11ProMaxPages moduloIphone11ProMaxPages = new ModuloIphone11ProMaxPages();
    EsperaExplicita esperaExplicita = new EsperaExplicita();

    @Step
    public void clickIphone11ProMax(){
        esperaExplicita.esperaExplicitaTexto(moduloIphone11ProMaxPages.getDriver(), moduloIphone11ProMaxPages.getLblIphone11ProMax());
        moduloIphone11ProMaxPages.getDriver().findElement(moduloIphone11ProMaxPages.getBtnIphone11ProMax()).click();
    }
}
