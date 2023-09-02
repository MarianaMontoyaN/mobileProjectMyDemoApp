package com.mydemo.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ShippingInformationView extends PageObject {
    public static final Target txtFullName = Target.the("fullName")
            .located(AppiumBy.accessibilityId("Full Name* input field"));

    public static final Target txtAddress1 = Target.the("adressLine1")
            .located(AppiumBy.accessibilityId("Address Line 1* input field"));

    public static final Target txtCity = Target.the("city")
            .located(AppiumBy.accessibilityId("City* input field"));

    public static final Target txtZipCode = Target.the("zipCode")
            .located(AppiumBy.accessibilityId("Zip Code* input field"));

    public static final Target txtCountry = Target.the("country")
            .located(AppiumBy.accessibilityId("Country* input field"));

    public static final Target btnToPayment = Target.the("buttom to payment")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"To Payment button\"]/android.widget.TextView"));
}
