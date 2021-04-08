package com.java.class06;

public class Bank {
	int accoutNumber;
	String accName;
	int balance;

	public void deposit(int amount) {
		System.out.println("Depositing in" + accName + " Account " + " amount " + amount);
		balance = balance + amount;
	}

	public void withdraw(int amount) {
		balance = balance - amount;
	}

	public void showBalance() {
		System.out.println(balance);
	}
}
