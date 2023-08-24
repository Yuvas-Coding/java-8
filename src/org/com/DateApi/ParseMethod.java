package org.com.DateApi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParseMethod {
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a");
		String time1 = "2019-03-27 10:15:30 AM";
		LocalDateTime localTimeObj1 = LocalDateTime.parse(time1, formatter);
		System.out.println(localTimeObj1);
	}
}
