package demo;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();

		checkPalindrome(num);

	}

	public static void checkPalindrome(int num) {

		int temp = num;
		int rem = 0, sum = 0;

		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			sum = (sum * 10) + rem;
		}
		if (temp == sum) {
			System.out.println("Number is Palindrome.");
		} else {
			System.out.println("Number is not Palindrome.");
		}
	}
}
