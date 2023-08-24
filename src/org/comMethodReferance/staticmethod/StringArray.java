package org.comMethodReferance.staticmethod;

import java.util.Arrays;

public class StringArray {
		public static void main(String[] args) {
			
	
		// TODO Auto-generated constructor stub
		String[] strarr= {"A","E","I","O","U","a","e","i","o","u"};
		
		Arrays.sort(strarr,(s1,s2)->s1.compareToIgnoreCase(s2));
		
		System.out.println(strarr);
		
		
	}
}
