package com.selenium;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SET {

	
	public static void main(String[] args) {
		Set<Object> set  = new LinkedHashSet<>();
		set.add("10");
		set.add("20");
		Iterator<Object> iterator = set.iterator();
		while(iterator.hasNext()) {
			Object next = iterator.next();
			System.out.println(next);
		}
	}
}
