/*Given a String of length S, reverse the whole string without reversing the individual words in it. Words are separated by dots.
 * Example:
Input:
2
i.like.this.program.very.much
pqr.mno

Output:
much.very.program.this.like.i
mno.pqr*/
import java.util.Scanner;

public class ReverseWordsOfString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		int j = 0;
		while (j < testCase) {
			String str = scan.nextLine();
			reversString(str);
			System.out.println();
			j++;
		}
	}

	private static void reversString(String s) {
		String[] list = s.split("\\.");

		for (int i = 0; i < list.length / 2; i++) {
			String temp = list[i];
			list[i] = list[list.length - 1 - i];
			list[list.length - 1 - i] = temp;
		}
		for (int k = 0, l = 1; k < list.length; k++, l++) {
			System.out.print(list[k]);
			if (l < list.length) {
				System.out.print(".");
			}
		}
	}
}
