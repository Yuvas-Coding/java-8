package org.com.optional;

import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
		Customer customer=new Customer(101, "mani",null);
		
		//Optional<String> emailOptional=Optional.of(customer.getEmail());
		
		Optional<String> emailOptional=Optional.ofNullable(customer.getEmail());
		System.out.println(emailOptional);
	}
}
