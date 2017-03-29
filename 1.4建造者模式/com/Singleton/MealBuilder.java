package com.Singleton;

import Business.ChickenBurger;
import Business.Coke;
import Business.Pepsi;
import Business.VegBurger;

/**
 * Created by S.H.I.E.L.D on 2017/3/28 0028.
 */
public class MealBuilder {
    public  Meal prepareVegMeal(){
        Meal meal=new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal=new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
