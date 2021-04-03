package com.java.class04;

import java.util.Scanner;

public class Method {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		printLin(50, '='); // method call
		System.out.println("enter first number");
		int num1 = sc.nextInt();
		printLin(30,'*');
		System.out.println("enter second number");
		int num2 = sc.nextInt();
		sc.nextLine();
		printLin(100,'=');
		System.out.println("enter operation you want to perfomr");
		String operation = sc.nextLine();
		printLin(60,'#');

		switch (operation) {
		case "add":
			System.out.println(num1 + num2);
			break;
		case "sub":
			System.out.println(num1 - num2);
			break;
		case "mul":
			System.out.println(num1 * num2);
			break;

		default:
			break;
		}
	}

	// Method Definition
	static void printLin(int limit, char c) {
		for (int i = 1; i <= limit; i++) {
			System.out.print(c);
		}
		System.out.println();
	}

}
