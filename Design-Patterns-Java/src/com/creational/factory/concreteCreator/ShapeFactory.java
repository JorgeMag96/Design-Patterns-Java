package com.creational.factory.concreteCreator;

public class ShapeFactory {
	
	public static Shape getShape(ShapeType type) {
		
		switch(type){
		case CIRCLE:
			return new Circle();
		case SQUARE:
			return new Square();
		case RECTANGLE:
			return new Rectangle();
		default:
			return null;		
		}
	}
}

enum ShapeType{
	SQUARE,
	RECTANGLE,
	CIRCLE;
}
