package com.generalstore.questions;

import com.generalstore.utils.SelectedItems;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import java.util.Iterator;

public class CheckTotalThe implements Question<Boolean> {

    SelectedItems selItem = new SelectedItems();

    public static CheckTotalThe amountInCart() {
        return new CheckTotalThe();
    }
    @Step("{0} validate visible cost item'")
    @Override
    public Boolean answeredBy(Actor actor) {
        Target LBL_PRODUCT_NAME = null;

        Iterator<String> iterate = selItem.getAmountTotal().iterator();
        while(iterate.hasNext()){
            String StrPrice = iterate.next();
            LBL_PRODUCT_NAME=Target.the("Submit button").located(By.xpath("//*[@resource-id='com.androidsample.generalstore:id/productPrice' and @text='"+StrPrice+"']"));
            LBL_PRODUCT_NAME.resolveFor(actor).isVisible();
        }

        return LBL_PRODUCT_NAME.resolveFor(actor).isVisible();
    }
}
