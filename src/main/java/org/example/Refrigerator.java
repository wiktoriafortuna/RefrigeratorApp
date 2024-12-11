package org.example;

import java.util.ArrayList;
import java.util.List;

// klasa Refrigerator
public class Refrigerator {
    List<Ingredient> ingredientList;

    public Refrigerator(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }
//     remove ingredient , add ingredient, check if is ingredient, = metody

    @Override
    public String toString() {
        return "Refrigerator{" +
                "ingredientList=" + ingredientList +
                '}';
    }

    public void isIngredientAvailable(String ingredientName) {
        System.out.println();
        System.out.println("Stared function checking if " + ingredientName + " is available");
        List<String> ingredientNames = new ArrayList<>();
        for (Ingredient ingredient : ingredientList) {
            ingredientNames.add(ingredient.getName());
        }
        if (ingredientNames.contains(ingredientName)) {
            System.out.println("Yes! " + ingredientName + " is available");
        } else {
            System.out.println("No! " + ingredientName + " is available");
        }
        System.out.println("Ended function checking if " + ingredientName + " is available");
        System.out.println();
    }
}
