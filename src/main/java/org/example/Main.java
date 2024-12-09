package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello in Refrigerator App");

        // tablica (Array) Ingredient[] tablica

        // kolekcja (Collection) List<Ingredient> kolekcja

        Ingredient milk = new Ingredient("milk", 500);
        Ingredient egg = new Ingredient("egg", 12);

//        // here we create collection List of Ingredients
//        List<Ingredient> ingredients = new ArrayList<>();
        Ingredient[] ingredients = new Ingredient[2];
//        // here we add milk with 500 ml
//        ingredients.add(milk);
        ingredients[0] = milk;
//        // here we add 12 eggs
//        ingredients.add(egg);
        ingredients[1] = egg;


        // here we create lodówka
        Refrigerator refrigerator = new Refrigerator(ingredients);

        // here we print ingredients from lodówka
//        List<Ingredient> ingredientList = refrigerator.getIngredientList();
        Ingredient[] ingredientsArray = refrigerator.getIngredientsArray();
        for(int i = 0; i < ingredientsArray.length; i++){
            System.out.println(ingredientsArray[i]);
        }
//        System.out.println(ingredientList);

        System.out.println("Bye Bye");
    }
}