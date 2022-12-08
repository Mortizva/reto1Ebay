package com.ebay.www.stepDefinitions;

import com.ebay.www.steps.PaginaInicioSesionStep;
import com.ebay.www.steps.PaginaPrincipalStep;
import com.ebay.www.steps.PaginaUsuarioStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class Loginstepdefinition {

    @Steps
    PaginaPrincipalStep paginaPrincipalStep;
    @Steps
    PaginaInicioSesionStep paginaInicioSesionStep;
    @Steps
    PaginaUsuarioStep paginaUsuarioStep;
    @Dado("^que el usuario se encuentre en la pagina principal de ebay$")
    public void queElUsuarioSeEncuentreEnLaPaginaPrincipalDeEbay() {
        paginaPrincipalStep.abrirNavegador();
    }


    @Cuando("^ingrese sus credenciales$")
    public void ingreseSusCredenciales() throws IOException {
        paginaPrincipalStep.clickInicioSesion();
        paginaInicioSesionStep.inicioSesion();
        //paginaUsuarioStep.clickNombreUsuario();
    }

    @Entonces("^el usuario visualiza su nombre$")
    public void elUsuarioVisualizaSuNombre() throws IOException {
        paginaUsuarioStep.validacionNombreUsuario();
    }
}
