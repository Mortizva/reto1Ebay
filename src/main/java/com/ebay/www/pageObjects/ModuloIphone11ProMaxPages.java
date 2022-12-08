package com.ebay.www.pageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ModuloIphone11ProMaxPages extends PageObject {

    By lblIphone11ProMax =By.xpath("//span[@class='b-pageheader__text']");
    By btnIphone11ProMax = By.xpath("//a/div/div[.='Apple iPhone 11 Pro Max - 64/256/512GB Desbloqueado Buen Estado Todos Colores']");

    public By getLblIphone11ProMax() {
        return lblIphone11ProMax;
    }

    public By getBtnIphone11ProMax() {
        return btnIphone11ProMax;
    }
}
