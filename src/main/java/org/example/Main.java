package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.StandardOpenOption.APPEND;

// klasa Main
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello in Refrigerator App");

        String fileName = "src/main/resources/ingredients.txt";
        Files.deleteIfExists(Paths.get(fileName));
        Path file = Files.createFile(Paths.get(fileName));

        Ingredient milk = new Ingredient("milk", 500);
        System.out.println(milk.toString());
        Ingredient egg = new Ingredient("egg", 12);
        System.out.println(egg);

        List<Ingredient> wikiKolekcja = new ArrayList<>();
        System.out.println(wikiKolekcja);
        wikiKolekcja.add(milk);
        System.out.println(wikiKolekcja);
        wikiKolekcja.add(egg);
        System.out.println("tutaj mamy mleko i jajko: " + wikiKolekcja);
        wikiKolekcja.add(new Ingredient("oil kujawski", 41241));
        System.out.println(wikiKolekcja);
        wikiKolekcja.add(new Ingredient("oil szwedzki", 9999));
        System.out.println(wikiKolekcja);

        byte[] bytes = wikiKolekcja.toString().getBytes();
        Files.write(file, bytes);


//        ingredients.add(oil);
//
//        Refrigerator refrigerator = new Refrigerator(ingredients);
//
//        // funkcja
//        refrigerator.isIngredientAvailable("oil");
//        refrigerator.isIngredientAvailable("milk");
//        refrigerator.isIngredientAvailable("egg");
//
//        List<Ingredient> ingredientList = refrigerator.getIngredientList();
//        System.out.println(ingredientList);

        System.out.println("Bye Bye");
    }
}