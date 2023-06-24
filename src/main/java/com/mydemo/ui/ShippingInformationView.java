package com.mydemo.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ShippingInformationView {
    public static Target txtFullName = Target.the("fullName")
            .located(AppiumBy.accessibilityId("Full Name* input field"));

    public static Target txtAddress1 = Target.the("adressLine1")
            .located(AppiumBy.accessibilityId("Address Line 1* input field"));

    public static Target txtCity = Target.the("city")
            .located(AppiumBy.accessibilityId("City* input field"));

    public static Target txtZipCode1 = Target.the("zipCode")
            .located(AppiumBy.accessibilityId("Zip Code* input field"));

    public static Target txtZipCode = Target.the("zipCode")
            .located(By.xpath("//android.widget.EditText[@content-desc=\"Zip Code* input field\"]"));

    public static Target txtCountry = Target.the("country")
            .located(AppiumBy.accessibilityId("Country* input field"));

    public static Target btnToPayment = Target.the("buttom to payment")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"To Payment button\"]/android.widget.TextView"));

    public static Target lblZipCode = Target.the("label Zip code")
            .located(By.xpath("//android.widget.ScrollView[@content-desc=\"checkout address screen\"]/android.view.ViewGroup/android.widget.TextView[6]"));

    public static Target title = Target.the("title")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"container header\"]/android.widget.TextView"));

    //public static String SCROLL_ZIP_CODE = "new UiScrollable(new UiSelector()).scrollIntoView(textContains(\"City\"));";
    public static String SCROLL_ZIP_CODE = "new UiScrollable(new    UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(textContains(\"Zip Code\"))";
}
