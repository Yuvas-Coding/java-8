package org.com.PredicateInteface;

import java.util.Scanner;
import java.util.function.Predicate;

public class PositiveNumberChecker {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num: ");
		int number=sc.nextInt();
		
		Predicate<Integer>predicate=n->n>0;
		
		if(predicate.test(number)) {
			System.out.println(number+" given number is positive");
		}
		else {
			System.out.println(number+" given number is negitive");
		}
	}
}
