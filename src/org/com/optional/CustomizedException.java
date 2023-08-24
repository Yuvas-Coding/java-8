package org.com.optional;

import java.util.Optional;

public class CustomizedException {
	public static void main(String[] args) throws Throwable {
		Customer customer = new Customer(103, "manikanta", null);
		
		Optional<String> emailOptional=Optional.ofNullable(customer.getEmail());
		
		  System.out.println(emailOptional.orElseThrow(()->new
		  IllegalArgumentException("Email is not found")));
		 
	}
}
