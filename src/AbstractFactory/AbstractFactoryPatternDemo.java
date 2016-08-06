package AbstractFactory;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		Shape circleShape = shapeFactory.getShape("circle");
		circleShape.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		Color redColor = colorFactory.getColor("red");
		redColor.fill();
	}
}
