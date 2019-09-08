import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// This question asked in Amazon, payu, Samsung
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
