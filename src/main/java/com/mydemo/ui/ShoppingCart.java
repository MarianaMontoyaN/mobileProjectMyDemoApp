package com.mydemo.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCart {
    public static Target btnCheckout = Target.the("lateralMenu").located(By.xpath(
            "//android.view.ViewGroup[@content-desc=\"Proceed To Checkout button\"]/android.widget.TextView"));

}
