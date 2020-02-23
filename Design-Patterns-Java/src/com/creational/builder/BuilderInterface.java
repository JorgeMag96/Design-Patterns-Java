package com.creational.builder;

interface BuilderInterface {
	void buildBody();
	void insertWheels();
	void addHeadLights();
	Product getProduct();
}

class Car implements BuilderInterface{
	private Product product = new Product();

	@Override
	public void buildBody() {
		product.add("This is a body of a car");
		
	}

	@Override
	public void insertWheels() {
		product.add("4 wheels added");		
	}

	@Override
	public void addHeadLights() {
		product.add("2 headlights added");		
	}

	@Override
	public Product getProduct() {	
		return product;
	}		
}

class Motorcycle implements BuilderInterface{
	private Product product = new Product();	
	
	@Override
	public void buildBody() {
		product.add("This is a motorcycle body");
	}

	@Override
	public void insertWheels() {
		product.add("2 wheels added");		
	}

	@Override
	public void addHeadLights() {
		product.add("1 headlight added");
	}

	@Override
	public Product getProduct() {
		return product;
	}
	
}
