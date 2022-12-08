package com.ebay.www.pageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ModuloCarritoComprasPages extends PageObject {

    By txtBarraBusqueda = By.id("gh-ac");
    By lblCarroCompras = By.xpath("//h1[@class='main-title font-title-1']");
    By lblArticulos1 = By.xpath("//span/span[.='Apple iPhone 11 Pro Max - 64/256/512GB Desbloqueado Buen Estado Todos Colores']");
    By lblArticulos2 = By.xpath("(//div[@class='cart-summary-line-item'])[1]");

    public By getTxtBarraBusqueda() {
        return txtBarraBusqueda;
    }

    public By getLblArticulos1() {
        return lblArticulos1;
    }

    public By getLblCarroCompras() {
        return lblCarroCompras;
    }

    public By getLblArticulos2() {
        return lblArticulos2;
    }
}
