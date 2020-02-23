package com.creational.builder;

import java.util.LinkedList;

public class Product {
	private LinkedList<String> parts;
	
	public Product() {
		parts = new LinkedList<String>();
	}
	
	public void add(String part) {
		parts.add(part);
	}
	
	public void show() {
		System.out.println("\n Product completed as below");
		
		parts.forEach(System.out::println);
	}
}
