package org.com.StringJoiner;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class SetEmptyValueMethod {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		
		StringJoiner joiner=new StringJoiner(",");
		
		for(String li:list) {
			joiner.add(li);
		}
		String result=joiner.setEmptyValue("emptyValue").toString();
		
		System.out.println(joiner);
	}
}
