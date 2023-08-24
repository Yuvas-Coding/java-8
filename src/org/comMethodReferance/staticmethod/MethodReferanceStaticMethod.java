package org.comMethodReferance.staticmethod;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferanceStaticMethod {
	
	public static int addition(int a , int b) {
		return a+b;
		
	}
	public static void main(String[] args) {
		
		//1)method referance to a static method...
		//lambda expressions...
		Function<Integer, Double> function=(input)->Math.sqrt(input);
		System.out.println(function.apply(4));
		
		//using method referance 
		Function<Integer, Double> functionInput=Math::sqrt;
		System.out.println(functionInput.apply(5));
		
		//creating lambda expression for above method...
		BiFunction<Integer,Integer,Integer> biFunction=(a,b)->MethodReferanceStaticMethod.addition(a, b);
		
		System.out.println(biFunction.apply(55, 65));
		
		//by using method referance...
		BiFunction<Integer, Integer, Integer> biLambda=MethodReferanceStaticMethod::addition;
		System.out.println(biLambda.apply(55, 721));
	}
}
