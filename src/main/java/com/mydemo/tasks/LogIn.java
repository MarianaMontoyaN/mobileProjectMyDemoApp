package com.mydemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.mydemo.ui.LogInView.btnLogIn;
import static com.mydemo.ui.LogInView.txtPassword;
import static com.mydemo.ui.LogInView.txtUsername;

public class LogIn implements Task {

    private String username;
    private String password;
    public LogIn(String username, String password){
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(txtUsername),
                Enter.theValue(password).into(txtPassword),
                Click.on(btnLogIn)
        );
    }
}
