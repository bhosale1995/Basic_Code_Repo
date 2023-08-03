package string;

import java.util.Scanner;

public class CheckStringIsPalindromeOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		palindromeString(str);
	}

	static void palindromeString(String str) {

		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		if (str.equals(reverse)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}

}
