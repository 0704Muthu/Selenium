package com.stringmethods;

public class Str {

	//ctrl+2,l
	public static void main(String[] args) {

		String a="    welcome to london";
		String b="Welcome to london";
		boolean equals = a.equals(b);
		System.out.println(equals);
		boolean equalsIgnoreCase = a.equalsIgnoreCase(b);
		System.out.println(equalsIgnoreCase);
		String upperCase = a.toUpperCase();
		System.out.println(upperCase);
		char charAt = a.charAt(5);
		System.out.println(charAt);
		int indexOf = a.indexOf('o');
		System.out.println(indexOf);
		int lastIndexOf = a.lastIndexOf('o');
		System.out.println(lastIndexOf);
		String replace = a.replace("welcome", "from");
		System.out.println(replace);
		boolean startsWith = a.startsWith("m");
		System.out.println(startsWith);
		boolean contains = a.contains("com");
		System.out.println(contains);
		String trim = a.trim();
		System.out.println(trim);
		
	}
	
	
	
}
