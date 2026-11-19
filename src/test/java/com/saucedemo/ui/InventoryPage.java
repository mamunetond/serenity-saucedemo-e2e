package com.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InventoryPage {
    public static final Target ADD_BACKPACK_BUTTON = Target.the("botón agregar Sauce Labs Backpack")
            .located(By.id("add-to-cart-sauce-labs-backpack"));
    public static final Target ADD_BIKE_LIGHT_BUTTON = Target.the("botón agregar Sauce Labs Bike Light")
            .located(By.id("add-to-cart-sauce-labs-bike-light"));
    public static final Target SHOPPING_CART_LINK = Target.the("ícono del carrito de compras")
            .located(By.className("shopping_cart_link"));
}