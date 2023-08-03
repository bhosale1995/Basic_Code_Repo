package string;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {

		String str = "J!av#*a)s&~t5r";
		String mainStr = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(mainStr);
	}
}
