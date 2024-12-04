package org.example;

import java.util.List;

public class RecipeBook {
    public List<Ingredient> ingredientList;
    public List<Dish> dishList;
    public RecipeBook(List<Ingredient> ingredientList,List<Dish> dishList ) {
        this.ingredientList = ingredientList;
        this.dishList = dishList;
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public List<Dish> getDishList() {
        return dishList;
    }

    public void setDishList(List<Dish> dishList) {
        this.dishList = dishList;
    }
//    public String Suggestdishes(){
//
//
}
