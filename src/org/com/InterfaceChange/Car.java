package org.com.InterfaceChange;

public class Car implements Vechicle{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("car is start");
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("ready to move....");
	}
	
	public static void main(String[] args) {
		 Car c=new Car();
		 c.start();
		 c.move();
	}
}
