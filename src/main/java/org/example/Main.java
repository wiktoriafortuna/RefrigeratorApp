package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello in Refrigerator App");

        Ingredient milk = new Ingredient("milk", 500);
        Ingredient egg = new Ingredient("egg", 12);

//        // here we create collection List of Ingredients
        List<Ingredient> ingredients = new ArrayList<>();
//        // here we add milk with 500 ml
        ingredients.add(milk);
//        // here we add 12 eggs
        ingredients.add(egg);


        // here we create lodówka
        Refrigerator refrigerator = new Refrigerator(ingredients);

        // here we print ingredients from lodówka
        List<Ingredient> ingredientList = refrigerator.getIngredientList();
        System.out.println(ingredientList);

        System.out.println("Bye Bye");
    }
}