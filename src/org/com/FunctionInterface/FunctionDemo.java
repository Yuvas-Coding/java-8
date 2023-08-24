package org.com.FunctionInterface;

import java.util.function.Function;

class FunctionImp implements Function<String, Integer>{

	@Override
	public Integer apply(String s) {
		// TODO Auto-generated method stub
		return s.length();
	}
	
}
public class FunctionDemo {
	public static void main(String[] args) {
		/*
		 * FunctionImp f=new FunctionImp(); int result=f.apply("manikanta");
		 * System.out.println(result);
		 */
		Function<String, Integer> function = (s) -> s.length();

		System.out.println(function.apply("manikanta"));

	}

}
