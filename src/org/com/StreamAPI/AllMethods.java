package org.com.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class AllMethods {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// void forEach(consumer<? super T> action)

		/* numbers.forEach(i->System.out.println(i)); */

		// Stream<T> filter(Predicate<? super T> predicate)
		/* numbers.stream().filter(i->i%2==0).forEach(i->System.out.println(i)); */

		// <R> Stream<R> map(Function<? super T, ? extends R> mapper);
		
		/*
		 * numbers.stream().filter(i->i%2==0).map(e->e*e).forEach(i->System.out.println(
		 * i));
		 */
		/*
		 * <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>>
		 * mapper); numbers.stream().flatMap(e->Stream.of(e*2,e*5,e*8))
		 * .forEach(i->System.out.println(i));
		 */
		//T reduce(T identity, BinaryOperator<T> accumulator);
		/* System.out.println(numbers.stream().reduce(0, (a,b)->a+b)); */
		
		
		 
		
		

	}
}
