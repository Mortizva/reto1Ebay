package com.ebay.www.steps;

import com.ebay.www.pageObjects.ModuloBusquedaPages;
import net.thucydides.core.annotations.Step;


import java.util.ArrayList;

public class ModuloBusquedaStep {

    ModuloBusquedaPages moduloBusquedaPages = new ModuloBusquedaPages();

//    @Step
//    public void clickBalon(){
//        moduloBusquedaPages.getDriver().findElement(moduloBusquedaPages.getBtnBalon()).click();
//    }

    @Step
    public void clickBalon() {
        moduloBusquedaPages.getDriver().findElement(moduloBusquedaPages.getBtnBalon()).click();
        String ventana = moduloBusquedaPages.getDriver().getWindowHandle();
        ArrayList<String> pestana = new ArrayList<String>(moduloBusquedaPages.getDriver().getWindowHandles());
        System.out.println(pestana.size());
        moduloBusquedaPages.getDriver().switchTo().window(pestana.get(1));
    }
}
