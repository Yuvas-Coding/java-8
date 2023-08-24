package org.com.PredicateInteface;

import java.util.Scanner;
import java.util.function.Predicate;

public class EvenOrodd {
	public static void main(String[] args) {
		Predicate<Integer> predicate = num->num % 2==0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		if(predicate.test(num)) {
			System.out.println(num+"->given number is even number");
		}
		else {
			System.out.println(num+"->given number is odd number");
		}
		
	}
}
