package com.mydemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.mydemo.ui.CheckoutCompleteView.txtSuccessfulMessage;

public class GetMessage implements Question<String> {

    public static GetMessage successful(){
        return new GetMessage();
    }

    @Override
    public String answeredBy(Actor actor) {
        return txtSuccessfulMessage.resolveFor(actor).getText();
    }
}
