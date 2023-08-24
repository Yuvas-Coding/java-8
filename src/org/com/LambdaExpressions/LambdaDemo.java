package org.com.LambdaExpressions;

public class LambdaDemo {
	public static void main(String[] args) {
		Shape circle=()->System.out.println("draw the cicle...");
		circle.Draw();
		Shape triangle=()->System.out.println("draw the triangle...");
		triangle.Draw();
		Shape square=()->System.out.println("draw the square...");
		square.Draw();
	}
}
/*	System.out.println("-----------------------------------------------------");	
		print(square);
		print(triangle);
		print(circle);
	System.out.println("---------------------------------------------------");
	print(()->System.out.println("draw the cicle..."));
	print(()->System.out.println("draw the triangle..."));
	print(()->System.out.println("draw the square..."));
	
	}
	public static void print(Shape shape) {
		shape.Draw();
	}
}
*/
