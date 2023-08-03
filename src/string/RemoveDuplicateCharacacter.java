package string;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacacter {

	public static void main(String[] args) {

		String str = "programming";
		// Approach-1 using java-8
		StringBuilder sb1 = new StringBuilder();
		str.chars().distinct().forEach(c -> sb1.append((char) c));
		System.out.println(sb1);

		// Approach-2 using charAt()
		StringBuffer sb2 = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int idx = str.indexOf(ch, i + 1);
			if (idx == -1) {
				sb2.append(ch);
			}
		}
		System.out.println(sb2);

		// Approach-3 using toCharArray()
		StringBuilder sb3 = new StringBuilder();
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			boolean repeated = false;
			for (int j = i + 1; j < str.length(); j++) {
				if (charArray[i] == charArray[j]) {
					repeated = true;
					break;
				}
			}
			if (!repeated) {
				sb3.append(charArray[i]);
			}
		}
		System.out.println(sb3);

		// Approach-4 using set interface
		StringBuilder sb4 = new StringBuilder();
		Set<Character> set = new HashSet<Character>();

		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		for (Character c : set) {
			sb4.append(c);
		}
		System.out.println(set);

	}
}
