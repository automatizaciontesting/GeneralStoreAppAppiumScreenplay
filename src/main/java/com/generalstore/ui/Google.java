package com.generalstore.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Google extends PageObject{
    public Google(){}

    public static final Target EJEMPLO = Target.the("Textbox word to search")
            .located(By.xpath("//*[@text='Buscar con Google']/following-sibling::android.view.View/android.widget.EditText"));

}
