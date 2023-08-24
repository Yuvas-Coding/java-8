package org.com.PredicateInteface;

import java.util.function.Predicate;

/* Declare names in an array and print names which are starting with 'A' using lambda expression.

		String[ ]  names = {"Anushka", "Anupama", "Deepika", "Kajol", "Sunny" };*/
public class Starting_Letter_A {
	
	public static void main(String[] args) {
		String[ ]  names = {"Anushka", "Anupama", "Deepika", "Kajol", "Sunny"};
		Predicate<String> predicate=name->name.charAt(0)=='S';
		for (String name : names) {
			if(predicate.test(name)) {
				System.out.println(name);
			}
		}
	}
}