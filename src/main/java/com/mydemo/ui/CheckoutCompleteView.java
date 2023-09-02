package com.mydemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckoutCompleteView extends PageObject {
    public static final Target txtSuccessfulMessage = Target.the("successful message").located(
            By.xpath("//android.view.ViewGroup[@content-desc=\"checkout complete screen\"]/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[4]\n"));
}
