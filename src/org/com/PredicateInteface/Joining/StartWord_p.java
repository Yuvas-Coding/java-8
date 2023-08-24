package org.com.PredicateInteface.Joining;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StartWord_p {
	public static void main(String[] args) {
	    List<String> names = Arrays.asList("Peter","Martin","Alex","Philip","Piyush","Mike");
	    
	    Predicate<String> p3 = name -> name.startsWith("P");
        Predicate<String> p4 = name -> name.endsWith("p");
        
        // find a name starts with "A" or not ends with "p"
        Predicate<String> predicate = p3.and(p4);
        for(String name:names) {
        	if(predicate.test(name)) {
        		System.out.println(name);
        	}
        }
	}
}
