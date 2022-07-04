package com.generalstore.stepsdefinition;

import com.generalstore.interactions.AddName;
import com.generalstore.interactions.Navigate;
import com.generalstore.questions.CheckProductThe;
import com.generalstore.questions.CheckTotalThe;
import com.generalstore.tasks.LoadHome;
import com.generalstore.interactions.SelectGoShop;
import com.generalstore.interactions.SelectGender;
import com.generalstore.tasks.ProductGoto;
import com.generalstore.tasks.SelectProducts;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static org.hamcrest.Matchers.equalTo;

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
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CheckProductThe.productcInCart(),
                equalTo(true)
        ));
    }
    @Then("total amount in the cart")
    public void totalAmountInTheCart() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CheckTotalThe.amountInCart(),
                equalTo(true)
        ));
    }
    @Then("navigate on webview")
    public void navigateOnWebview() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Navigate.inGoogle()
        );
    }


}
