package arrays;

public class reverseArray {
	public static void main(String[] args) {
		
		int arr[]= {2,3,4,5,6};
		int res[]=reverse(arr);
		for(int kk:res) {
			System.out.print(kk+" ");
		}
	}

	private static int[] reverse(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		for(int i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;			
		}		
		return arr;
	}
}
