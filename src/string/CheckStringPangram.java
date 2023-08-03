package string;

public class CheckStringPangram {

	public static void main(String[] args) {

		String str = "abcdefghijklmnopqrstuvwxyz";

		System.out.println(str.length());
		boolean unique = true;
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (!str.contains(String.valueOf(ch))) {
				unique = false;
				break;
			}
		}
		if (unique)
			System.out.println("string is pangram..!!");
		else {
			System.out.println("String is not pangram..!!");
		}
	}

}
