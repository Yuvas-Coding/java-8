package org.com.PredicateInteface;

import java.util.function.Predicate;

public class NameStart_S {
	public static void main(String[] args) {
		String[] names = {"Sarah", "John", "Samantha", "Bob"};
		
		Predicate<String> predicate = name-> name.startsWith("S");
		
		for(String name:names) {
			if(predicate.test(name)) {
				System.out.println(name+" Start with (S)");
			}
			else{
				System.out.println(name+" Not Start with (S)");
			}
		}
		
	}
}
