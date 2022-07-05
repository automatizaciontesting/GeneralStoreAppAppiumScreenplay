package com.generalstore.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static com.generalstore.ui.HomeStore.TXT_NAME;

public class AddName implements Task {
    private String nameUser;
    public AddName(String nameUser){
        this.nameUser=nameUser;
    }
    public static AddName firstName(String nameUser) {
        return Tasks.instrumented(AddName.class,nameUser);
    }

    @Step("{0} Add name")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(this.nameUser).into(TXT_NAME)
        );
    }
}
