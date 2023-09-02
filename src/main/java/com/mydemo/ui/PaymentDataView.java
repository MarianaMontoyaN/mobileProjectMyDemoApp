package com.mydemo.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaymentDataView extends PageObject {
    public static final Target txtFullName = Target.the("Full name payment data")
            .located(AppiumBy.accessibilityId("Full Name* input field"));

    public static final Target txtcardNumber = Target.the("Card number payment data")
            .located(AppiumBy.accessibilityId("Card Number* input field"));

    public static final Target txtExpirationDate = Target.the("Expiration date")
            .located(AppiumBy.accessibilityId("Expiration Date* input field"));

    public static final Target txtSecurityCode = Target.the("Security code")
            .located(AppiumBy.accessibilityId("Security Code* input field"));

    public static final Target btnRevieworder = Target.the("Review order")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"Review Order button\"]/android.widget.TextView"));

}
