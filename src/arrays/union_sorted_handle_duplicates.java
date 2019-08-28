package arrays;

public class union_sorted_handle_duplicates {
	public static void main(String[] args) {
		int []arr = {1,4,6,8,8,8,8,9,21,24,45};
		int []brr = {3,6,7,9};
		System.out.print("arr[] : ");
		for(int n:arr) {
			System.out.print(n+" ");
		}
		
		System.out.print("\n\nbrr[] : ");
		for(int n:brr) {
			System.out.print(n+" ");
		}
		System.out.println("\n\nprint_union_of_sorted_array:");
		print_union_of_sorted_array_handle_dupliccates(arr,brr);
		
	}

	private static void print_union_of_sorted_array_handle_dupliccates(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		int m=arr[arr.length-1];
		int n=brr[brr.length-1];
		int ans=0;  //  max element of arrays 
		if(m>=n) {
			ans=m;
		}
		else {
			ans=n;
		}
		int resultArray[]= new int[ans+1];
		//System.out.print(arr[0]+" ");		
		resultArray[arr[0]]++;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[i-1]) {
				//System.out.print(arr[i]+" ");
				resultArray[arr[i]]++;				
			}			
		}
		
		for(int j=0;j<brr.length;j++) {
			if(resultArray[brr[j]]==0) {
				//System.out.print(brr[j]+" ");
				resultArray[brr[j]]++;
			}
		}
		for(int i=0;i<resultArray.length;i++) {
			if(resultArray[i]==1) {
				System.out.print(i+" ");
			}
		}		
	}
}