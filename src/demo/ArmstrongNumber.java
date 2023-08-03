package demo;

import java.util.Scanner;

/**
 * Armstrong number is number which is having the sum of cube of its digit. ex:-
 * 1,153,370,371,407...... 153 = (1*1*1) + (5*5*5) + (3*3*3)
 */

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		checkArmstrongNumber(num);

	}

	static void checkArmstrongNumber(int num) {
		int temp = num;
		int rem = 0, sum = 0;

		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			sum = sum + rem * rem * rem;

		}
		if (temp == sum) {
			System.out.println("Number is Armstrong number");
		} else {
			System.out.println("Number is not an armonstrong number");
		}

	}
}
