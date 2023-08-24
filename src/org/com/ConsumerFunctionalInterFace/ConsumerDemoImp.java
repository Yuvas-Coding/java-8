package org.com.ConsumerFunctionalInterFace;

import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String>{

	@Override
	public void accept(String input) {
		// TODO Auto-generated method stub
		System.out.println(input);
	}
	
}
public class ConsumerDemoImp {
	public static void main(String[] args) {
		ConsumerImpl consumerImpl = new ConsumerImpl();
		consumerImpl.accept("hi all how are you");
		
		System.out.println("by using lambdaExpressions...");
		Consumer<String> coImpl = (input)->System.out.println(input);
		
		coImpl.accept("hello world...");
		
	}
}