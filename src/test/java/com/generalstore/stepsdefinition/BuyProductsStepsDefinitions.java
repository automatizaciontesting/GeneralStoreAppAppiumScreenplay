package com.generalstore.stepsdefinition;

import com.generalstore.interactions.Navigate;
import com.generalstore.questions.CheckProductThe;
import com.generalstore.questions.CheckTotalThe;
import com.generalstore.tasks.LoadHome;
import com.generalstore.tasks.ProductGoto;
import com.generalstore.tasks.SelectProducts;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;

public class BuyProductsStepsDefinitions {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} has a list of producto")
    public void aListOfProductoDisplayed(String actor,DataTable dataTable) {
        OnStage.theActorCalled(actor).
                attemptsTo(LoadHome.listCountries(dataTable)
                );
    }
    @When("select the products and add to cart")
    public void selectTheProductsAndAddToCart(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SelectProducts.itemsAddToCard(dataTable),
                ProductGoto.cart()
        );

    }
    @Then("validate the products")
    public void validateTheProducts() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(CheckProductThe.productInCart(), not(hasItem("false")))
        );
    }

    @Then("total amount in the cart")
    public void totalAmountInTheCart() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(CheckTotalThe.amountInCart(), not(hasItem("false")))
        );
    }

    @Then("navigate on webview")
    public void navigateOnWebview() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Navigate.inGoogle()
        );
    }


}
