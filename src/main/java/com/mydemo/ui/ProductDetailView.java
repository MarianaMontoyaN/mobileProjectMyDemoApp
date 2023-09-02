package com.mydemo.ui;

import net.thucydides.core.pages.PageObject;

public class ProductDetailView extends PageObject {
    public static final String BTN_ADD_TO_CART = "//android.view.ViewGroup[@content-desc=\"Add To Cart button\"]";
    public static final String SCROLL_BTN_ADD_TO_CART = "new UiScrollable(new UiSelector()).scrollIntoView(text" +
            "(\"Add To Cart\"));";
}
