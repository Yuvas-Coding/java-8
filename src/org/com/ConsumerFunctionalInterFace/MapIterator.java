package org.com.ConsumerFunctionalInterFace;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class MapIterator {

    public static void main(String[] args) {

        // Create a HashMap containing names and ages
        Map<String, Integer> nameAgeMap = new HashMap<>();
        nameAgeMap.put("Alice", 25);
        nameAgeMap.put("Bob", 30);
        nameAgeMap.put("Charlie", 35);

        // Create a Consumer that prints the name and age of each entry in the map
        Consumer<Map.Entry<String, Integer>> entryPrinter = entry -> {
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
        };

        // Iterate through the entries of the map using the forEach method and apply the Consumer
        nameAgeMap.forEach((key, value) -> entryPrinter.accept(Map.entry(key, value)));
    }
}
