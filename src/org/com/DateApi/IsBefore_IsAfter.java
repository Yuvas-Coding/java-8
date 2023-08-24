package org.com.DateApi;

import java.time.LocalDateTime;

public class IsBefore_IsAfter {
	public static void main(String[] args) {
		 LocalDateTime dateTime1 = LocalDateTime.of(2023, 4, 30, 16, 30, 0);
	        LocalDateTime dateTime2 = LocalDateTime.of(2023, 5, 1, 16, 30, 0);
	        if (dateTime1.isBefore(dateTime2)) {
	            System.out.println(dateTime1 + " is before " + dateTime2);
	        } 
	        else if (dateTime1.isAfter(dateTime2)) {
	            System.out.println(dateTime1 + " is after " + dateTime2);
	        }
	}
}
	
	            