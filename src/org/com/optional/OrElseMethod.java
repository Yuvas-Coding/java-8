package org.com.optional;

import java.util.Optional;

public class OrElseMethod {
	public static void main(String[] args) {
		Customer customer = new Customer(101, "sri",null);
		
		Optional<String> emailOptional=Optional.ofNullable(customer.getEmail());
		System.out.println(emailOptional.orElse("default.vtalent.com"));
		
		
	}
}
