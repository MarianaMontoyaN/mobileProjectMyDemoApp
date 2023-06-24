package com.mydemo.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogInView {
    public static Target txtUsername = Target.the("username").located(By.xpath("//android.widget.EditText[@content-desc=\"Username input field\"]\n"));
    public static Target txtPassword = Target.the("password").located(AppiumBy.accessibilityId("Password input field"));
    public static Target btnLogIn = Target.the("btnLogIn").located(AppiumBy.accessibilityId("Login button"));
}
