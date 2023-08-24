package org.com.StringJoiner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class JoinMultipleString {
	public static void main(String[] args) {
		List<String> list1=Arrays.asList("apple","banana","orange");
		List<String> list2=Arrays.asList("carrot","peppar","tomato");
		
		StringJoiner joiner=new StringJoiner(", ","{","}");
		
		for(String fruit:list1) {
			joiner.add(fruit);
		}
		
		for(String veg:list2) {
			joiner.add(veg);
		}
		
		System.out.println(joiner);
		
	}
}
