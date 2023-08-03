package array;

import java.util.ArrayList;

public class ArrayCodes {

	public static void main(String[] args) {

		ArrayList<Object> al = new ArrayList<>();
		al.add(10);
		al.add("Akshay");
		al.add(10.5);
		al.add('a');
		System.out.println(al);

		al.remove(2);
		System.out.println(al);

		Object object = al.get(1);
		System.out.println(object);

		al.set(2, "b");
		System.out.println(al);

	}

}
