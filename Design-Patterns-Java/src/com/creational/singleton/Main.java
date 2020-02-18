package com.creational.singleton;

public class Main {
	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		s1.setData(55);
		System.out.println(s1);
		System.out.println(s1.getData());
		
		s1 = null;
		s1 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s1.getData());
		
		Singleton s2 = Singleton.getInstance();
		s2.setData(s2.getData()+10);
		System.out.println(s2);
		System.out.println(s2.getData());
	}
}
