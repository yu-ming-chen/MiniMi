package com.n.minimi;

public class Food {

    private double calories;
    private String dish;

    Food(String dish, double calories){
        this.calories = calories;
        this.dish = dish;
    }

    public double getCal(){
        return this.calories;
    }
    public String getNameOfFood(){
        return this.dish;
    }
}