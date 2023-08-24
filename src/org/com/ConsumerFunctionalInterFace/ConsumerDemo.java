package org.com.ConsumerFunctionalInterFace;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<String> c=(name)->System.out.println(name+" good morning");
		c.accept("mani");
		c.accept("yuva");
		c.accept("sri");
		c.accept("teja");

	}
}
