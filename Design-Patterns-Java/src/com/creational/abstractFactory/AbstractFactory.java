package com.creational.abstractFactory;

public abstract class AbstractFactory {
	
	abstract Color getColor(ColorType color);
	abstract Shape getShape(ShapeType shape);
	
}

enum FactoryType{
	SHAPE,
	COLOR;
}

class ShapeFactory extends AbstractFactory{	

	@Override
	Shape getShape(ShapeType shape) {
		
		switch(shape){
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
	
	@Override
	Color getColor(ColorType color) {	
		return null;
	}
	
}

class ColorFactory extends AbstractFactory{

	@Override
	Color getColor(ColorType color) {
		
		switch(color){
		case RED:
			return new Red();
		case GREEN:
			return new Green();
		case BLUE:
			return new Blue();
		default:
			return null;		
		}
	}

	@Override
	Shape getShape(ShapeType shape) {
		return null;
	}
	
}