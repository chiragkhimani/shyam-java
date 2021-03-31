package com.java.class02;

public class E_1plus10____5plus6 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1, j = 10; i <= 5 && j >= 5; i++, j--) {

			sum = sum + i + j;
		}
		System.out.println(sum);

	}

}
