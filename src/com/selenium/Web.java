package com.selenium;

import java.util.ArrayList;
import java.util.List;

public class Web {
	public static void main(String[] args) {
		String a ="Hi this is muthukumar";
		String[] split = a.split(" ");
		String reverse = "";
		List<String> list = new ArrayList<>();
		for (String string : split) {
			list.add(string);

		}


		for (int i = 0; i < list.size()-3; i++) {
			String string = list.get(i);
			char[] charArray = string.toCharArray();
			for (int j = charArray.length-1; j >=0 ; j--) {
				reverse=reverse+charArray[j];
			}

		}


	}
}
