package string;

import java.util.Scanner;

public class ReverseWordString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();

		
		String output = "";

		String[] words = str.split(" ");

		for (String word : words) {
			String reverse = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				reverse = reverse + word.charAt(i);
			}
			output = output + reverse + " ";
		}
		System.out.println(output);
	}
}
