package org.com.StreamAPI;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamsPrograms {
	public static void main(String[] args) {
		//integer Stream
		IntStream.range(1, 20).forEach(i->System.out.print(i+" "));
		System.out.println();
		System.out.println("-------------------------------------------------");
		
		System.out.println("Integer stream with skip");
		IntStream.range(1, 10).skip(5).forEach(value -> System.out.print(value));
		System.out.println();
		System.out.println("-------------------------------------------------");
		
		System.out.println("Integer Stream with sum");
		System.out.println(IntStream.range(1, 5).sum());
		System.out.println();
		System.out.println("-------------------------------------------------");
		
		System.out.println("Stream.of,sorted and findFirst");
		Optional<String> result=Stream.of("Ava","Aneri","Alberto").sorted().findFirst();
		if(result.isPresent()) {
			System.out.println(result.get());
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Stream from Array,sort,filter and print");
		String[] names= {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
	}
}
