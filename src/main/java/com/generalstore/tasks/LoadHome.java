package com.generalstore.tasks;

import com.generalstore.interactions.AddName;
import com.generalstore.interactions.SearchListView;
import com.generalstore.interactions.SelectGender;
import com.generalstore.interactions.SelectGoShop;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.generalstore.ui.HomeStore.CMD_COUNTRY;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class LoadHome implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(CMD_COUNTRY,isCurrentlyEnabled()).forNoMoreThan(15).seconds(),
                Click.on(CMD_COUNTRY),
                SearchListView.country("Albania"),
                AddName.firstName(),
                SelectGender.femaleOrMale(),
                SelectGoShop.letsShop()
        );
    }

    public static LoadHome listCountries(){
        return instrumented(LoadHome.class);
    }
}
