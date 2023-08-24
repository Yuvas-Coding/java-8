package org.com.Methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Method_reduce {
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);
		
		Optional<Integer> sum=numbers.stream().reduce((a,b)->a+b);
		
		if(sum.isPresent()) {
			System.out.println("sum of the numbers:"+sum);
		}
		else {
			System.out.println("stream is empty..");
		}
		
		
	}
}
