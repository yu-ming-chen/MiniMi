package com.n.minimi;

public class Item {

    private double value;
    public boolean isOwned = false;

    Item(double value) {
        this.value = value;
    }

    double getValue() {
        return this.value;
    }
}


