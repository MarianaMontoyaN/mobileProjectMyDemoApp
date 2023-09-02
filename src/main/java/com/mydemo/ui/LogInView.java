package com.mydemo.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LogInView extends PageObject {
    public static final Target txtUsername = Target.the("username").located(By.xpath("//android.widget.EditText[@content-desc=\"Username input field\"]\n"));
    public static final Target txtPassword = Target.the("password").located(AppiumBy.accessibilityId("Password input field"));
    public static final Target btnLogIn = Target.the("btnLogIn").located(AppiumBy.accessibilityId("Login button"));
}
