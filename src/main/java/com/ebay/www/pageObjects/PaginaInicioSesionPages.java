package com.ebay.www.pageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicioSesionPages extends PageObject {

    By lblHola = By.id("greeting-msg");
    By txtEmail = By.id("userid");
    By btnContinuar = By.id("signin-continue-btn");
    By lblBienvenido = By.id("welcome-msg");
    By txtClave = By.id("pass");
    By btnInicioSesion = By.id("sgnBt");

    public By getLblHola() {
        return lblHola;
    }

    public By getTxtEmail() {
        return txtEmail;
    }

    public By getBtnContinuar() {
        return btnContinuar;
    }

    public By getLblBienvenido() {
        return lblBienvenido;
    }

    public By getTxtClave() {
        return txtClave;
    }

    public By getBtnInicioSesion() {
        return btnInicioSesion;
    }
}
