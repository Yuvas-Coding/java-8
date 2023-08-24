package org.com.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StringStream {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "Anushka", "Anupama", "Smith", "Ashok");
		
		names.stream().filter(i->i.startsWith("A")).forEach(i->System.out.println(i));
	}
}
