package com.java.class09;

class Bank {
	private int balance;
	int age;
	String phone;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void deposite(int amount) {
		balance = balance + amount;
	}

}

public class Encapsulation {
	public static void main(String[] args) {
		Bank acc = new Bank();
		System.out.println(acc.getBalance());

	}
}
