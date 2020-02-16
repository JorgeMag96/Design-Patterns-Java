package com.creational.abstractFactory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(FactoryType factory) {
		switch(factory) {
		case SHAPE:
			return new ShapeFactory();
		case COLOR:
			return new ColorFactory();
		default:
			return null;
		}
		
	}
}
