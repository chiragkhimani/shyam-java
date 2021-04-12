package com.java.class08;

class RBIBank {
	private int accoutNumber;
	int balance;
	
	public int getAccountNumber() {
		return accoutNumber;
	}

	public void deposit(int amount) {
		balance = balance + amount;
	}

	public void withdraw(int amount) {
		balance = balance - amount;
	}
}

class HSBCBank extends RBIBank {
	
}

public class Car{
	public static void main(String[] args) {
		HSBCBank b = new HSBCBank();
	}
}