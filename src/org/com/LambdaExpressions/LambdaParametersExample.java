package org.com.LambdaExpressions;
 
interface Addable{
	int addition(int a ,int b);
}
class addImp implements Addable{

	@Override
	public int addition(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}
public class LambdaParametersExample {
	public static void main(String[] args) {
		/*addImp a=new addImp();
		int add=a.addition(50, 60);
		System.out.println(add);*/
		
		/*System.out.println("by using lambda expressions with parameters....");
		Addable addable=(int a ,int b)->(a+b);
		int result=addable.addition(50, 80);
		System.out.println(result);*/
		
		Addable add=(a,b)->{
			int c=a+b;
			return c;
		};
		int result=add.addition(50, 100);
		System.out.println(result);
		
		
	}
}
