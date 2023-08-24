package org.com.PredicateInteface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePersonsDemo {
	public static void main(String[] args) {
		PersonClass p1 = new PersonClass("manikanta", 24);
		PersonClass p2 = new PersonClass("yuva", 15);
		PersonClass p3 = new PersonClass("mani", 23);
		PersonClass p4 = new PersonClass("teja", 20);
		PersonClass p5 = new PersonClass("sri", 15);
		
		List<PersonClass> persons = Arrays.asList(p1,p2,p3,p4,p5);
		
		Predicate<PersonClass> pre = p->p.age >= 18;
		
		Predicate<PersonClass> pc=p11->p11.name.startsWith("m");
		
		// Predicate Joining
				Predicate<PersonClass> p = pre.and(pc);
		
		for(PersonClass person:persons) {
			if(p.test(person)) {
				System.out.println("person name ="+person.name +" and age is="+person.age);
			}
		}
	}
}