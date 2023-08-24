package org.com.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class CreateDemoStream {
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		numbers.stream().filter(i->i%2==0).forEach(i->System.out.println("even number:"+i));
	}
}
