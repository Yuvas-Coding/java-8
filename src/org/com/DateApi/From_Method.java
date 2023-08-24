package org.com.DateApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class From_Method{
	public static void main(String[] args) {
		/*The from() method in LocalDateTime class is used to obtain an 
		 * instance of LocalDateTime from a temporal object. Here is an example program 
		 * that demonstrates the use of from() method:*/
		  LocalDate date = LocalDate.of(2023, 4, 30);
	        LocalTime time = LocalTime.of(16, 30);
	        LocalDateTime dateTime = LocalDateTime.from(date.atTime(time));
	        System.out.println("LocalDateTime: " + dateTime);
	}
}
