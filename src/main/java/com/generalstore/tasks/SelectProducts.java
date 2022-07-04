package com.generalstore.tasks;

import com.generalstore.utils.SelectedItems;
import com.generalstore.utils.Helpers;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import io.appium.java_client.MobileBy;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.*;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class SelectProducts implements Task {
    List<Map<String, String>> datosFeature;
    SelectedItems selItem = new SelectedItems();
    private List<String> productValues = new ArrayList<>();
    Helpers help = new Helpers();
    private List<String> productPrice = new ArrayList<>();

    public SelectProducts(DataTable dataTable){
        datosFeature = dataTable.asMaps(String.class, String.class);
    }

    public static SelectProducts itemsAddToCard(DataTable dataTable) {
        return Tasks.instrumented(SelectProducts.class,dataTable);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        for (Map<String, String> data : datosFeature) {
            String nameProduct = data.get("Product");
            Target addCardProduct = Target.the("Submit button").located(By.xpath("//*[@text='" + data.get("Product") + "']/following-sibling::android.widget.LinearLayout//android.widget.TextView[@text='ADD TO CART']"));
            Target productCost = Target.the("Submit button").located(By.xpath("//*[@text='" + data.get("Product") + "']/following-sibling::android.widget.LinearLayout//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productPrice']"));
            productValues.add(nameProduct);

            BrowseTheWeb.as(actor).getDriver().findElement(
                    MobileBy.
                            AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                                    ".scrollIntoView(new UiSelector().text(\"" + data.get("Product") + "\"))")).isEnabled();

            help.delayElement(3);
            productPrice.add(productCost.resolveFor(actor).getText());
            actor.attemptsTo(
                    WaitUntil.the(addCardProduct, isCurrentlyEnabled()).forNoMoreThan(20).seconds(),
                    Click.on(addCardProduct)
            );

        }
        selItem.setTotalProducts(productValues);
        selItem.setAmountTotal(productPrice);

    }
}
