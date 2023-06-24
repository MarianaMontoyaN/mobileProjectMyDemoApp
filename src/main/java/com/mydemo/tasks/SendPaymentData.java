package com.mydemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.mydemo.ui.PaymentDataView.btnRevieworder;
import static com.mydemo.ui.PaymentDataView.txtExpirationDate;
import static com.mydemo.ui.PaymentDataView.txtFullName;
import static com.mydemo.ui.PaymentDataView.txtSecurityCode;
import static com.mydemo.ui.PaymentDataView.txtcardNumber;

public class SendPaymentData implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Mariana").into(txtFullName),
                Enter.theValue("154614567889256").into(txtcardNumber),
                Enter.theValue("20").into(txtExpirationDate),
                Enter.theValue("456").into(txtSecurityCode),
                Click.on(btnRevieworder)
        );
    }
}
