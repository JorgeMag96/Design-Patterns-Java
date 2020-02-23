package com.creational.builder;

public class Director {
	
	public void construct(BuilderInterface builder) {
		builder.buildBody();
		builder.insertWheels();
		builder.addHeadLights();
	}
	
}
