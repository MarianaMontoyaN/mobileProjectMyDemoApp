package com.mydemo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/itemsPurchase.feature",
        glue = {"com.mydemo.steps"})
public class itemsPurchaseRunner {
}
