package string;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		String str = "  we l com e t o pun e  ";

		String replaceAll = str.replaceAll("\\s", "");

		System.out.println(replaceAll);

	}

}
