// This question asked in Amazon, payu, Samsung

/*Note: An element of array is leader if it is greater than or equal to all the elements to its right side. Also, the rightmost element is always a leader. 

Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N denoting the size of array.
The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.
Example:
Input:
3
6
16 17 4 3 5 2
5
1 2 3 4 0
5
7 4 5 7 3
Output:
17 5 2
4 0
7 7 3
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeaderInArray {
	public static void leaderArray(ArrayList list) {

		int i = 1, j = 0;
		int length = list.size() - 1;
		int grt = 0;
		grt = (Integer) list.get(length);

		ArrayList listOutput = new ArrayList();
		listOutput.add(grt);
		for(int index = list.size()-2; index>=0; index--){

			if ((Integer)list.get(index) >= grt) {
				grt = (Integer) list.get(index);
				listOutput.add(grt);
				i++;
				
			} else {
				i++;
				
			}

		}
		//Collections.reverse(listOutput);
		for(int o = listOutput.size()-1; o>=0; o--){
			System.out.print(listOutput.get(o)+" ");
		}
		System.out.println();
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("testcase");
		int T = sc.nextInt();
		
		int e = 1;
		while(e<=T){
			System.out.println("size of array");
			int size = sc.nextInt();
			ArrayList list = new ArrayList();
			for(int index =0; index<size; index++){
				System.out.println("elements of array");
				list.add(sc.nextInt());
			}
			
		leaderArray(list);
		e++;
		}
	}

	
}
