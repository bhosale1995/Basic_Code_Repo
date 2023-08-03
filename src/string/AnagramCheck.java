package string;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Anagram string means both string's character are same
 */
public class AnagramCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str1 = sc.nextLine();
		System.out.print("Enter a String: ");
		String str2 = sc.nextLine();
		System.out.println(checkAnagram(str1, str2));
	}

	static boolean checkAnagram(String str1, String str2) {
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean out = Arrays.equals(c1, c2);
		return out;

	}
}
