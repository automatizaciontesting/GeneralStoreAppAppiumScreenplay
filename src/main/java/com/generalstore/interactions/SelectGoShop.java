package com.generalstore.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static com.generalstore.ui.HomeStore.BTN_LETSSHOP;

public class SelectGoShop implements Task {
    public static SelectGoShop letsShop() {
        return Tasks.instrumented(SelectGoShop.class);
    }

    @Step("{0} goto lets shop ")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_LETSSHOP)
        );
    }
}
