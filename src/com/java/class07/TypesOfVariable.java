package com.java.class07;

public class TypesOfVariable {

	static int i;

	public static void main(String[] args) {
		sum(i);
		System.out.println(i);

	}

	static void sum(int i) {
		i = 50;
	}
}
