package org.example;

import java.util.List;

public class Recipe {
    public List<Ingredient> ingredientList;
    public List<String> dishNames;

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public List<String> getDishNames() {
        return dishNames;
    }

    public void setDishNames(List<String> dishNames) {
        this.dishNames = dishNames;
    }

    public Recipe(List<Ingredient> ingredientList, List<String> dishNames) {
        this.ingredientList = ingredientList;
        this.dishNames = dishNames;

    }

    @Override
    public String toString() {
        return "Recipe{" +
                "ingredientList=" + ingredientList +
                ", dishNames=" + dishNames +
                '}';
    }
}
