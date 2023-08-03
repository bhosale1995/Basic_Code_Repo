package Pattern;

public class OppositeRightAngle {

	public static void main(String[] args) {
		int i, j, k, l, m, row = 5;
		for (i = 0; i < row; i++) {
			for (j = 0; j < row - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (k = 0; k < row; k++) {
			for (l = 2 * (row - k); l > 0; l--) {
				System.out.print(" ");
			}
			for (m = 0; m <= k; m++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
