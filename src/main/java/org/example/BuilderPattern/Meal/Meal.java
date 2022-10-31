package org.example.BuilderPattern.Meal;

import org.example.BuilderPattern.Meal.Item.MealItem;

import java.util.ArrayList;

public class Meal {
    private final ArrayList<MealItem> items = new ArrayList<>();
    private double cost = 0;

    public void addItem(MealItem item) {
        cost += item.getCost();
        items.add(item);
    }

    public double getCost() {
        return cost;
    }

    public void showItems() {
        for (MealItem item : items) {
            System.out.println(item);
        }
    }
}
