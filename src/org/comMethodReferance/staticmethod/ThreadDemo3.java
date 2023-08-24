package org.comMethodReferance.staticmethod;

public class ThreadDemo3 {
	public static void main(String[] args) {
		Runnable runnable = ()->{
			for(int i=1;i<=5;i++)
				System.out.println(i);
		};
		Thread t = new Thread(runnable);
		t.start();
	}
}