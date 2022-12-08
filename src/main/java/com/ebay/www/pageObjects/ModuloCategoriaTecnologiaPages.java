package com.ebay.www.pageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ModuloCategoriaTecnologiaPages extends PageObject {

    By lblTecnologia = By.xpath("//h1[@class='title-banner__title']");
    By btnCategoriaTelefonos = By.xpath("(//span[@class=\"b-accordion-text\"])[2]");
    By btnIphone = By.xpath("//a[.='iPhone']");

    public By getLblTecnologia() {
        return lblTecnologia;
    }

    public By getBtnCategoriaTelefonos() {
        return btnCategoriaTelefonos;
    }

    public By getBtnIphone() {
        return btnIphone;
    }
}
