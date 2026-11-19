package com.saucedemo.stepdefinitions;

import com.saucedemo.questions.MensajeConfirmacion;
import com.saucedemo.tasks.AgregarProductos;
import com.saucedemo.tasks.CompletarCompra;
import com.saucedemo.tasks.IniciarSesion;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

public class CompraStepDefinitions {

    @Before
    public void configurarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario navega a la página de inicio de SauceDemo")
    public void navegarInicio() {
        OnStage.theActorCalled("Comprador").wasAbleTo(
                Open.browserOn().thePageNamed("webdriver.base.url")
        );
    }

    @Cuando("inicia sesión con el usuario {string} y contraseña {string}")
    public void iniciarSesion(String usuario, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IniciarSesion.conCredenciales(usuario, password)
        );
    }

    @Y("agrega dos productos al carrito y visualiza el detalle del carrito")
    public void agregarProductosYVerCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarProductos.alCarritoYVisualizar()
        );
    }

    @Y("completa el formulario de compra con nombre {string}, apellido {string} y código postal {string}")
    public void completarFormularioCompra(String nombre, String apellido, String codigoPostal) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CompletarCompra.conDatos(nombre, apellido, codigoPostal)
        );
    }

    @Entonces("debería visualizar el mensaje de confirmación {string}")
    public void verificarConfirmacion(String mensajeEsperado) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(MensajeConfirmacion.obtenido()).containsIgnoringCase(mensajeEsperado)
        );
    }
}