package com.generalstore.interactions;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;


public class SearchListView implements Interaction {

    private String countryName;
    public SearchListView(String countryName){
        this.countryName=countryName;
    }

    public static SearchListView country(String countryName) {
        return Tasks.instrumented(SearchListView.class, countryName);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().findElement(
                MobileBy.
                        AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" +
                                this.countryName +"\"))")).click();

    }
}
