package com.generalstore.utils;

import java.util.*;

public class SelectedItems {

    private static List<String> totalProducs = new ArrayList<>();
    private static List<String> amountTotal = new ArrayList<>();

    public void setTotalProducts(List<String> itemsProducts) {
        this.totalProducs.addAll(itemsProducts);
    }
    public List<String> getTotalProducts() {
        return totalProducs;
    }

    public void setAmountTotal(List<String> itemsProducts) {
        this.amountTotal.addAll(itemsProducts);
    }
    public List<String> getAmountTotal() {
        return amountTotal;
    }
}
