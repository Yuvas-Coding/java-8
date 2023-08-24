package org.com.InterfaceChange;

public class Bike implements Vechicle {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("bike is started....");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("ready to move");
	}
	public static void main(String[] args) {
		Vechicle v=new Bike();
		v.start();
		v.move();
	}
}
