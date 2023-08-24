package org.com.PredicateInteface.Joining;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*Number should be divisible by 2 and greater than 10 ?*/
public class DivisibleBy2 {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(20,15,12,11,10,5,4);
		
		Predicate<Integer> p1 = number->(number%2==0);
		Predicate<Integer> p2 = number->(number>10);
		
		Predicate<Integer> predicate=p1.and(p2);
		for(Integer l:list) {
			if(predicate.test(l)) {
				System.out.println("The number divisiable by 2 and greater than 10 ="+l);
			}
		}
	}
}
