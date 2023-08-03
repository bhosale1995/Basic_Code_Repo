package string;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Welcome to Pune..!!";

		// Approach-1 used toCharArray() method

		char[] charArray = str.toCharArray();// [h e l l 0]

		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}

		// Approach-2 used charAt() method
		System.out.println("");
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		// Approach-3 used StringBuilder class
		System.out.println("");
		StringBuilder sb = new StringBuilder(str);
		System.out.println("reverse String : " + sb.reverse());

		// Approach-4 used StringBuffer class
		StringBuffer sbuff = new StringBuffer(str);
		System.out.println("reverse String : " + sbuff.reverse());
	}
}
