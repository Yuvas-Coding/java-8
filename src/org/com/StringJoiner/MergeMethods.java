package org.com.StringJoiner;

import java.util.StringJoiner;

public class MergeMethods {
	public static void main(String[] args) {
		StringJoiner joiner1=new StringJoiner("-");
		StringJoiner joiner2=new StringJoiner(",");
		
		joiner2.add("uma");
		joiner2.add("mouni");
		
		joiner1.add("mani");
		joiner1.add("yuva");
		
		System.out.println(joiner1.merge(joiner2));
		
		
		
	}
}
