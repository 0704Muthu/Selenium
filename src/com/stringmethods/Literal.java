package com.stringmethods;

public class Literal extends ReverseAString {


	private void  types() {
		/**
		 * 
		 * Find a String memory
		 * 1.Immutable
		 * 2.Mutable
		 * 
		 */
		
		System.out.println("-----Im mutable--");
		String inp1="John";
		String inp2="John";
		String concat = inp2.concat(inp1);
		System.out.println(System.identityHashCode(inp1));
		System.out.println(System.identityHashCode(inp2));
		System.out.println(System.identityHashCode(concat));
		System.out.println("----Mutable--");
		StringBuffer str = new StringBuffer("John");
		StringBuffer str2 = new StringBuffer("John");
		StringBuffer append = str.append(str2);
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(append));
		int a=10;
	}
	
	public static void main(String[] args) {
		
		ReverseAString ref = new Literal();//up casting
		ref.reverse();
		
		//Literal re = (Literal) new ReverseAString();//Down casting
		Literal re = (Literal) ref;//narrowing
		re.types();
	}









}
