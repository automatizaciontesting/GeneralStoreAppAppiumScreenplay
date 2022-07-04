package com.generalstore.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/buyProducts.feature",
        glue = "com.generalstore.stepsdefinition",
        snippets = CAMELCASE,
        tags= "")
public class BuyProductsRunner {
}
