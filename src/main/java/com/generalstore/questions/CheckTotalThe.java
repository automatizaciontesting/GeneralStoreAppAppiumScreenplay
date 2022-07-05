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

public class CheckTotalThe implements Question<List<String>> {

    SelectedItems selItem = new SelectedItems();
    private static List<String> addAmount = new ArrayList<>();

    public static CheckTotalThe amountInCart() {
        return new CheckTotalThe();
    }
    @Step("{0} validate visible cost item'")
    @Override
    public List<String> answeredBy(Actor actor) {
        Iterator<String> iterate = selItem.getAmountTotal().iterator();
        while(iterate.hasNext()){
            String strItem = iterate.next();
            WebElementFacade visibleObject = BrowseTheWeb.as(actor).find(By.xpath("//*[@resource-id='com.androidsample.generalstore:id/productPrice' and @text='"+strItem+"']"));
            if(visibleObject.isVisible()){
                addAmount.add("true");
            }else{
                addAmount.add("false");
            }
        }
        return addAmount;
    }
}
