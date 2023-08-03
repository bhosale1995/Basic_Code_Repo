package demo;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {

	public static void main(String[] args) {

		// by using random method
		System.out.println("Random number is" + " " + Math.random());

		// by using Random class
		Random rd = new Random();
		int a = rd.nextInt(50);
		double b = rd.nextDouble();
		float c = rd.nextFloat();
		long d = rd.nextLong();
		boolean e = rd.nextBoolean();
		boolean f = rd.nextBoolean();
		System.out.println("Random Number of int is :" + " " + a);
		System.out.println("Random number of double is:" + " " + b);
		System.out.println("Random Number of float is :" + " " + c);
		System.out.println("Random number of long is:" + " " + d);
		System.out.println("Random Number of boolean is :" + " " + e);
		System.out.println("Random Number of boolean is :" + " " + f);

		// by using ThreadlocalRandom Class
		int g = ThreadLocalRandom.current().nextInt();
		System.out.println("Random Number is : " + " " + g);
		


	}
}
