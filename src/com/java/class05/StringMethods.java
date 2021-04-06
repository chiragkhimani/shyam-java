package com.java.class05;

public class StringMethods {
	public static void main(String[] args) {
		String str = "Java";
		String str1 = "java";
		String titleOfWeb = "Welcome Chirag!";
		String username = "Chirag";

		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(titleOfWeb.contains(username));

		System.out.println(titleOfWeb.toUpperCase());
		System.out.println(titleOfWeb.toLowerCase());
		System.out.println(titleOfWeb.charAt(0));
		System.out.println(titleOfWeb.indexOf("come"));

		System.out.println(titleOfWeb.substring(3, 7));
		System.out.println(titleOfWeb.substring(3));
		
		System.out.println(titleOfWeb.length());

	}
}
