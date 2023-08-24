package org.com.PredicateInteface;

import java.util.Scanner;
import java.util.function.Predicate;

public class palindromOrNot {
	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter the string");
		 String inputString=sc.next();
		 
		 
	        Predicate<String> isPalindrome = (s) -> {
	            StringBuilder sb = new StringBuilder(s);
	            sb.reverse();
	            return s.equals(sb.toString());
	        };
	        	boolean result = isPalindrome.test(inputString);
	        	if(result) {
	        		System.out.println(inputString+" given string is palindrom");
	        		
	    }
	        	else {
	        		System.out.println(inputString+" is not a palindrom");
	        	}
	}
}
