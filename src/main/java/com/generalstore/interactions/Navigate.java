package com.generalstore.interactions;

import com.generalstore.utils.Helpers;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static com.generalstore.ui.Google.*;
import static com.generalstore.ui.ProductCart.BTN_VISIT_WESITE;


public class Navigate implements Task {

    Helpers help = new Helpers();
    public static Navigate inGoogle() {
        return Tasks.instrumented(Navigate.class);
    }

    @Step("{0} navigate on website")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_VISIT_WESITE),
                Enter.theValue("hervin").into(EJEMPLO)
        );
        help.delayElement(2);
        Serenity.takeScreenshot();
        help.delayElement(2);
        Serenity.getDriver().navigate().back();
        Serenity.takeScreenshot();
    }

}
