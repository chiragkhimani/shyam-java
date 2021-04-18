package com.java.class09;

class RBIBank {
	public void displayInterest() {
		System.out.println("5.0");
	}
}

class HSBCBank extends RBIBank {

	@Override
	public void displayInterest() {
		System.out.println("3.0");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		HSBCBank acc = new HSBCBank();

		acc.displayInterest();
	}
}
