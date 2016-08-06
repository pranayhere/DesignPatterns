package PrototypePattern;

public class Circle extends Shape {
	public Circle() {
		type = "Circle";
	}
	
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("inside circle:draw() method");
	}
}
