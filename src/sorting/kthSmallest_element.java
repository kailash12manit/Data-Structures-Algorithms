package sorting;

public class kthSmallest_element {
	public static void main(String[] args) {
		int arr[]= {2,4,3,5,6,7,8,9,10,22,67,43,25};
		System.out.println("Before Sorting:");
		for(int KK:arr) {
			System.out.print(KK+" ");
		}
		System.out.println("\n\nAfter Sorting: ");
		for(int i=0;i<arr.length;i++) {
			int result = KthSmallest(arr,i+1);
			System.out.print(result);
			System.out.print(" ");
		}		
	}

	private static int KthSmallest(int[] arr, int k) {
		// TODO Auto-generated method stub
		int n=arr.length;
		int min=Integer.MIN_VALUE;
		int temp=0;
		for(int i=0;i<k;i++) {
			temp=Integer.MAX_VALUE;
			for(int j=0;j<n;j++) {
				if(arr[j]>min &&  arr[j]<temp) {
					temp=arr[j];
				}				
			}
			min=temp;
		}
		return min;
	}
}
