package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Q-1) Remove the duplicate from list
 * 
 * Q-2) Find the duplicate from list
 * 
 */

public class ArrayListDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("A");
		list.add("A");
		list.add("A");
		list.add("B");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("E");
		list.add("E");
		list.add("E");

		// Approach 1 by using java8
		List<String> collect = list.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);

		// Approach 2 by using HashSet
		Set<String> set = new HashSet<String>(list);
		System.out.println(set);

		/**
		 * Q-2 find Duplicate element from list
		 */

		Map<String, Integer> count = new HashMap<String, Integer>();

		for (String str : list) {
			if (!count.containsKey(str)) {
				count.put(str, 1);
			} else {
				Integer cnt = count.get(str);
				count.put(str, cnt + 1);
			}
		}
		System.out.println(count);

		System.out.println("Duplicate Elements:");
		for (Map.Entry<String, Integer> entry : count.entrySet()) {

			if (entry.getValue() > 1) {

				System.out.print(entry.getKey() + " ");
			}

		}

//		Map<String, Long> collect2 = list.stream()
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		System.out.println(collect2);
//
//		List<String> collect3 = collect2.entrySet().stream().filter(x -> x.getValue() > 1).map(Map.Entry::getKey)
//				.collect(Collectors.toList());
//		System.out.println(collect3);
//
//		Map<String, Long> collect4 = list.stream()
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		System.out.println(collect4);
//
//		List<Long> collect5 = collect4.entrySet().stream().filter(x -> x.getValue() > 1).map(Map.Entry::getValue)
//				.collect(Collectors.toList());
	}
}
