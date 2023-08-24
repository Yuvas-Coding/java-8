package org.com.DateApi;
import java.time.LocalDateTime;
public class ModifyingLocalDateTime {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();

		//3 hours later
		LocalDateTime localDateTime1 = now.plusHours(3);	

		//3 minutes earliar
		LocalDateTime localDateTime2 = now.minusMinutes(3);

		//Next year same time
		LocalDateTime localDateTime3 = now.plusYears(1);

		//Last year same time
		LocalDateTime localDateTime4 = now.minusYears(1);
		
		System.out.println("3 hours later: "+localDateTime1);
		System.out.println("3 minutes earliar "+localDateTime2);
		System.out.println("Next year same time "+localDateTime3);
		System.out.println("last year same time "+localDateTime4);
	}
}
