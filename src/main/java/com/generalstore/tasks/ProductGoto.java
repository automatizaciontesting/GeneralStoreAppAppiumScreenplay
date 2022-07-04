package com.generalstore.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.generalstore.ui.ListProducts.ICO_CART;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class ProductGoto implements Task {
    public static ProductGoto cart() {
        return Tasks.instrumented(ProductGoto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               WaitUntil.the(ICO_CART,isCurrentlyEnabled()).forNoMoreThan(15).seconds(),
               Click.on(ICO_CART)
       );
    }
}
