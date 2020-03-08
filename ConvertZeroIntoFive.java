package ds;

import java.util.Scanner;

public class ConvertZeroIntoFive {

	public static void main(String[] args) {

		System.out.println("Enter test cases");
		Scanner scan = new Scanner(System.in);

		int T = scan.nextInt();
		int t = 0;

		while (t < T) {
			System.out.println("Enter num");
			int num = scan.nextInt();
			replaceNum(num);

		}

	}

	private static void replaceNum(int num) {
		int numver = replace(num);
		System.out.println(numver);
	}

	private static int replace(int Num) {
		

	if (Num > 1) {
			int rem = Num%10;
			if (rem == 0) {
				 rem = 5;
			}
			Num = Num / 10;
			 int r= replace(Num);
			 Num=r*10+rem;
		}
		
		return Num;
	}

}
