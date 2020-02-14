package com.creational.factory.staticMethodCreator;

public class ShapeFactory {
	
	public static Shape getShape(Shapetype shapetype) {
		
		switch(shapetype) {
		case CIRCLE:
			return new Circle();
		case RECTANGLE:
			return new Rectangle();
		case SQUARE:
			return new Square();
		default:
			return null;
		}
		
	}
	
	enum Shapetype{
		CIRCLE,
		RECTANGLE,
		SQUARE;
	}
}