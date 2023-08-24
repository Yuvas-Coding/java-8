package org.com.Methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Method_peek {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("john","jane","Bob","cat");
		
		List<String> result=names.stream().filter(name->name.startsWith("j")).peek(System.out::println).map(t -> t.toUpperCase()).collect(Collectors.toList());
		
		
		System.out.println("result:"+result);
		
	}
}
