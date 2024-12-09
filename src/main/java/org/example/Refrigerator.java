package org.example;

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
//        String firstIngredientName = ingredientList.get(0).getName(); // milk
//        String secondIngredientName = ingredientList.get(1).getName(); // egg
//        String thirdIngredientName = ingredientList.get(2).getName(); // oil

        for(Ingredient ingredient : ingredientList) {
            System.out.println("checking: " + ingredient);
            if (ingredient.getName().equals(ingredientName)) {
                System.out.println("Yes! " + ingredientName + " is available");
            } else {
                System.out.println("No! " + ingredientName + " is NOT available");
            }
        }
//
//        if (firstIngredientName.equals(ingredientName)) {
//            System.out.println("Yes! " + firstIngredientName + " is available");
//        } else if (secondIngredientName.equals(ingredientName)) {
//            System.out.println("Yes! " + secondIngredientName + " is available");
//        } else if (thirdIngredientName.equals(ingredientName)) {
//            System.out.println("Yes! " + thirdIngredientName + " is available");
//        } else {
//            System.out.println("No! " + ingredientName + " is NOT available");
//        }
        System.out.println("Ended function checking if " + ingredientName + " is available");
        System.out.println();
    }
}
