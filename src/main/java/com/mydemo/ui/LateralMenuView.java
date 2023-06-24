package com.mydemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LateralMenuView {
    public static Target btnLogIn = Target.the("logIn").located(
            By.xpath("(//android.view.ViewGroup[@content-desc=\"store item\"])[3]/android.view.ViewGroup/android.widget.ImageView"));
}
