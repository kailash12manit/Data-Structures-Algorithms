package arrays;

public class union_of_sorted_arrays {
	public static void main(String[] args) {
		int []arr = {1,4,6,8,9,21,24,45};
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
		print_union_of_sorted_array(arr,brr);
		
	}

	private static void print_union_of_sorted_array(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		int m = arr.length;
		int n= brr.length;
		int i=0,j=0;
		while(i<m && j<n) {
			if(arr[i]<brr[j]) {
				System.out.print(arr[i]+" ");
				i++;
			}
			else if(arr[i]>brr[j]) {
				System.out.print(brr[j]+" ");
				j++;
			}
			else if(arr[i]==brr[j]) {
				System.out.print(arr[i]+" ");
				i++;
				j++;	
			}
		}
		while(i<m) {
			System.out.print(arr[i]+" ");
			i++;
		}
		while(j<n) {
			System.out.print(brr[j]+" ");
			j++;
		}		
		
	}

}
