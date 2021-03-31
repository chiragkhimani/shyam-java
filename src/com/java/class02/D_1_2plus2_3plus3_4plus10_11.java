package com.java.class02;

public class D_1_2plus2_3plus3_4plus10_11 {
	public static void main(String[] args) {
		double sum = 0;
		for (double i = 1; i <= 11; i++) {
			sum = sum + i / (i + 1);
		}
		System.out.println(sum);
	}

	// 123 -->3,2,1 (1+2+3

}
