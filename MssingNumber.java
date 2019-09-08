// Company name: Accolite, Adobe, Amazon, Cisco, D-E shaw, Intuit, Microsoft, Morgan Stanley, Ola Cabs, Palu, Qualcomm, visa. 
/*Given an array C of size N-1 and given that there are numbers from 1 to N with one element missing, the missing number is to be found.
Input:
The first line of input contains an integer T denoting the number of test cases. For each test case first line contains N(size of array). The subsequent line contains N-1 array elements.

Example:
Input:
2
5
1 2 3 5
10
1 2 3 4 5 6 7 8 10

Output:
4
9

Explanation:
Testcase 1: Given array : 1 2 3 5. Missing element is 4.
*/
//Submitted 

import java.util.*;
import java.lang.*;
import java.io.*;

public class MssingNumber {
    public static int missingNumber(int C[], int size){
	    int sum = 0;
	    for(int i = 1; i<=size;i++){
	       sum=sum+i;
	    }
        int total = sum;
	    for(int j = 0; j<size-1;j++){
	        total = total-C[j];
	    }
	    return total;
    }
	public static void main(String[] args) {
	//	System.out.println("Enter the test case");
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int n = 1;

		
		for(int j=0; j<T;j++){
		//	System.out.println("Enter the size of array");
		    int	size = scanner.nextInt();
			int C[] = new int[size];

			for (int i = 0; i < size - 1; i++) {
			//	System.out.println("Enter element");
				C[i] = scanner.nextInt();
			}
			
			 System.out.println(missingNumber(C, size));
			}
		}
}

