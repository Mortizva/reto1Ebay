package com.ebay.www.steps;

import com.ebay.www.models.EsperaExplicita;
import com.ebay.www.pageObjects.PaginaPrincipalPages;
import net.thucydides.core.annotations.Step;

public class PaginaPrincipalStep {

    PaginaPrincipalPages paginaPrincipalPages = new PaginaPrincipalPages();
    EsperaExplicita esperaExplicita = new EsperaExplicita();
    @Step
    public void abrirNavegador(){
        paginaPrincipalPages.open();
    }

    @Step
    public void clickInicioSesion(){
        esperaExplicita.esperaExplicitaClick(paginaPrincipalPages.getDriver(), paginaPrincipalPages.getBtnInicioSesion());
        paginaPrincipalPages.getDriver().findElement(paginaPrincipalPages.getBtnInicioSesion()).click();
    }
}
