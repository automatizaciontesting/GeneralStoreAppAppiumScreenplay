package com.generalstore.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static com.generalstore.ui.HomeStore.TXT_NAME;

public class AddName implements Task {
    public static AddName firstName() {
        return Tasks.instrumented(AddName.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Hervin").into(TXT_NAME)
        );
    }
}
