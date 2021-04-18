package com.java.class09;


public class Demo {
	public static void main(String[] args) {
		AndroidPhone samSung = new AndroidPhone();
		iOSPhone iPhone = new iOSPhone();
		
		
		RepairShop rs = new RepairShop();
		rs.repair(iPhone);
	}
}
