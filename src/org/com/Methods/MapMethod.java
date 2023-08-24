package org.com.Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapMethod {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("manikanta","yuva","teja","sri","mani");
		// to convert list to uppercase...
		System.out.println("convert the list ot upper case ");
		names.stream().map(name->name.toUpperCase()).forEach(n->System.out.println(n));
		
		System.out.println("-----------------------------------------------------");
		
		System.out.println("get the length of list...");
		// to get the length of the given list...
		names.stream().map(name->name.length()).forEach(i->System.out.println(i));
		
		System.out.println("------------------------------------------------------");
		
		//print name with its length which are starting with 'm' using Stream API
		System.out.println("print lenght name start with m....");
		names.stream().filter(name->name.startsWith("m")).map(name->name+"-"+name.length()).forEach(i->System.out.println(i));
		
		
		
	}
}
