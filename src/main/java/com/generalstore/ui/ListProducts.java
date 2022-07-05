package com.generalstore.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ListProducts extends PageObject {

    public static final Target ICO_CART = Target.the("Icon cart")
            .located(By.xpath("//*[@resource-id='com.androidsample.generalstore:id/appbar_btn_cart']"));
}
