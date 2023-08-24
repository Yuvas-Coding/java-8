package org.com.InterfaceChange;

public class Bus implements Vechicle {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("bus is started... ");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("ready to move....");
	}
	public static void main(String[] args) {
		Vechicle v=new Bus();
		v.start();
		v.move();
	}
}
