package com.mydemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckoutView extends PageObject {
    public static final Target btnPlaceOrder = Target.the("btn place order").located(
            By.xpath("//android.view.ViewGroup[@content-desc=\"Place Order button\"]/android.widget.TextView\n"));
}
