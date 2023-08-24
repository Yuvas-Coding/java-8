package org.com.StringJoiner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class JoinListString {
	public static void main(String[] args) {
		List<String> fruit=Arrays.asList("apple","banana","orange");
		
		StringJoiner joiner=new StringJoiner(", ");
		
		/*
		 * for(String fruits:fruit ) { joiner.add(fruits); }
		 */
		System.out.println(fruit);
	}
}
