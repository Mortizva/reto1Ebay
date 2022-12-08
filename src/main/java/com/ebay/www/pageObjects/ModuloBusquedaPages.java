package com.ebay.www.pageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ModuloBusquedaPages extends PageObject {

    By btnBalon = By.xpath("(//a[@class='s-item__link'])[2]");

    public By getBtnBalon() {
        return btnBalon;
    }
}
