package com.mydemo.tasks;

import com.mydemo.utils.enums.Products;
import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.util.ArrayList;
import java.util.List;

import static com.mydemo.ui.ProductDetailView.BTN_ADD_TO_CART;
import static com.mydemo.ui.ProductDetailView.SCROLL_BTN_ADD_TO_CART;
import static com.mydemo.ui.ProductsView.PRODUCT;
import static com.mydemo.utils.Utility.transformToEnumName;

public class AddProduct implements Task {

     private List<String> items = new ArrayList<>();
    public AddProduct(List<String> items){
        this.items = items;
    }

    public static AddProduct toShoppingCart(List<String> items) {
        return Tasks.instrumented(AddProduct.class, items);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        items.forEach(x -> {
            BrowseTheWeb.as(actor).find(String.format(PRODUCT, Products.valueOf(transformToEnumName(x)).getIndex())).click();
            BrowseTheWeb.as(actor).getDriver().findElement(AppiumBy.androidUIAutomator(SCROLL_BTN_ADD_TO_CART));
            BrowseTheWeb.as(actor).find(BTN_ADD_TO_CART).click();
            BrowseTheWeb.as(actor).getDriver().navigate().back();
        });
    }
}
