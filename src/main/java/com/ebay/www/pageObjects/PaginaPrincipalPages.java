package com.ebay.www.pageObjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.ebay.com/")
public class PaginaPrincipalPages extends PageObject {


    By btnInicioSesion = By.xpath("//a[@href='https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F']");

    public By getBtnInicioSesion() {
        return btnInicioSesion;
    }
}
