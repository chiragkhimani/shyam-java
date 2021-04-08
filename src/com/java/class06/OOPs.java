package com.java.class06;

class Phone {

	int ramSize;
	String color;
	String model;
	int numOfSim;

	void call(String phoneNumber) {
		System.out.println("Calling from ");
		System.out.println("ramSize " + ramSize);
		System.out.println("color " + color);
		System.out.println("model " + model);
		System.out.println("numOfSim " + numOfSim);
	}

	void text(String phoeNumber, String text) {
		System.out.println("Texting from ");
		System.out.println("ramSize " + ramSize);
		System.out.println("color " + color);
		System.out.println("model " + model);
		System.out.println("numOfSim " + numOfSim);
	}

}
