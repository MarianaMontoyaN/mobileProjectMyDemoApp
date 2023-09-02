package com.mydemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.mydemo.ui.CheckoutView.btnPlaceOrder;

public class Checkout implements Task {

    public static Checkout order(){
        return Tasks.instrumented(Checkout.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(btnPlaceOrder)
        );
    }
}
