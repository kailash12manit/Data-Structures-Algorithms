package arrays;

import java.util.HashSet;

public class distintSub_max_len {
	public static void main(String[] args) {
		int arr[]= {-1,2,-3,4,-5,5,6,-7,1,1,-2,3,4,-4,2};
		int res=findmaxLenWithDistinctInt(arr);
		System.out.println(res);
	}

	private static int findmaxLenWithDistinctInt(int []arr) {
		// TODO Auto-generated method
		int i=0,j=1,max=0,count=1;
		HashSet<Integer>hs= new HashSet<Integer>();
		hs.add(arr[0]);
		while(i<arr.length-1 && j<arr.length) {
			if(!hs.contains(arr[j])) {
				count++;
				hs.add(arr[j]);
				j++;				
			}
			else {
				
				max=Math.max(max,count);
				hs.remove(arr[i]);
				i++;
				count--;
			}
		}
		return Math.max(max,count);	
	}	
  }