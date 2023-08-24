package org.comMethodReferance.staticmethod;


@FunctionalInterface
interface Printable{
	void print(String msg);
}
public class MethodRefInstanceMethod {
	public void diplay(String msg) {
		msg=msg.toUpperCase();
		System.out.println(msg);
	}
	public static void main(String[] args) {
		MethodRefInstanceMethod method=new MethodRefInstanceMethod();
		
		Printable printable = msg -> method.diplay(msg);
		System.out.println("by using lambda expressions....");
		printable.print("hello_world");
		
	
		/*
		 * //by uing method referance.....
		 * System.out.println("by using method referacne..."); Printable
		 * pri=method::diplay; pri.print("manikanta");
		 */
		
	}
}
