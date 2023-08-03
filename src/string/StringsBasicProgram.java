package string;

import java.util.Arrays;
import java.util.HashSet;

public class StringsBasicProgram {

	public static void main(String[] args) {

		/**
		 * 1) get character from string
		 */
		String str = "I love india";

		System.out.println(str.length());
		System.out.println(str.indexOf('i'));

		/**
		 * 2) update character from string
		 */
		System.out.println(str.substring(0, 4) + 'a' + str.substring(4 + 1));

		/**
		 * 3) reverse string
		 */
		// Approach-1 using charAt() method
		String str1 = "akshay";
		for (int i = str1.length() - 1; i >= 0; i--) {
			System.out.print(str1.charAt(i));
		}

		System.out.println();

		// Approach-2 using reverse method of StringBuffer class
		StringBuffer sb = new StringBuffer(str1);
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);

		/**
		 * 3) sort string
		 */
		// Approach-1 using sort method
		char[] charArray = str1.toCharArray();
		Arrays.sort(charArray);
		System.out.println(charArray);

		// Approach-2 Without using sort method
		char temp;
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] > charArray[j]) {
					temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;
				}
			}
		}
		System.out.println(charArray);

		/**
		 * 4) swap pairs of character
		 */

		String string = "bhosale";

		char[] ch = string.toCharArray();
		char temp1;
		for (int i = 0; i < ch.length - 1; i += 2) {
			temp1 = ch[i];
			ch[i] = ch[i + 1];
			ch[i + 1] = temp1;
		}
		System.out.println(ch);

		/**
		 * 5) insert string into another string
		 */

		String str2 = "Mumbai";

		char[] charArray2 = str2.toCharArray();

		for (int i = charArray2.length - 1; i >= 0; i--) {
		System.out.println(str2.charAt(i));
		}
		

		System.out.println("/n new line");
		StringBuffer sb1 = new StringBuffer(str2);
		System.out.println(sb1);

		int[] arr = { 1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5 };

		HashSet set = new HashSet();
		for (int a : arr) {
			set.add(a);
		}
		System.out.println(set);

	}
}
