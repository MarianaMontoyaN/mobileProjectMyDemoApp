package com.mydemo.steps;

import com.mydemo.questions.GetMessage;
import com.mydemo.tasks.AddProduct;
import com.mydemo.tasks.Checkout;
import com.mydemo.tasks.LogIn;
import com.mydemo.tasks.NavigateTo;
import com.mydemo.tasks.SendData;
import com.mydemo.tasks.SendInformation;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static com.mydemo.utils.enums.Credential.RIGHT_CREDENTIALS;
import static com.mydemo.utils.enums.Messages.SUCCESSFUL_PURCHASE_MESSAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class ItemsPurchaseStep {

    @Managed(driver = "appium")
    public WebDriver driver;

    private final Actor buyer = Actor.named("The buyer");

    @Before
    public void setTheStage() {OnStage.setTheStage(new OnlineCast());}

    @Before
    public void setUp() {buyer.can(BrowseTheWeb.with(driver));}

    @Given("a user is logged in")
    public void logIn() {
        buyer.wasAbleTo(NavigateTo.logIn(),
                LogIn.withCredentials(RIGHT_CREDENTIALS.getUsername(), RIGHT_CREDENTIALS.getPassword()));
    }
    @When("the user select the items")
    public void addToShoppingCart(DataTable items) {
        buyer.attemptsTo(AddProduct.toShoppingCart(items.asList(String.class)));
    }

    @And("make the payment")
    public void makeThePayment() {
        buyer.attemptsTo(NavigateTo.checkout(),
                SendInformation.shipping(),
                SendData.payment(),
                Checkout.order());
    }

    @Then("the purchase is successful")
    public void verifyPurchase() {
        buyer.should(seeThat(GetMessage.successful(), equalTo(SUCCESSFUL_PURCHASE_MESSAGE.getMessage())));
    }
}
