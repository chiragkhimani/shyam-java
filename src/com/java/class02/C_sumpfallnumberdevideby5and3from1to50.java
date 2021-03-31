package com.java.class02;

public class C_sumpfallnumberdevideby5and3from1to50 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 50; i++)
			if (i % 5 == 0 && i % 3 == 0) {
				sum = sum + i;

			}
		System.out.println(sum);

	}

}
