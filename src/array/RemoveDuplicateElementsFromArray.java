package array;

import java.util.HashSet;

public class RemoveDuplicateElementsFromArray {

	public static void main(String[] args) {

		int arr[] = { 2, 4, 5, 6, 2, 1, 5, 4, 4, 1, 1, 4, 7, 8 };

		//using hashset 
		HashSet<Integer> set = new HashSet<Integer>();
		for (int a : arr) {
			set.add(a);
		}
		System.out.println(set);

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
