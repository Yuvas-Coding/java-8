package org.com.InterfaceChange.Java8;

public interface Vehicle {
	void start();
	
	public default void stop() {
		System.out.println("stop the vehicle");
	}
	
	public static void test() {
		System.out.println("static method created in interface");
	}
	
}
