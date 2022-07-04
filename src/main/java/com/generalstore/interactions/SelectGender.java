package com.generalstore.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.generalstore.ui.HomeStore.RDB_FEMALE;

public class SelectGender implements Task {
    public static SelectGender femaleOrMale() {
        return Tasks.instrumented(SelectGender.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RDB_FEMALE)
        );
    }
}
