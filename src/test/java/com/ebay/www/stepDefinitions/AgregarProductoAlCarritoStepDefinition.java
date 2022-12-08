package com.ebay.www.stepDefinitions;

import com.ebay.www.steps.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class AgregarProductoAlCarritoStepDefinition {

    @Steps
    PaginaUsuarioStep paginaUsuarioStep;
    @Steps
    ModuloCategoriaTecnologiaStep moduloCategoriaTecnologiaStep;
    @Steps
    ModuloIphoneStep moduloIphoneStep;
    @Steps
    ModuloIphone11ProMaxStep moduloIphone11ProMaxStep;
    @Steps
    ModuloDetallesProductoStep moduloDetallesProductoStep;
    @Steps
    ModuloCarritoComprasStep moduloCarritoComprasStep;
    @Steps
    ModuloBusquedaStep moduloBusquedaStep;
    @Cuando("^el usuario seleccione un producto de una categoria para agregarlo al carrito de compras$")
    public void elUsuarioSeleccioneUnProductoDeUnaCategoriaParaAgregarloAlCarritoDeCompras() {
       paginaUsuarioStep.clickCategoria();
       moduloCategoriaTecnologiaStep.clickModuloTelefonos();
       moduloCategoriaTecnologiaStep.clickIphone();
       moduloIphoneStep.clickProductoIphone();
       moduloIphone11ProMaxStep.clickIphone11ProMax();
       moduloDetallesProductoStep.clickAgregarCarritoCompras();
       moduloCarritoComprasStep.validarPrimerProducto();
    }


    @Cuando("^el usuario ingresa el producto a buscar para agregarlo al carrito de compras$")
    public void elUsuarioIngresaElProductoABuscarParaAgregarloAlCarritoDeCompras() throws IOException  {
        moduloCarritoComprasStep.escribirProducto();
        moduloBusquedaStep.clickBalon();
        moduloDetallesProductoStep.clickAgregarCarritoCompras();

    }

    @Entonces("^el usuario visualiza los productos seleccionados en el carrito de compras$")
    public void elUsuarioVisualizaLosProductosSeleccionadosEnElCarritoDeCompras(){
        moduloCarritoComprasStep.validarSegundoProducto();

    }
}
