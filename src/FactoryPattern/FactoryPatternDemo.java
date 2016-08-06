package FactoryPattern;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape circleShape = shapeFactory.getShape("Circle");
		circleShape.draw();
		
		Shape rectangleShape = shapeFactory.getShape("Rectangle");
		rectangleShape.draw();
		
		Shape squareShape = shapeFactory.getShape("square");
		squareShape.draw();
	}
}
