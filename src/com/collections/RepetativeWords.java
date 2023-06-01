package com.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class RepetativeWords {

	// of the people by the people for the people
	public static void main(String[] args) {
		Scanner re = new Scanner(System.in);
		System.out.println("Enter the word");
		String words = re.nextLine();
		String[] split = words.split(" ");
		// split[hello,everyone,hello,all]
		Map<String, Integer> map = new LinkedHashMap<>();
		for (String word : split) {
			if (map.containsKey(word)) {
				Integer integer = map.get(word);
				map.put(word, integer + 1);
				// hello,2
			} else {
				map.put(word, 1);

				// everyone,1
				// all,1
			}

		}
		System.out.println(map);
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("Repetative words:" + entry);
			}
		}
	}

	
}
