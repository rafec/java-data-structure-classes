package com.project.attributionreference;

public class Main {
	public static void main(String [] args) {
		int intA = 1;
		int intB = intA;
		
		System.out.println("intA = " + intA + " intB = " + intB);
		intA = 2;
		System.out.println("intA = " + intA + " intB = " + intB);
		
		MyObject objectA = new MyObject(1);
		MyObject objectB = objectA;
		System.out.println("objectA = " + objectA + " objectB = " + objectB);
	}
}
