package org.com.Methods;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Method_toArray {
	public static void main(String[] args) {
		
	List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);
	
	Object[] result=    numbers.stream().filter(i->i%2==0).map(e->e*2).toArray();
	System.out.println(result);
	}
}
