package org.com.ConsumerFunctionalInterFace;

import java.util.Arrays;
import java.util.List;

public class ForEachMethod {
	public static void main(String[] args) {

	List<Integer> numbers=Arrays.asList(10,20,30,45,55);
	numbers.forEach(i->System.out.println(i));
	}
}