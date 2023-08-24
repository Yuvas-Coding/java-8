package org.com.StringJoiner;

import java.util.StringJoiner;

public class StringJoinerExample {
	public static void main(String[] args) {
		StringJoiner joiner=new StringJoiner("-","{","}");
		
		joiner.add("apple");
		joiner.add("banana");
		joiner.add("orange");
		joiner.add("mango");
		
		System.out.println(joiner);
	}
}
