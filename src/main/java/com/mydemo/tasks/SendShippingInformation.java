package com.mydemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.mydemo.ui.ShippingInformationView.txtAddress1;
import static com.mydemo.ui.ShippingInformationView.txtCity;
import static com.mydemo.ui.ShippingInformationView.txtFullName;
import static com.mydemo.ui.ShippingInformationView.txtZipCode;

public class SendShippingInformation implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Maria").into(txtFullName),
                Enter.theValue("calle 44").into(txtAddress1),
                Enter.theValue("Medellin").into(txtCity)
                //Scroll.to(WatchedHistoryItem.HEADING)
                //Scroll.to(txtZipCode).andAlignToBottom(),
                //ScrollToPosition.to(new Point(0, 500))
                //Enter.theValue("1234").into(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"89750\"));")),
                Enter.theValue("12345").into(txtZipCode)
                //Enter.theValue("Colombia").into(txtCountry),
                //Click.on(btnToPayment)
        );
        //BrowseTheWeb.as(actor).getDriver().findElementByAndroidUIAutomator("new UiScrollable(new    UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"WebView\").instance(0))")
        //BrowseTheWeb.as(actor).getDriver().findElement(AppiumBy.androidUIAutomator(SCROLL_ZIP_CODE));
        //BrowseTheWeb.as(actor).withAction().moveToElement((WebElement) txtZipCode);
        //ScrollToPosition.to(txtZipCode).performAs(actor);
    }
}
