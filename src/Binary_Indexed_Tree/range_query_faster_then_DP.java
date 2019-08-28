package Binary_Indexed_Tree;

import java.util.Arrays;

//https://www.hackerearth.com/practice/notes/binary-indexed-tree-or-fenwick-tree/

public class range_query_faster_then_DP {
	public static void main(String[] args) {
		
		int n=10;
		int BIT[]=new int[10+1];
		Arrays.fill(BIT, 0);
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};	
		
		//update
		for(int i=0;i<arr.length;i++) {
			int val=arr[i];
			
			for(int k=i+1;k<=arr.length;k+=(k&-k)) {
				BIT[k]+=val;
			}			
		}	
		
		for(int kk:BIT) {
			System.out.print(kk+" ");
		}
		System.out.println();
		
		int x=5; // 0 to 5 = 6 elements
		
		int sum=0;
		for(int i=6;i>0;i-=(i&-i)) {
			sum+=BIT[i];			
		}
		System.out.println("sum upto "+x+" is [0...5 = 6] => "+sum);
				
	}	
}
