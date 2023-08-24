package org.com.PredicateInteface;

import java.util.Scanner;
import java.util.function.Predicate;

public class VoterEligibilityChecker {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int givenAge=sc.nextInt();
		
		Predicate<Integer> predicate= age->age>=18;
		if(predicate.test(givenAge)) {
			System.out.println("person are eligible to vote.");
		}
		else {
			System.out.println("person are not eligible to vote.");
		}
		
		
	}
}
