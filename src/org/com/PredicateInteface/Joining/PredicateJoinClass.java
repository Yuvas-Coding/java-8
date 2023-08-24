package org.com.PredicateInteface.Joining;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateJoinClass {
	public static void main(String[] args) {
		EmployeeClass emp1=new EmployeeClass("hyd", "manikanta", "DevOps");
		EmployeeClass emp2=new EmployeeClass("puna", "mani", "JavaFullStack");
		EmployeeClass emp3=new EmployeeClass("chennai", "teja", "DevOps");
		EmployeeClass emp4=new EmployeeClass("hyd", "teja", "Aws");
		
		List<EmployeeClass> emp=Arrays.asList(emp1,emp2,emp3,emp4);
		
		Predicate<EmployeeClass> p1=(e)->e.location.equals("hyd");
		Predicate<EmployeeClass> p2=(e)->e.name.startsWith("p");
		Predicate<EmployeeClass> p3=(e)->e.dept.equals("python");
		
		//Predicate_Joining
		Predicate<EmployeeClass> pre=(p2).or(p3);
		
		for(EmployeeClass e:emp) {
			if(pre.test(e))
			System.out.println(e.name+"-----"+e.dept);
		}
		
		
	}
}
