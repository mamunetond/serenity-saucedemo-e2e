package com.saucedemo.tasks;

import com.saucedemo.ui.CartPage;
import com.saucedemo.ui.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CompletarCompra implements Task {

    private final String nombre;
    private final String apellido;
    private final String codigoPostal;

    public CompletarCompra(String nombre, String apellido, String codigoPostal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoPostal = codigoPostal;
    }

    public static CompletarCompra conDatos(String nombre, String apellido, String codigoPostal) {
        return Tasks.instrumented(CompletarCompra.class, nombre, apellido, codigoPostal);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CartPage.CHECKOUT_BUTTON),
                Enter.theValue(nombre).into(CheckoutPage.FIRST_NAME_FIELD),
                Enter.theValue(apellido).into(CheckoutPage.LAST_NAME_FIELD),
                Enter.theValue(codigoPostal).into(CheckoutPage.POSTAL_CODE_FIELD),
                Click.on(CheckoutPage.CONTINUE_BUTTON),
                Click.on(CheckoutPage.FINISH_BUTTON)
        );
    }
}