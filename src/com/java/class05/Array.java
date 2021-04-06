package com.java.class05;

public class Array {

	public static void main(String[] args) {
		int marks[] = new int[160];
		int data[] = { 34, 435, 7, 344, 65, 8, 3, 65, 8734, 3 };

		int table[][] = { { 1, 2, 4 }, { 6, 3, 7 }, { 35, 2, 25 }, { 74, 24, 65 } };

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j]+" ");
			}
			System.out.println();
		}

//		for (int i = 0; i < marks.length; i++) {
//			System.out.println(marks[i]);
//		}

	}

}
