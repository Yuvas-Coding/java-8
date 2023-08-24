package org.com.StreamAPI;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurrenceOfCharCount {
	public static void main(String[] args) {
		String input="hi all how are you i am good";
		
		Map<String, Long> collect = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
	}
}

