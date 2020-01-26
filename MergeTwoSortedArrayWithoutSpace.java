/*package whatever //do not write package name here */

/*Given two sorted arrays arr1[] and arr2[] in non-decreasing order with size n and m. 
 * The task is to merge the two sorted arrays into one sorted array (in non-decreasing order).
 * Input: arr1[] = {1, 5, 9, 10, 15, 20};
 arr2[] = {2, 3, 8, 13};
 Output: arr1[] = {1, 2, 3, 5, 8, 9}
 arr2[] = {10, 13, 15, 20} */
import java.util.*;
import java.io.*;

class MergeTwoSortedArrayWithoutSpace {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		// System.out.println("enter test case size");
		int T = s.nextInt();
		int tSize = 0;
		while (tSize < T) {

			// System.out.println("enter first array size");
			int size1 = s.nextInt();
			// System.out.println("enter second array size");
			int size2 = s.nextInt();
			// size exchange...
			if (size2 < size1) {
				int te = size2;
				size2 = size1;
				size1 = te;
			}
			int arr1[] = new int[size1];
			int arr2[] = new int[size2];

			for (int i = 0; i < size1; i++) {
				// System.out.println("enter ele array ");
				arr1[i] = s.nextInt();
			}
			for (int i = 0; i < size2; i++) {
				// System.out.println("enter ele array ");
				arr2[i] = s.nextInt();
			}
			for (int i = 0; i < arr1.length; i++) {
				int j = 0;
				if (arr1[i] > arr2[j]) {
					int t = arr1[i];
					arr1[i] = arr2[j];
					arr2[j] = t;
					// comparing second array elements...
					while (j < arr2.length - 1) {
						if (arr2[j] > arr2[j + 1]) {
							int temp = arr2[j + 1];
							arr2[j + 1] = arr2[j];
							arr2[j] = temp;
							j++;
						} else {
							break;
						}
					}
				}
			}
			PrintWriter pw = new PrintWriter(System.out);
			for (int p = 0; p < arr1.length; p++) {
				pw.print(arr1[p]);
				pw.print(" ");
				pw.flush();
				// System.out.print(arr1[p]+" ");
			}
			for (int p = 0; p < arr2.length; p++) {
				pw.print(arr2[p]);
				pw.print(" ");
				pw.flush();
				// System.out.print(arr2[p]+" ");
			}
			tSize++;
			System.out.println();
		}
	}
}