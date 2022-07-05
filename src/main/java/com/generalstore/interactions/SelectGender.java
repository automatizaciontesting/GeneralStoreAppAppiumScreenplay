package com.generalstore.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;

import static com.generalstore.ui.HomeStore.RDB_FEMALE;
import static com.generalstore.ui.HomeStore.RDB_MALE;

public class SelectGender implements Task {

    private String selectGender;
    public SelectGender(String selectGender){
        this.selectGender = selectGender;
    }
    public static SelectGender femaleOrMale(String selectGender) {
        return Tasks.instrumented(SelectGender.class,selectGender);
    }

    @Step("{0} select gender ")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(this.selectGender.equalsIgnoreCase("Male")).andIfSo(
                        Click.on(RDB_MALE)).otherwise(Click.on(RDB_FEMALE))

        );
    }
}
