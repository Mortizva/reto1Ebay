package com.ebay.www.pageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaUsuarioPages extends PageObject {

    By btnNombreUsuario = By.id("gh-ug");
    By lblNombreUsuario = By.xpath("//b[.='miguel']");

    By btnCategoriaTecnologia = By.xpath("//li/a[@_sp='p2481888.m1379.l3250']");

    public By getLblNombreUsuario() {
        return lblNombreUsuario;
    }

    public By getBtnCategoriaTecnologia() {
        return btnCategoriaTecnologia;
    }

    public By getBtnNombreUsuario() {
        return btnNombreUsuario;
    }
}
