package com.java.class07;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Car {
	static int count;
	int maxSpeed;

	Car() {
		count = count + 1;
		maxSpeed = 200;
	}

	static void printCount() {
		System.out.println(count);
	}

	public void drive() {
		System.out.println(count);
	}

	public void playMusic() {
	}

	public void pressBreak() {
	}

}
