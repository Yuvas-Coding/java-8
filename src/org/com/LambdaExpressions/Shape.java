package org.com.LambdaExpressions;
@FunctionalInterface
public interface Shape {
	void Draw();
	
}


class Circle implements Shape{

	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.println("draw the circle shape.....");
		
	}
	
}
class Triangle implements Shape{

	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.println("draw the triangle shape....");
	}
	
}
class Square implements Shape{

	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.println("draw the square shape....");
	}
	
}


