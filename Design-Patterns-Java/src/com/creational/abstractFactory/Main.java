package com.creational.abstractFactory;

public class Main {
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryType.SHAPE);
		
		Shape shape1 = shapeFactory.getShape(ShapeType.CIRCLE);
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape(ShapeType.SQUARE);
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape(ShapeType.RECTANGLE);
		shape3.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryType.COLOR);
		
		Color color1 = colorFactory.getColor(ColorType.RED);
		color1.fill();
		
		Color color2 = colorFactory.getColor(ColorType.GREEN);
		color2.fill();
		
		Color color3 = colorFactory.getColor(ColorType.BLUE);
		color3.fill();
		
	}
}
