package org.com.optional;

import java.util.Optional;

public class IspresentMethod {
	public static void main(String[] args) {
		Customer customer = new Customer(101, "manikanta", null);
		
		Optional<String> emailOtional=Optional.ofNullable(customer.getEmail());
		if(emailOtional.isPresent()) {
			System.out.println(emailOtional.get());
		}
		else {
			System.out.println("no data found...");
		}
	}
}
