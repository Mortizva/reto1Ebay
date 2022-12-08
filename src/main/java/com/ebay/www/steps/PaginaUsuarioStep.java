package com.ebay.www.steps;

import com.ebay.www.models.Excel;
import com.ebay.www.pageObjects.PaginaUsuarioPages;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class PaginaUsuarioStep {

    PaginaUsuarioPages paginaUsuarioPages = new PaginaUsuarioPages();
    Excel excel = new Excel();

    @Step
    public void clickNombreUsuario(){
        paginaUsuarioPages.getDriver().findElement(paginaUsuarioPages.getBtnNombreUsuario()).click();
    }
    @Step
    public String getTextElement(WebDriver driver) {
        return driver.findElement(paginaUsuarioPages.getLblNombreUsuario()).getText();
    }

    @Step
    public void validacion(String texto) {
        assertEquals(getTextElement(paginaUsuarioPages.getDriver()), texto);
    }

    @Step
    public void validacionPrueba() throws IOException {
        validacion(excel.leerDatosExcel("Datos.xlsx", "Validaciones",1,0));
    }

    @Step
    public void validacionNombreUsuario(){
        Assert.assertThat(paginaUsuarioPages.getDriver().findElement(paginaUsuarioPages.
                getLblNombreUsuario()).isDisplayed(), Matchers.is(true));

    }

    @Step
    public void clickCategoria(){
        paginaUsuarioPages.getDriver().findElement(paginaUsuarioPages.getBtnCategoriaTecnologia()).click();
    }

}
