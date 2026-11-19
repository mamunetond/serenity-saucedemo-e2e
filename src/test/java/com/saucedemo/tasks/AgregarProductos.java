package com.saucedemo.tasks;

import com.saucedemo.ui.InventoryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AgregarProductos implements Task {

    public static AgregarProductos alCarritoYVisualizar() {
        return Tasks.instrumented(AgregarProductos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InventoryPage.ADD_BACKPACK_BUTTON),
                Click.on(InventoryPage.ADD_BIKE_LIGHT_BUTTON),
                Click.on(InventoryPage.SHOPPING_CART_LINK)
        );
    }
}