package org.comMethodReferance.staticmethod;

import java.util.function.BiFunction;

public class ArithmeticOverloading {
	public static int add(int a,int b) {
		return a+b;
	}
	public static double add(int a , double b) {
		return a+b;
	}
	public static double add(double a,int b) {
		return a+b;
		
	}
	public static void main(String[] args) {
		
		BiFunction<Integer,Integer,Integer> biFunction1=ArithmeticOverloading::add;
		int res1=biFunction1.apply(8, 6);
		System.out.println(res1);
		
		BiFunction<Integer,Double,Double> biFunction2=ArithmeticOverloading::add;
		Double res2=biFunction2.apply(100, 95.88);
		System.out.println(res2);
		
		
		
		
	}
}
