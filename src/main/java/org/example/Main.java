package org.example;

import java.util.ArrayList;
import java.util.List;

// klasa Main
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello in Refrigerator App");

        Ingredient milk = new Ingredient("milk", 500);
        Ingredient egg = new Ingredient("egg", 12);
//        Ingredient oil = new Ingredient("oil", 100);

        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(milk);
        ingredients.add(egg);
//        ingredients.add(oil);

        Refrigerator refrigerator = new Refrigerator(ingredients);

        // funkcja
        refrigerator.isIngredientAvailable("oil");
        refrigerator.isIngredientAvailable("milk");
        refrigerator.isIngredientAvailable("egg");

        List<Ingredient> ingredientList = refrigerator.getIngredientList();
        System.out.println(ingredientList);

        System.out.println("Bye Bye");
    }
}