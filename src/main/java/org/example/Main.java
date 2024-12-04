package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello in Refrigerator App");

        // here we will add our code
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient("milk", 500));
        ingredients.add(new Ingredient("egg", 12));

        List<Dish>dishList= new ArrayList<>();
        dishList.add(new Dish("pancakes",ingredients));
        Refrigerator refrigerator = new Refrigerator(ingredients);

        List<Ingredient> ingredientList = refrigerator.getIngredientList();
        System.out.println(ingredientList);

        System.out.println("Bye Bye");
    }
}