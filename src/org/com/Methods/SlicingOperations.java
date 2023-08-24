package org.com.Methods;

import java.util.Arrays;
import java.util.List;

public class SlicingOperations {
	public static void main(String[] args) {
		List<String> javacourses = Arrays.asList("corejava", "advjava", "springboot", "restapi", "microservices");
		System.out.println("Get elements from the stream based on given size");
		javacourses.stream().limit(4).forEach(i->System.out.println(i));
		System.out.println("------------------------------------------------");
		System.out.println("It is used to skip given number of elements from starting position of the stream ");
		javacourses.stream().skip(3).forEach(i->System.out.println(i));
		System.out.println("--------------------------------------------------------------------");
		System.out.println(" To get unique elements from the Stream");
		List<String> names=Arrays.asList("raja","raja","mani","mani");
		names.stream().distinct().forEach(i->System.out.println(i));
	}
	
	
}
