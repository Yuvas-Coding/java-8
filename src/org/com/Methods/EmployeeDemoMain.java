package org.com.Methods;

import java.util.stream.Stream;

public class EmployeeDemoMain {
	public static void main(String[] args) {
		EmployeeClass e1=new EmployeeClass("manikanta",24,45000);
		EmployeeClass e2=new EmployeeClass("mani",23,50000);
		EmployeeClass e3=new EmployeeClass("sri",28,60000);
		EmployeeClass e4=new EmployeeClass("yuva",28,48000);
		EmployeeClass e5=new EmployeeClass("teja",30,80000);
		EmployeeClass e6=new EmployeeClass("uma",35,85000);
		EmployeeClass e7=new EmployeeClass("mouni",28,48000);
		//Print Emp Name with Emp age whose salary is >= 50,000 using Stream API.
		Stream<EmployeeClass> stream = Stream.of(e1,e2,e3,e4,e5,e6,e7);
		
		stream.filter(e->e.salary >=50000).map(e->e.name+"--"+e.age).forEach(i->System.out.println(i));
		
		
		
		
	}
}
