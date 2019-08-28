package Strings;

import java.util.Arrays;

public class good_segment {
	public static void main(String[] args) {
	
		
		int arr[]= {37,7,22,15,49,60};
		int l=3;
		int r=48;
		
		int res=badnumber(arr,l,r);
		System.out.println(res);
		
	}

	private static int badnumber(int[] arr, int l, int r) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);	
		int Maxlen=0;
		int i=0;
		for(i=0;i<arr.length;i++) {
			if(arr[i]<l) {
				continue;
			}
			else {
				Maxlen=Math.max(Maxlen,arr[i]-1-(l+1));
				break;
			}
		}
		Maxlen++;		
		i++;
		for(int j=i;j<arr.length;j++) {
			if(arr[j]>r) {
				break;
			}
			Maxlen=Math.max(Maxlen,arr[j]-1-(arr[j-1]+1));			
		}
		Maxlen++;			
		return Maxlen;
	}
}
