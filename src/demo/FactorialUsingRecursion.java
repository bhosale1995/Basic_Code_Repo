package demo;

import java.util.Scanner;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		factorial(num);
		System.out.println("Factorial of"+ " " + num + " " + "is" + " " + factorial(num));
	}

	public static int factorial(int num) {

		if (num == 0)
			return 1;
		else
			return (num * factorial(num - 1));
	}
}
