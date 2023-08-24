package org.comMethodReferance.staticmethod;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Arithmetic{
	public static int add(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		
		
		BiFunction<Integer, Integer, Integer> adder	=(a,b)->Arithmetic.add(a, b);
		System.out.println(add(85, 90));
				
				
				
		System.out.println("by using method referacee...");
		BiFunction<Integer, Integer, Integer>bio=Arithmetic::add;
		int result=adder.apply(50, 900);
		System.out.println(result);
	}
}




