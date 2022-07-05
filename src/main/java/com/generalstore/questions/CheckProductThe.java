package com.generalstore.questions;

import com.generalstore.utils.SelectedItems;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CheckProductThe implements Question<List<String>> {

    SelectedItems selItem = new SelectedItems();
    private static List<String> addItemValidate = new ArrayList<>();

    public static CheckProductThe productInCart() {
        return new CheckProductThe();
    }

    @Step("{0} validate visible name product'")
    @Override
    public List<String> answeredBy(Actor actor) {

        Iterator<String> iterate = selItem.getTotalProducts().iterator();

        while(iterate.hasNext()){
            String strItem = iterate.next();
            WebElementFacade submitButton = BrowseTheWeb.as(actor).find(By.xpath("//*[@resource-id='com.androidsample.generalstore:id/productName' and @text='"+strItem+"']"));
            if(submitButton.isVisible()){
                addItemValidate.add("true");
            }else{
                addItemValidate.add("false");
            }
        }
        return addItemValidate;
    }

}
