package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionLists {

	
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();//up casting
//		System.out.println(list);
//		boolean empty = list.isEmpty();
//		System.out.println(empty);
//		list.add(12);
//		list.add("java");
//		list.add(30);
//		list.add(20);
//		System.out.println(list);
//		boolean empt = list.isEmpty();
//		System.out.println(empt);
//		int size = list.size();
//		System.out.println(size);
//		int indexOf = list.indexOf(20);
//		System.out.println(indexOf);
//		int lastIndexOf = list.lastIndexOf(20);
//		System.out.println(lastIndexOf);
//		Object integer = list.get(1);
//		System.out.println(integer);
//		list.set(0, "python");
//		System.out.println(list);
//		list.remove(2);
//		System.out.println(list);
//		boolean contains = list.contains("python");
//		System.out.println(contains);
////		list.clear();
//		System.out.println(list);

		
		List<Object> list2 = new ArrayList<>();
		list2.add(12);
		list2.add(20);
		list2.add("c++");
//		list.addAll(list2);
//		System.out.println(list);
//		list.retainAll(list2);
		System.out.println(list2);
		Collections.reverse(list2);
		Collections.rotate(list2, 1);
		System.out.println(list2);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
