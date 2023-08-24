package org.com.LambdaExpressions;
class ThreadDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run method is called.....");
	}
	
}

public class RunnableLambdaExample {
	public static void main(String[] args) {
		Thread t=new Thread(new ThreadDemo());
		t.start();
		
		
		Runnable thread=()->System.out.println("thread is started and called run method....");
		Thread t1=new Thread(thread);
		System.out.println("-------------------------------------------------");
		System.out.println("by using lambda expression creating thread....");
		System.out.println("-------------------------------------------------");
		t1.start();
	}

}
