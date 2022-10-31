package org.example.BuilderPattern.Meal;

import org.example.BuilderPattern.Meal.Item.Impl.Burger.ChickenBurger;
import org.example.BuilderPattern.Meal.Item.Impl.Burger.VegBurger;
import org.example.BuilderPattern.Meal.Item.Impl.Drink.Coke;
import org.example.BuilderPattern.Meal.Item.Impl.Drink.Pepsi;
import org.example.BuilderPattern.Meal.Item.MealItem;

import java.util.ArrayList;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
