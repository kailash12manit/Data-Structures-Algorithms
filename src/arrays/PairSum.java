package arrays;

import java.util.HashSet;

//given array , find the pair which sum to given X
public class PairSum {
	public static void main(String[] args) {
		int A[] = {1, 4, 45, 6, 10, 8,8,3,2,9,7}; 
        int n = 16; 
        printpairs(A,  n); 
	}

	private static void printpairs(int[] arr, int sum) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			int temp=sum-arr[i];
			if(hs.contains(temp)) {
				System.out.println(arr[i]+" "+temp);
				
			}
			hs.add(arr[i]);
		}		
	}	
}
