package demo;

import java.util.Scanner;

/**
 * Fibonacci series are series of number in which the fist two term is 0 and 1
 * and rest term is sum of previous two term. ex:- 0,1,1,2,3,5,8,13......
 */
public class FibonacciSeriesWithoutRecursoin {

	public static void main(String[] args) {

		int n1 = 0, n2 = 1, n3, i;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter  Number : ");

		int num = sc.nextInt();

		System.out.print(n1 + " " + n2);

		for (i = 2; i < num; i++) {

			n3 = n1 + n2;

			System.out.print(" " + n3);

			n1 = n2;
			n2 = n3;
		}
	}
}
