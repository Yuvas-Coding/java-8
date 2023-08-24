package org.com.PredicateInteface.Joining;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StudentJoinClass {
	public static void main(String[] args) {
		StudentClass student1=new StudentClass("manikanta",78,"ECE");
		StudentClass student2=new StudentClass("mani",79,"CSE");
		StudentClass student3=new StudentClass("yuva",68,"Mech");
		StudentClass student4=new StudentClass("teja",67,"EEE");
		StudentClass student5=new StudentClass("sri",69,"ECE");
		
		List<StudentClass> student=Arrays.asList(student1,student2,student3,student4,student5);
		
		 Predicate<StudentClass> p1=(p)->p.name.startsWith("m");
		 Predicate<StudentClass> p2=(p)->p.Percentage >= 75;
		 Predicate<StudentClass> p3=(p)->p.Stream.equals("ECE");
		 
		 Predicate<StudentClass> predicate = p1.and(p2);
		 for(StudentClass s:student) {
			 if(predicate.test(s)) {
				 System.out.println("name: "+s.name+" Percentage: "+s.Percentage+" Stream: "+s.Stream);
			 }
			 else {
				 System.out.println("not found");
			 }
		 }
		 
	}
}
