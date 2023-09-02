package com.mydemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.mydemo.ui.ShippingInformationView.btnToPayment;
import static com.mydemo.ui.ShippingInformationView.txtAddress1;
import static com.mydemo.ui.ShippingInformationView.txtCity;
import static com.mydemo.ui.ShippingInformationView.txtCountry;
import static com.mydemo.ui.ShippingInformationView.txtFullName;
import static com.mydemo.ui.ShippingInformationView.txtZipCode;

public class SendInformation implements Task {

    public static SendInformation shipping() {
        return Tasks.instrumented(SendInformation.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue("Maria").into(txtFullName),
                Enter.theValue("calle 44").into(txtAddress1),
                Enter.theValue("Medellin").into(txtCity),
                Enter.theValue("12345").into(txtZipCode),
                Enter.theValue("Colombia").into(txtCountry),
                Click.on(btnToPayment)
        );
    }
}
