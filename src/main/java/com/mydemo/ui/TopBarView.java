package com.mydemo.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TopBarView extends PageObject {
    public static final Target btnLateralMenu = Target.the("lateralMenu")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"open menu\"]/android.widget.ImageView"));

    public static final Target btnShoppingCart = Target.the("shoppingCart")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"cart badge\"]/android.widget.ImageView"));
}
