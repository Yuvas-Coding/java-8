package org.com.Constructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class Fruits {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("watermelon");
		
		Function<List<String>,Set<String>>setFunction=HashSet::new;
		System.out.println(setFunction.apply(fruits));
	}
}
