package com.mydemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import java.util.ArrayList;
import java.util.List;

import static com.mydemo.ui.LateralMenuView.btnLogIn;
import static com.mydemo.ui.ShoppingCart.btnCheckout;
import static com.mydemo.ui.TopBarView.btnLateralMenu;
import static com.mydemo.ui.TopBarView.btnShoppingCart;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavigateTo implements Task {

    static List<Target> path = new ArrayList<>();

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (Target target : path) {
            actor.attemptsTo(Click.on(target));
        }
        path.clear();
    }

    public static NavigateTo checkout() {
        path.add(btnShoppingCart);
        path.add(btnCheckout);
        return instrumented(NavigateTo.class, path);
    }

    public static NavigateTo logIn() {
        path.add(btnLateralMenu);
        path.add(btnLogIn);
        return instrumented(NavigateTo.class, path);
    }
}
