package demo;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();

		for (int i = 2; i <= num/2; i++) {

			if (num % i == 0) {
				flag = true;
				break;
			}
		}

		if (flag == false) {
			System.out.println(num + " " + "is a prime number");
		} else {
			System.out.println(num + " " + " is not a prime number");
		}

	}
}
