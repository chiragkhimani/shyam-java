package com.java.class02;

public class F {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {

			sum = sum + i;
			if (i % 3 == 0)
				sum = sum - i * 2;

		}
		System.out.println(sum);
	}
}
