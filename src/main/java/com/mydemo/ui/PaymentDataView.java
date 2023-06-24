package com.mydemo.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentDataView {
    public static Target txtFullName = Target.the("Full name payment data")
            .located(AppiumBy.accessibilityId("Full Name* input field"));

    public static Target txtcardNumber = Target.the("Card number payment data")
            .located(AppiumBy.accessibilityId("Card Number* input field"));

    public static Target txtExpirationDate = Target.the("Expiration date")
            .located(AppiumBy.accessibilityId("Expiration Date* input field"));

    public static Target txtSecurityCode = Target.the("Security code")
            .located(AppiumBy.accessibilityId("Security Code* input field"));

    public static Target btnRevieworder = Target.the("Review order")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"Review Order button\"]/android.widget.TextView"));

}
