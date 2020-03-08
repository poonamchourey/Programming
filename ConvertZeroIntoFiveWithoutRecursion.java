package ds;

import java.util.Scanner;

public class ConvertZeroIntoFiveWithoutRecursion {

	public static void main(String[] args) {

		System.out.println("Enter test cases");
		Scanner scan = new Scanner(System.in);

		int T = scan.nextInt();
		int t = 0;

		while (t < T) {
			System.out.println("Enter num");
			int num = scan.nextInt();
			
			 int n = replace(num);
			 System.out.println(n);

		}

	}

	private static int replace(int num) {
		int Num = num, count = 1;

		while (Num > 1) {
			
			if (Num % 10 == 0) {
				num = num + count* 5;
			}
			Num = Num / 10;
			count = count*10;
		}
		return num;
	}

}
