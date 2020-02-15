package com.creational.factory.concreteCreator;

public class Main {
	public static void main(String[] args) {
		Shape s1 = ShapeFactory.getShape(ShapeType.CIRCLE);
		s1.draw();
		
		Shape s2 = ShapeFactory.getShape(ShapeType.SQUARE);
		s2.draw();
	}
}
