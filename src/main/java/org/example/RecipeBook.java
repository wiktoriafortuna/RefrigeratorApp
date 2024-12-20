package org.example;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

public class RecipeBook {
    public List<Ingredient> ingredientList;
    public List<String> dishNames;
    public List<Recipe>recipes;
    public RecipeBook(List<Ingredient> ingredientList,List<String> dishNames) {
        this.ingredientList = ingredientList;
        this.dishNames = dishNames;
        this.recipes = new ArrayList<>();
        recipes.add (new Recipe(ingredientList,dishNames));
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public List<String> getDishNames() {
        return dishNames;
    }

    public void setDishList(List<String> dishNames) {
        this.dishNames = dishNames;
    }
//    public String Suggestdishes(){
//
//


    @Override
    public String toString() {
        return "RecipeBook{" +
                "ingredientList=" + ingredientList +
                ", dishNames=" + dishNames +
                ", recipes=" + recipes +
                '}';
    }
}
