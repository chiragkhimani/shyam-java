package com.java.class06;

public class PhoneTester {
	public static void main(String[] args) {
		Phone iPhone = new Phone();
		iPhone.ramSize = 2;
		iPhone.color = "Black";
		iPhone.numOfSim = 2;
		iPhone.model = "Apple iPhone 10";

//		iPhone.call("0832403");
		
		Phone androidPhone = new Phone();
		androidPhone.call("");
	}
}
