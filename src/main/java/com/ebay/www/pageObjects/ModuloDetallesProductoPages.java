package com.ebay.www.pageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ModuloDetallesProductoPages extends PageObject {


    By btnAgregarCarritoCompras = By.xpath("//span/span[.='Agregar al carro de compras']");



    public By getBtnAgregarCarritoCompras() {
        return btnAgregarCarritoCompras;
    }
}
