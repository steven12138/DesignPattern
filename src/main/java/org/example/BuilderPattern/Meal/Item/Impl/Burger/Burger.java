package org.example.BuilderPattern.Meal.Item.Impl.Burger;

import org.example.BuilderPattern.Meal.Item.MealItem;
import org.example.BuilderPattern.Meal.Packing.Impl.Wrapper;

public class Burger extends MealItem {
    public Burger(double cost, String name) {
        super(cost, name, new Wrapper());
    }
}
