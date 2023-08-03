package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurancesofChar {

	public static void main(String[] args) {

		String str = "i am an indian";

		// Approach 1- using HashMap
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] chars = str.toCharArray();
		for (char ch : chars) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				Integer cnt = map.get(ch);
				map.put(ch, cnt + 1);
			}
		}
		System.out.println(map);

		// Approach 2- using java8
		String[] split = str.split("");

		System.out.println(Arrays.toString(split));
		Map<String, Long> collect = Arrays.stream(split)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);
	}
}
