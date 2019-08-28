package sorting;

public class bubbleSort_optimized {
	public static void main(String[] args) {
		
		int arr[] = {12, 11, 13, 5, 6,4,3,7,7,10}; 
		
		bubbleSort_optimized ob = new bubbleSort_optimized();         
        ob.printArray(arr); 
        ob.sort(arr); 
        ob.printArray(arr);         
	}

	private void sort(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		boolean swap = false;
		for(int i=0;i<n;i++) {
			swap=false;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
				    int temp = arr[j];
				    arr[j]=arr[j+1];
				    arr[j+1]=temp;
				    swap=true;
				}				
			}
			if(swap==false) {
				break;
			}			
		}
	}

	private void printArray(int[] arr) {
		// TODO Auto-generated method stub
		bubble_sort.printArray(arr);
	}
}
