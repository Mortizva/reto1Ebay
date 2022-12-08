package com.ebay.www.steps;

import com.ebay.www.models.EsperaExplicita;
import com.ebay.www.models.Excel;
import com.ebay.www.pageObjects.PaginaInicioSesionPages;
import net.thucydides.core.annotations.Step;

import java.io.IOException;

public class PaginaInicioSesionStep{

    PaginaInicioSesionPages paginaInicioSesionPages = new PaginaInicioSesionPages();
    Excel excel = new Excel();
    EsperaExplicita esperaExplicita = new EsperaExplicita();
    @Step
    public void escribirEmail() throws IOException {
        esperaExplicita.esperaExplicitaTexto(paginaInicioSesionPages.getDriver(), paginaInicioSesionPages.getLblHola());
        paginaInicioSesionPages.getDriver().findElement(paginaInicioSesionPages.getTxtEmail())
                .sendKeys(excel.leerDatosExcel("Datos.xlsx", "Credenciales", 1,0));
    }

    @Step
    public void clickContinuar(){
        paginaInicioSesionPages.getDriver().findElement(paginaInicioSesionPages.getBtnContinuar()).click();

    }

    @Step
    public void escribirClave() throws IOException {
        esperaExplicita.esperaExplicitaTexto(paginaInicioSesionPages.getDriver(), paginaInicioSesionPages.getLblBienvenido());
        paginaInicioSesionPages.getDriver().findElement(paginaInicioSesionPages.getTxtClave())
                .sendKeys(excel.leerDatosExcel("Datos.xlsx", "Credenciales", 1,1));
    }

    @Step
    public void clickInicioSesion(){
        paginaInicioSesionPages.getDriver().findElement(paginaInicioSesionPages.getBtnInicioSesion()).click();
    }
    @Step
    public void inicioSesion() throws IOException {
        escribirEmail();
        clickContinuar();
        escribirClave();
        clickInicioSesion();
/*        try {
            Thread.sleep(3000000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
    }
}
