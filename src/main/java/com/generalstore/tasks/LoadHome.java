package com.generalstore.tasks;

import com.generalstore.interactions.AddName;
import com.generalstore.interactions.SearchListView;
import com.generalstore.interactions.SelectGender;
import com.generalstore.interactions.SelectGoShop;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static com.generalstore.ui.HomeStore.CMD_COUNTRY;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class LoadHome implements Task {
    List<Map<String, String>> datosFeature;
    private String nameCountry;
    private String nameUser;
    private String selectGender;

    public LoadHome(DataTable dataTable){
        datosFeature = dataTable.asMaps(String.class, String.class);
        this.nameCountry=datosFeature.get(0).get("Country");
        this.nameUser = datosFeature.get(0).get("Name");
        this.selectGender = datosFeature.get(0).get("Gender");
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(CMD_COUNTRY,isCurrentlyEnabled()).forNoMoreThan(15).seconds(),
                Click.on(CMD_COUNTRY),
                SearchListView.country(this.nameCountry),
                AddName.firstName(this.nameUser),
                SelectGender.femaleOrMale(this.selectGender),
                SelectGoShop.letsShop()
        );
    }

    public static LoadHome listCountries(DataTable dataTable){
        return instrumented(LoadHome.class,dataTable);
    }
}
