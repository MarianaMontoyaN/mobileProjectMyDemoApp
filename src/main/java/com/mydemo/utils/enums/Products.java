package com.mydemo.utils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Products {
    SAUCE_LABS_BACKPACK("Sauce Labs Backpack", "1"),
    SAUCE_LABS_BIKE_LIGHT("Sauce Labs Bike Light", "2"),
    SAUCE_LABS_BOLT_TSHIRT("Sauce Labs Bolt T-Shirt", "3"),
    SAUCE_LABS_FIEECE("Sauce Labs Fleece Jacket", "4"),
    SAUCE_LABS_ONESLE("Sauce Labs Onesle", "5"),
    TESTALLTHETHINGS_TSHIRT("Test.allTheThings() T-Shirt", "6");

    private final String name;
    private final String index;
}
