package interviewRelated;

public class TwoPointerAlgo {

	public static void main(String[] args) {
		int[] arr = {-2,-1,2,3,4,7,9};
		int k = 3;
		/*
		 * for(int i = 0; i < arr.length-1; i++) { for(int j = i+1; j < arr.length; j++)
		 * { if(arr[i]+arr[j] == k) { System.out.print("["+arr[i]+","+arr[j]+"]"); }
		 * if(arr[i]+arr[j] > k) break; } }
		 */
		
		 System.out.println(findPair(arr,k));//;

	}
	public static int findPair(int[] arr,int k) {
		int i = 0,j = arr.length-1;
		while(i<j) {
			if(arr[i]+arr[j] == k) {
				System.out.println(arr[i]+","+arr[j]);
				return 1;
			}else if(arr[i]+arr[j] > k) {
				j--;
			}else if(arr[i]+arr[j] < k) {
				i++;
			}
		}
		return 0;
	}

}
