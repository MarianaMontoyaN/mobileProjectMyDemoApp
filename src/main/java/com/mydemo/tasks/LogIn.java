package com.mydemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.mydemo.ui.LogInView.btnLogIn;
import static com.mydemo.ui.LogInView.txtPassword;
import static com.mydemo.ui.LogInView.txtUsername;

public class LogIn implements Task {

    private final String username;
    private final String password;

    public LogIn(String username, String password){
        this.username = username;
        this.password = password;
    }

    public static LogIn withCredentials(String username, String password) {
        return Tasks.instrumented(LogIn.class, username, password);
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
