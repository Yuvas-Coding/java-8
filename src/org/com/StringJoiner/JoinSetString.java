package org.com.StringJoiner;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

public class JoinSetString {
	public static void main(String[] args) {
		Set<String> fruits=new HashSet<>(Arrays.asList("apple","banana","orange"));
		
		StringJoiner joiner=new StringJoiner(", ","{","}");
		
		for(String fruit:fruits) {
			joiner.add(fruit);
		}
		System.out.println(joiner);
	}
}
