package org.com.EmployeeProject;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.com.optional.IspresentMethod;

public class EmployeeTest {
	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<Employee>();
        
		employeeList.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		employeeList.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		employeeList.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		employeeList.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		employeeList.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		employeeList.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		employeeList.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		employeeList.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		employeeList.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
		employeeList.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		employeeList.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		employeeList.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));
		
		//System.out.println(employeeList);
		
		
		System.out.println("How many male and female employees are there in the organization ?");
		System.out.println(employeeList.stream().collect(Collectors.groupingBy(t -> t.getGender(),Collectors.counting())));
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		
		System.out.println("Print the name of all departments in the organization ?");
		employeeList.stream().map(t -> t.getDepartment()).distinct().forEach(i->System.out.println(i));
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		System.out.println(" What is the average age of male and female employees ?");
		System.out.println(employeeList.stream().collect(Collectors.groupingBy(
		Employee::getGender,Collectors.averagingInt(Employee::getAge))));
		System.out.println("-----------------------------------------------------------------------------------------------");
			 
		
		System.out.println("Get the details of highest paid employee in the organization ?");
		System.out.println(employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		System.out.println("Get the names of all employees who have joined after 2015 ?");
		employeeList.stream().filter(i->i.yearOfJoining > 2015).map(i->i.getName()).forEach(i->System.out.println(i));
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		System.out.println("Count the number of employees in each department ?");
		System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting())));
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		System.out.println("What is the average salary of each department ?");
		System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary))));
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		
		  System.out.println("Get the details of youngest male employee in the Development department ?");
		  System.out.println(employeeList.stream().filter(i->i.getGender().
		  equalsIgnoreCase("male") &&
		  i.getDepartment().equalsIgnoreCase("Development"))
		  .min(Comparator.comparing(Employee::getAge )));
		  
		  System.out.println("-----------------------------------------------------------------------------------------------");
		 
		
		
		  System.out.println("Who has the most working experience in the organization");
		  System.out.println(employeeList.stream().collect(Collectors.minBy(Comparator.
		  comparing(t -> t.getYearOfJoining()))));
		  System.out.println("-----------------------------------------------------------------------------------------------");
		 
		
		  System.out.println("How many male and female employees are there in the Sales team ?");
		  Map<String,Long>
		  result=employeeList.stream().filter(i->i.getDepartment().equalsIgnoreCase(
		  "sales")) .collect(Collectors.groupingBy(t ->
		  t.getGender(),Collectors.counting()));
		  System.out.println(result);
		  System.out.println("-----------------------------------------------------------------------------------------------");
			 
		  System.out.println("What is the average salary of male and female employees ?");
		  System.out.println(employeeList.stream()
		  .collect(Collectors.groupingBy(Employee::getGender,Collectors
		  .averagingDouble(Employee::getSalary))));
		  System.out.println("-----------------------------------------------------------------------------------------------");
			 
		  System.out.println("List down the names of all employees in each department ?");
		  Map<String,List<String>> result1=employeeList.stream()
		  .collect(Collectors.groupingBy(Employee::getDepartment,Collectors
		  .mapping(Employee::getName, Collectors.toList())));
		  System.out.println(result1);
		  System.out.println("-----------------------------------------------------------------------------------------------");
			 
		 System.out.println("What is the average salary and total salary of the whole organization");
		  double d=employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
				
		  double d1=employeeList.stream().collect(Collectors.summingDouble(Employee::getSalary )); 
		  System.out.println("avg="+d); System.out.println("sum="+d1);
		  System.out.println("-----------------------------------------------------------------------------------------------");
		
		  System.out.println("Who is the oldest employee in the organization");
		  System.out.println(employeeList.stream().collect(Collectors.maxBy(Comparator.
				  comparing(t -> t.getAge()))));
		  System.out.println("-----------------------------------------------------------------------------------------------");
			
		  System.out.println("Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years ?");
		  Map<Boolean, List<Employee>> employeesByAge = employeeList.stream()
	                .collect(Collectors.partitioningBy(emp -> emp.getAge() <= 25));
	
	        List<Employee> youngerEmployees = employeesByAge.get(true);
	        List<Employee> olderEmployees = employeesByAge.get(false);
	        System.out.println("YoungerEmpoyees: "+youngerEmployees);
	        System.out.println("olderEmpoyees: "+olderEmployees);
	        System.out.println("----------------------- ------------------------------------------------------------------------");
			
			
			 System.out.println("second hight salary of the emp ");
			 Optional<Employee> list=employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)
					 .reversed()).skip(1).findFirst();
			 if(list.isPresent()) {
				 System.out.println(list.get());
			 }
			 System.out.println("-----------------------------------------------------------------------------------------------");
				
			 System.out.println("groupby emp by dept -sum the salaries of the emp by each dept..");
			System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getSalary,
					Collectors.reducing((a,b)->a+b)))));	

	}
	
}
