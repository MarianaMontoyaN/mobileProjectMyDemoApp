package com.mydemo.steps;

import com.mydemo.tasks.AddProduct;
import com.mydemo.tasks.LogIn;
import com.mydemo.tasks.NavigateTo;
import com.mydemo.tasks.SendShippingInformation;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import com.mydemo.tasks.SendPaymentData;

import static com.mydemo.utils.enums.Credential.RIGHT_CREDENTIALS;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ItemsPurchaseStep {

    @Managed(driver = "appium")
    public WebDriver driver;

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("a user is logged in")
    public void aUserIsLoggedIn() {
        theActorCalled("user").wasAbleTo(NavigateTo.logIn());
        theActorCalled("user").wasAbleTo(new LogIn(RIGHT_CREDENTIALS.getUsername(), RIGHT_CREDENTIALS.getPassword()));
    }
    @When("the user select the items")
    public void theUserSelectTheItems(DataTable items) {
        theActorCalled("user").attemptsTo(new AddProduct(items.asList(String.class)));
    }

    @And("make the payment")
    public void makeThePayment() {
        theActorCalled("user").attemptsTo(NavigateTo.checkout());
        theActorCalled("user").attemptsTo(new SendShippingInformation());
        theActorCalled("user").attemptsTo(new SendPaymentData());
    }
    /*
    @Then("the purchase is successful")
    public void thePurchaseIsSuccessful() {
    }
    */
}
