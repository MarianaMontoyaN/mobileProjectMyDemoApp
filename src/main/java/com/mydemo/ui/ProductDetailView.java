package com.mydemo.ui;

public class ProductDetailView {
    public static String BTN_ADD_TO_CART = "//android.view.ViewGroup[@content-desc=\"Add To Cart button\"]";
    public static String SCROLL_BTN_ADD_TO_CART = "new UiScrollable(new UiSelector()).scrollIntoView(text" +
            "(\"Add To Cart\"));";
}
