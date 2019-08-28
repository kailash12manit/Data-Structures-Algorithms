package sorting;

public class bubble_sort {
	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6,4,3,7,7,10}; 
		  
		bubble_sort ob = new bubble_sort();         
        ob.printArray(arr); 
        ob.sort(arr); 
        ob.printArray(arr); 
		
	}

	private void sort(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
				    int temp = arr[j];
				    arr[j]=arr[j+1];
				    arr[j+1]=temp;
				}				
			}
		}		
	}

	static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int ii:arr) {
			System.out.print(ii+" ");
		}
		System.out.println();
	}
}
