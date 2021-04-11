package com.java.class07;

public class Bank {
	int accoutNumber;
	String accName;
	int balance;

	Bank() {
		System.out.println("No arg constructor");
	}

	Bank(String accNameFromUser, int balance) {
		accName = accNameFromUser;

	}

	public void deposit(int amount) {
		System.out.println("Depositing in " + accName + " Account " + " amount " + amount);
		balance = balance + amount;
	}

	public void withdraw(int amount) {
		balance = balance - amount;
	}

	public void showBalance() {
		System.out.println(balance);
	}
}
