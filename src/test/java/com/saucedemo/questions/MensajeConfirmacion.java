package com.saucedemo.questions;

import com.saucedemo.ui.CheckoutPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class MensajeConfirmacion {
    public static Question<String> obtenido() {
        return Text.of(CheckoutPage.CONFIRMATION_HEADER).asString();
    }
}