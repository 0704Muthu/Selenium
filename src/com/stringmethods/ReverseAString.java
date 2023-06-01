package com.stringmethods;

import java.util.Iterator;

public class ReverseAString {

	public static void reverse() {
		String words="MOm";
		String[] split=words.split("");
		//split[W,e,l,c,o,m,e, t,o, l,o,n,d,o,n]
		String reverse="";

		for (int i = split.length-1; i >=0; i--) {
			reverse=reverse+split[i];
		}

		if (words.equalsIgnoreCase(reverse)) {
			System.out.println("Its a Palendrome");
		} else {
			System.out.println("Not a palendrome");
		}
	}
	



}
