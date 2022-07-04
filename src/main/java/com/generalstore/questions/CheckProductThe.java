package com.generalstore.questions;

import com.generalstore.utils.SelectedItems;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CheckProductThe implements Question<Boolean> {

    SelectedItems selItem = new SelectedItems();
    private static Map<String, List<String>> totalItems = new HashMap<>();

    public static CheckProductThe productcInCart() {
        return new CheckProductThe();
    }

    @Step("{0} validate visible name product'")
    @Override
    public Boolean answeredBy(Actor actor) {
        Target LBL_PRODUCT_NAME = null;

        Iterator<String> iterate = selItem.getTotalProducts().iterator();
        while(iterate.hasNext()){
            String strItem = iterate.next();
            LBL_PRODUCT_NAME=Target.the("Submit button").located(By.xpath("//*[@resource-id='com.androidsample.generalstore:id/productName' and @text='"+strItem+"']"));
            LBL_PRODUCT_NAME.resolveFor(actor).isVisible();
        }

        return LBL_PRODUCT_NAME.resolveFor(actor).isVisible();
    }
}
