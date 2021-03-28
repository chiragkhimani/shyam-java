package com.java.class01;

public class SwitchStatement {
	public static void main(String[] args) {
		int daysOfWeek = 1;

		switch (daysOfWeek) {
		default:
			System.out.println("No valid value");
			break;
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tue");
			break;
		case 3:
			System.out.println("Wedday");
			break;
		case 4:
			System.out.println("Thurday");
		}

	}
}
