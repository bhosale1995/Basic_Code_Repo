package demo;

import java.util.Scanner;

/**
 * @author IN01249 fibonanciSeries is a special type of series in which the next
 *         term is the sum of previous two terms. in java there is two way to
 *         find the fibonancciSeries 1) by using recursion 2) without recursion
 */

public class FibonacciSeriesUsingRecursion {

	static int n1 = 0, n2 = 1, n3;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int num = sc.nextInt();

		System.out.print(n1 + " " + n2);
		
		printFibonacci(num);
	}

	public static void printFibonacci(int num) {

		if (num > 1) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
			printFibonacci(num - 1);
		}
	}
}
