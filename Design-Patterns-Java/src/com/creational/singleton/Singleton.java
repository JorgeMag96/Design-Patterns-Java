package com.creational.singleton;

public class Singleton {
	
	private Singleton() {};
	
	public static Singleton getInstance() {
		return SingletonHelper.uniqueInstance;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
	private static class SingletonHelper{
		
		private static final Singleton uniqueInstance = new Singleton();
	}
	
	private int data;
}
