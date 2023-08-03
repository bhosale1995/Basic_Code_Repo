package array;

import java.util.HashMap;
import java.util.Map;

public class FindOccurancesOfArrayElement {

	public static void main(String[] args) {

		int arr[] = { 2, 4, 5, 6, 2, 1, 5, 4, 4, 1, 1, 4, 7, 8 };

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int a : arr) {
			if (!map.containsKey(a)) {
				map.put(a, 1);
			} else {
				Integer cnt = map.get(a);
				map.put(a, cnt + 1);
			}

		}
		System.out.println(map);

		//Find Duplicate element from Array
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.print(entry.getKey() + ",");
			}
		}

	}

}
