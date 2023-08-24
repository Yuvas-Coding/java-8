package org.com.ConsumerFunctionalInterFace;

import java.util.function.Consumer;

class ConsumerNormal implements Consumer<String>{

	@Override
	public void accept(String name) {
		// TODO Auto-generated method stub
		System.out.println(name);
		
	}
	
}

public class ConsumerFunctionNormalWay {
	public static void main(String[] args) {
		ConsumerNormal consumerNormal = new ConsumerNormal();
		consumerNormal.accept("hellworld");
	}
}

