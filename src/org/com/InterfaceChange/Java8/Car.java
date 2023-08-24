package org.com.InterfaceChange.Java8;

public class Car implements Vehicle {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("car started....");
	}
	public static void main(String[] args) {
		 Car c= new Car();
		 c.start();
		 
		 Vehicle.test();
	}

}
