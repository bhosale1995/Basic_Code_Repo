package string;

import java.util.Arrays;

public class PrintFirstLetterOfString {

	public static void main(String[] args) {

		String str = "welcome to pune..!!";

		String[] split = str.split("\\s");
		System.out.println(Arrays.toString(split));
		StringBuffer sb = new StringBuffer();
		for (String st : split) {
			sb.append(st.charAt(0));
		}
		System.out.println(sb);


              
        
		String str2 = "00000123445600";
		int ind = 0;
		for (int i = 0; i < str2.length(); i++) {
			char ch = str2.charAt(i);
			if (ch != '0') {
				ind = i;
				break;
			}

		}
		String substring = str2.substring(ind, str2.length());
		System.out.println(substring);

	}
}
