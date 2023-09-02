package com.mydemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LateralMenuView extends PageObject {
    public static final Target btnLogIn = Target.the("logIn").located(
            By.xpath("(//android.view.ViewGroup[@content-desc=\"store item\"])[3]/android.view.ViewGroup/android.widget.ImageView"));
}
