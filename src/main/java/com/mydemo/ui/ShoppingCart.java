package com.mydemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ShoppingCart extends PageObject {
    public static final Target btnCheckout = Target.the("lateralMenu").located(By.xpath(
            "//android.view.ViewGroup[@content-desc=\"Proceed To Checkout button\"]/android.widget.TextView"));
}
