package java8code;

import java.util.ArrayList;
import java.util.List;

public class FindMinAndMaxFromList {

	public static void main(String[] args) {

		List<Integer> ls = new ArrayList<Integer>();
		ls.add(10);
		ls.add(14);
		ls.add(5);
		ls.add(76);
		ls.add(8);
		
		Integer minValue = ls.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(minValue);
		
		Integer maxValue = ls.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(maxValue);

	}
}

//class MyComparator implements Comparator {
//
//	@Override
//	public int compare(Object o1, Object o2) {
//		Integer i1 = (Integer) o1;
//		Integer i2 = (Integer) o2;
//		
//		return i2.compareTo(i1);
//		
//	}
