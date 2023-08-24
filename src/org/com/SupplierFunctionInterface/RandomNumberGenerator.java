package org.com.SupplierFunctionInterface;

import java.util.Random;
import java.util.function.Supplier;

public class RandomNumberGenerator {
	public static void main(String[] args) {
		Supplier<Integer> randomSupplier = () -> new Random().nextInt(1000);

	       // Generate 5 random numbers
	       for (int i = 0; i < 5; i++) {
	           int random = randomSupplier.get();
	           System.out.println("Random number: " + random);
	       }
	}
}