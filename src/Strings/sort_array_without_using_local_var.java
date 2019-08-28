package Strings;

import java.util.Arrays;

public class sort_array_without_using_local_var {
	public static void main(String[] args) {
		int arr[]= {2,3,5,9,1,12,65,98,42,31,76,13};
		
		System.out.println();
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		int res[]=sort_array(arr);
		for(int i:res) {
			System.out.print(i+" ");
		}
		System.out.println();	
    }
	private static int[] sort_array(int[] arr) {
		// TODO Auto-generated method stub
		int len=arr.length;
		for(int i=0;i<len-1;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i]>arr[j]) {
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
		            arr[i]=arr[i]-arr[j];					
				}
			}
		}			
		
		return arr;
	}
}
