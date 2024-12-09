package org.example;

import java.util.Arrays;

public class Refrigerator {
//    List<Ingredient> ingredientList;
    Ingredient[] ingredients;

//    public Refrigerator(List<Ingredient> ingredientList) {
//        this.ingredientList = ingredientList;
//    }

    public Refrigerator(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

//    public List<Ingredient> getIngredientList() {
//        return ingredientList;
//    }

    public Ingredient[] getIngredientsArray() {
        return ingredients;
    }

//    public void setIngredientList(List<Ingredient> ingredientList) {
//        this.ingredientList = ingredientList;
//    }
//     remove ingredient , add ingredient, check if is ingredient, = metody


//    @Override
//    public String toString() {
//        return "Refrigerator{" +
//                "ingredientList=" + ingredientList +
//                '}';
//    }


    @Override
    public String toString() {
        return "Refrigerator{" +
                "ingredients=" + Arrays.toString(ingredients) +
                '}';
    }
}
