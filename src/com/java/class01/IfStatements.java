package com.java.class01;

public class IfStatements {
	public static void main(String[] args) {

		// ==================Simple IF========================
		boolean isHungry = false;

		System.out.println("1. Starting driver");

		if (isHungry) {
			System.out.println("2. Taking lunch");
		}

		System.out.println("3. Finish driving");

		// ==================IF....Else========================

		boolean isTrafficOnRoute1 = false;

		System.out.println("1. Starting driver");

		if (isTrafficOnRoute1 == true) {
			System.out.println("2. Taking Route 2");
		} else {
			System.out.println("3. Taking Route 1");
		}

		System.out.println("3. Finish driving");

		// ==================IF....Else========================

		int i = 1;

		if (i == 1) {
			System.out.println("One");
		} else if (i == 2) {
			System.out.println("Two");
		} else {
			System.out.println("N/A");
		}

		// ==================Nested IF....Else========================

		if (i == 1) {
			if (i == 10) {

			} else {

			}
		} else {

		}

	}
}
