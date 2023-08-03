package array;

public class FindEvenAndOddNumberFromString {

	public static void main(String[] args) {

		String str = "gh6436bq12g09i";

		// replace all character from string
		String replace = str.replaceAll("[^0-9]", "");
		System.out.println(replace);

		// convert string to array
		char[] chars = replace.toCharArray();
		for (char ch : chars) {
			System.out.print(ch + " ");
		}

		System.out.println("\nEven Number");
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] % 2 == 0) {
				System.out.print(chars[i] + " ");
			}
		}
		System.out.println("\nodd number print");
		for (int j = 0; j < chars.length; j++) {
			if (chars[j] % 2 == 1) {
				System.out.print(chars[j] + " ");
			}
		}
	}
}
