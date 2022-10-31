package org.example.BuilderPattern.Meal.Packing;

public class MealPacking {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MealPacking(String name) {
        this.name = name;
    }
}
