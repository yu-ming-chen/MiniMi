package com.n.minimi;

import java.util.List;
import java.util.ArrayList;
public class User {

    private double Height;
    private double Weight;
    public double coins = 0;
    private Shop shop;
    public Pet pet;
    private List<Item> shopItems = new ArrayList<>();

    private double calories(double Height, double Weight){
        return 66.5 + 13.8 * Weight + 5 * Height;
    }

    User(double Height, double Weight){
        this.Height = Height;
        this.Weight = Weight;
        this.pet = new Pet(calories(Height,Weight));
        //this.shop = new Shop(shopItems);
    }
}
