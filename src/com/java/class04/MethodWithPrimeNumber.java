package com.java.class04;

public class MethodWithPrimeNumber {
	public static void main(String[] args) {

		for (int i = 1111; i <= 9999; i++) {
			System.out.println(getReverse(i));
		}

	}

	static int getReverse(int num) {
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		return rev;
	}

	static boolean isPrime(int num) {
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			return true;
		}
		return false;
	}
}
