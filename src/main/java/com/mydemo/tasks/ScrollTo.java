package com.mydemo.tasks;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.sql.DriverManager;
import java.time.Duration;
import java.util.Collections;

public class ScrollTo{

    public void ScrollTo(){

    }
//        Dimension size = BrowseTheWeb.as(actor).getDriver().manage().window().getSize();
//        int startY = (int) (size.height * 0.70);
//        int endY = (int) (size.height * 0.30);
//        int centerX = size.width / 2;
//        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");
//        Sequence swipe = new Sequence(finger, 1);
//        swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), centerX, startY));
//        swipe.addAction(finger.createPointerDown(0));
//        swipe.addAction(finger.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(), centerX, endY));
//        swipe.addAction(finger.createPointerUp(0));

    private static void performScroll() {
        Dimension size = DriverManager.getDriver().manage().window().getSize();
        int startX = size.getWidth() / 2;
        int endX = size.getWidth() / 2;
        int startY = size.getHeight() / 2;
        int endY = (int) (size.getHeight() * 0.25);

        performScrollUsingSequence(startX, startY, endX, endY);
    }

    private static void performScrollUsingSequence(int startX, int startY, int endX, int endY) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "first-finger");
        Sequence sequence = new Sequence(finger, 0)
                .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(finger.createPointerMove(Duration.ofMillis(300), PointerInput.Origin.viewport(), endX, endY))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        ((AppiumDriver)(DriverManager.getDriver())).perform(Collections.singletonList(sequence));
    }
}

