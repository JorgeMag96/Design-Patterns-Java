package com.creational.builder;

public class Client {
	public static void main(String[] args) {
		System.out.println("** Builder Pattern Demo***\n");
		
		Director director = new Director();
		
		BuilderInterface carBuilder = new Car();
		BuilderInterface motorcycleBuilder = new Motorcycle();
		
		// Making a car
		director.construct(carBuilder);
		Product p1 = carBuilder.getProduct();
		p1.show();
		
		// Making a motorcycle
		director.construct(motorcycleBuilder);
		Product p2 = motorcycleBuilder.getProduct();
		p2.show();
	}
}
