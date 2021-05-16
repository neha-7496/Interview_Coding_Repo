//if two elements are at equally close to zero and differ in sign then choose positive element
package number_series;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class closestToZero {
	public static void main(String args[]) {
		int arr[] = {1,3,-90,5,17,-1};
		int arrNew[] = new int[arr.length];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0;i <arr.length;i++) {
			arrNew[i] = Math.abs(arr[i]);
			if(arr[i] < 0) {
				map.put(arrNew[i], arr[i]);
			}
		}
		
		int val = findClosest(arrNew);
		if (map.containsKey(val)) {
			if(arrNew[0] == arrNew[1]) {
				System.out.println(arrNew[0]);
			}else {
				System.out.println(map.get(val));
			}
			
		}else {
			System.out.println(val);
		}
		
	}
	public static int findClosest(int arr[]) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		return arr[0];
	}

}
