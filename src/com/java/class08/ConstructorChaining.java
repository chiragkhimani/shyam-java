package com.java.class08;

class A {

	A(int i) {

	}

	A(int i, int j) {

	}
}

class B extends A {

	B() {
		this(10);
	}

	B(int i) {
		super(10, 20);
	}

}

class C extends B {

	C() {

	}
}

public class ConstructorChaining {
	public static void main(String[] args) {
		C c = new C();
	}
}
