package sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6}; 
		  
        InsertionSort ob = new InsertionSort();         
        ob.printArray(arr); 
        ob.sort(arr); 
        ob.printArray(arr); 
		
	}

	private void sort(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j] >key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}

	private void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int ii:arr) {
			System.out.print(ii+",");
		}
		System.out.println();
	}

}
