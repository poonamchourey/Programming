//  Company: Accolite, Amazon, D-E shaw, FactSet, MakeMyTrip, Microsoft,  Nagarro, samsung.           
 
/*Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears more than N/2 times in the array.

Input:  
The first line of the input contains T denoting the number of testcases. The first line of the test case will be the size of array and second line will be the elements of the array.

Output: 
For each test case the output will be the majority element of the array. Output "-1" if no majority element is there in the array.
Example:
Input:
2
5
3 1 3 3 2
3
1 2 3

Output:
3
-1

Explanation:
Testcase 1: Since, 3 is present more than N/2 times, so it is the majority element.*/
//Not submitted yet, Exception in thread "main" java.lang.NumberFormatException: For input string: "3 1 3 3 2"
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class MajorElement{
	public static void main(String args[]){ 
		Scanner scanner  = new Scanner(System.in);
		System.out.println("test case");
		int T = scanner.nextInt();
		int n = 1;
		while(n<=T){
			int result = -1;
			HashMap<Integer,Integer> map = new HashMap();
			System.out.println("tsize");
			int size = scanner.nextInt();
			for(int i = 0; i<size; i++){
				System.out.println("element");
				 int mapKey = scanner.nextInt();
				 int mapValue=0;
				 if(map.containsKey(mapKey)){
					 mapValue+=1;
					 map.put(mapKey, mapValue);
				 }	
				 else{
					 map.put(mapKey, 1);
				 }
			}
			Set<Integer> set= new HashSet();
			set = map.keySet();
			for(Integer x :set){
				if(map.get(x)>size/2){
					result  = x;
					break;
				}
				
			}
			System.out.println(result);
		}
	}
}
