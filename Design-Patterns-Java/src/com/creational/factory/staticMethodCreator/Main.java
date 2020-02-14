package com.creational.factory.staticMethodCreator;

import com.creational.factory.staticMethodCreator.ShapeFactory.Shapetype;

public class Main {
	public static void main(String[] args) {
		
		Shape s1 = ShapeFactory.getShape(Shapetype.CIRCLE);
		s1.draw();
		
		Shape s2 = ShapeFactory.getShape(Shapetype.RECTANGLE);
		s2.draw();
		
		Shape s3 = ShapeFactory.getShape(Shapetype.SQUARE);
		s3.draw();
		
	}
}
