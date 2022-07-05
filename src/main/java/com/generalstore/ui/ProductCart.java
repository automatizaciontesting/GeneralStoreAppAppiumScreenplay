package com.generalstore.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProductCart extends PageObject {

    public static final Target BTN_VISIT_WESITE = Target.the("Button cart")
            .located(By.xpath("//*[@text='Visit to the website to complete purchase']"));
}
