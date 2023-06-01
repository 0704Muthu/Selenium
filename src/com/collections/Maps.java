package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maps {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		System.out.println(map);
		map.put(1, "Muthu");
		map.put(2, "guru");
		map.put(3, "Mani");
		map.put(1, "Bala");
		System.out.println(map);
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		for (Integer integer : keySet) {
			System.out.println(integer);
		}
		Collection<String> values = map.values();
		System.out.println(values);
		for (String string : values) {
			System.out.println(string);
		}
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		System.out.println(entrySet);
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
	}
	
}
