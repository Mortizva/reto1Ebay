package com.ebay.www.pageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ModuloIphonePages extends PageObject {

    By lblAppleIphone = By.xpath("//h1[@class='title-banner__title']");
    By btnProductoIphone = By.xpath("//a/div[.='Apple iPhone 11 Pro Max']");

    public By getLblAppleIphone() {
        return lblAppleIphone;
    }

    public By getBtnProductoIphone() {
        return btnProductoIphone;
    }
}
