package com.java.class09;

class Phone {
	public void call() {

	}

	public void repairPhone() {
		System.out.println("Repairing Phone");
	}
}

class AndroidPhone extends Phone {

	public void repairPhone() {
		System.out.println("Repairing Android");
	}
}

class iOSPhone extends Phone {

	public void repairPhone() {
		System.out.println("Repairing iOS");
	}
}

class RepairShop {
	public void repair(Phone phone) {
		phone.repairPhone();
	}
}
