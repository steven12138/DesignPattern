package org.example.BuilderPattern;

import org.example.BuilderPattern.Meal.Meal;
import org.example.BuilderPattern.Meal.MealBuilder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        vegMeal.showItems();
        System.out.println("cost: " + vegMeal.getCost());

        nonVegMeal.showItems();
        System.out.println("cost: " + nonVegMeal.getCost());
    }
}
