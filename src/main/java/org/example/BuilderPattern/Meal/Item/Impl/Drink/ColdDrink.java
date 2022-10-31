package org.example.BuilderPattern.Meal.Item.Impl.Drink;

import org.example.BuilderPattern.Meal.Item.MealItem;
import org.example.BuilderPattern.Meal.Packing.Impl.Bottle;
import org.example.BuilderPattern.Meal.Packing.MealPacking;

public class ColdDrink extends MealItem {
    public ColdDrink(double cost, String name) {
        super(cost, name, new Bottle());
    }
}
