package com.generalstore.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomeStore extends PageObject {

    public static final Target CMD_COUNTRY = Target.the("Listview country")
            .located(By.xpath("//*[@resource-id='com.androidsample.generalstore:id/spinnerCountry']"));
    public static final Target TXT_NAME = Target.the("Textbox name")
            .located(By.xpath("//*[@resource-id='com.androidsample.generalstore:id/nameField']"));
    public static final Target RDB_MALE = Target.the("Radiobutton male")
            .located(By.xpath("//*[@resource-id='com.androidsample.generalstore:id/radioMale']"));
    public static final Target RDB_FEMALE = Target.the("Radiobutton female")
            .located(By.xpath("//*[@resource-id='com.androidsample.generalstore:id/radioFemale']"));
    public static final Target BTN_LETSSHOP = Target.the("Button lets shop")
            .located(By.xpath("//*[@resource-id='com.androidsample.generalstore:id/btnLetsShop']"));

}
