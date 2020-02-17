import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PythagoreanTriplet {

	public static void main(String[] args) {

		int a[] = { 68, 35, 1, 70, 25, 79, 59, 63, 65, 6, 46, 82, 28, 62, 92,
				96, 43, 28, 37, 92, 5, 3, 54, 93, 83, 22, 17, 19, 96, 48, 27,
				72, 39, 70, 13, 68, 100, 36, 95, 4, 12, 23, 34, 74 };
		int ar1[] = new int[a.length];

		Map<Integer, Integer> map = new HashMap();

		for (int i = 0; i < ar1.length; i++) {
			int s = a[i] * a[i];
			ar1[i] = s;
			map.put(ar1[i], s);
		}
		boolean flage = checkTriplet(ar1,map);
		if(flage){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

	private static boolean checkTriplet(int[] ar1, Map<Integer, Integer> map) {
		for (int j = 0; j < ar1.length - 1; j++) {
			
			for (int i = j + 1; i < ar1.length; i++) {
				int num = ar1[j] + ar1[i];
				boolean value = match(num, map);
				if (value) {
					//System.out.print("Yes");
					return true;
				}
			}
		}
		return false;
		
	}

	private static boolean match(int num, Map<Integer, Integer> map) {
		boolean flag = false;
		for (Entry<Integer, Integer> entry : map.entrySet()) {

			if (entry.getValue().equals(num)) {
				entry.getKey();
				flag = true;
				break;
			}
		}
		return flag;

	}
}
