package org.example;

import java.util.List;

public class Dish {
    public String name;
    public List<Ingredient> ingredientList;
    public Dish(String name, List<Ingredient> ingredients) {
        this.name = name;
        this.ingredientList = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredientList;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredientList = ingredients;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", ingredientList=" + ingredientList +
                '}';
    }
}
