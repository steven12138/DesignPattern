package org.example.BuilderPattern.Meal.Item;

import org.example.BuilderPattern.Meal.Packing.MealPacking;

public class MealItem {

    private double cost;
    private String name;
    private MealPacking packing;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MealPacking getPacking() {
        return packing;
    }

    public void setPacking(MealPacking packing) {
        this.packing = packing;
    }

    public MealItem(double cost, String name, MealPacking packing) {
        this.cost = cost;
        this.name = name;
        this.packing = packing;
    }

    @Override
    public String toString() {
        return "MealItem{" +
                "cost=" + cost +
                ", Name='" + name + '\'' +
                ", packing=" + packing.getName() +
                '}';
    }
}
