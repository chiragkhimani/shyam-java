package com.java.class04;

public class MethodWithReturnType {

	public static void main(String[] args) {
		

		System.out.println(getLength(937498237));

	}

	static int getLength(int num) {
		int count = 0;

		while (num > 0) {
			num = num / 10;
			count++;
		}

		return count;
	}

}
