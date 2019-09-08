//Company : Accolite, adove, Amazon, Hike, zoho
/*Given an array A of N positive numbers. The task is to find the position where equilibrium first occurs in the array. Equilibrium position in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

Input:
The first line of input contains an integer T, denoting the number of test cases. Then T test cases follow. First line of each test case contains an integer N denoting the size of the array. Then in the next line are N space separated values of the array A.

Output:
For each test case in a new  line print the position at which the elements are at equilibrium if no equilibrium point exists print -1.
Example:
Input:
2
1
1
5
1 3 5 2 2

Output:
1
3

Explanation:
Testcase 1: Since its the only element hence its the only equilibrium point.
Testcase 2: For second test case equilibrium point is at position 3 as elements below it (1+3) = elements after it (2+2).*/

import java.util.Scanner;

public class EquilibriumPoint {

	public static int Equilibrium(int array[], int index) {
		int sumLeft = 0, sumRight = 0, EPoint = -1;

		for (int i = 0; i < index; i++) {
			sumLeft = sumLeft + array[i];
		}
		for (int j = index + 1; j < array.length; j++) {
			sumRight = sumRight + array[j];
		}
		if (sumLeft == sumRight) {
			EPoint = index;
		}
		return EPoint;
	}

	public static void main(String args[]) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Eneter the test cases:");
			int T = scanner.nextInt();
			int array[] = null;
			for(int i = 0; i<T; i++){
				System.out.println("Eneter the size of array");
				int size = scanner.nextInt();
				array = new int[size];
				for(int element = 0; element<size; element++){
					System.out.println("Eneter the elements:");
					array[element] = scanner.nextInt();
				}
				if(array.length<2){
				    System.out.println("1");
				}
					int count= 0;
			for(int arrayIndex = 1; arrayIndex < array.length-1; arrayIndex++){
				int point = Equilibrium( array, arrayIndex);
				if(point !=-1){
					System.out.println(point+1);
					break;
				}
				count ++;
				
			}
			if(count==array.length-2){
			    System.out.println("-1");
			}
			}
			//int array[]= {1, 3, 5, 2, 2};
		
			
		}
}
