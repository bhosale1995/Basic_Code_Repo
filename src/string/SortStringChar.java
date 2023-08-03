package string;

import java.util.Arrays;
import java.util.Scanner;

public class SortStringChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();

		// Approach-1 without using sort method
		char temp;
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		System.out.println(new String(arr));

		// Approach-2 using sort method
		char[] arr1 = str.toCharArray();
		Arrays.sort(arr1);
		System.out.println(new String(arr1));
	}

}
