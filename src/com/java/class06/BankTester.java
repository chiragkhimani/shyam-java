package com.java.class06;

public class BankTester {
	public static void main(String[] args) {
		Bank hsbcAcc1 = new Bank();
		Bank hsbcAcc2 = new Bank();

		hsbcAcc1.accName = "Chirag";
		hsbcAcc1.accoutNumber = 23423;
		hsbcAcc1.balance = 1000;

		hsbcAcc1.showBalance();
		hsbcAcc1.deposit(400);
		hsbcAcc1.showBalance();

		hsbcAcc2.accName = "Shyam";
		hsbcAcc2.accoutNumber = 2355235;
		hsbcAcc2.balance = 5000;

		hsbcAcc2.showBalance();
		hsbcAcc2.withdraw(4000);
		hsbcAcc2.showBalance();

	}
}
