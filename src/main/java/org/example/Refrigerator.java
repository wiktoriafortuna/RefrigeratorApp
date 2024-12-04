package org.example;

import java.util.List;

public class Refrigerator {
    List<Ingredient> ingredientList ;
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

}
