package arrays;

public class EqualNumbersMain {
	public static void main(String[] args) {
		int a[] = {50, 75, 150}; 
		int n = a.length; 
		if (EqualNumbers(a, n))	{ 
			System.out.println("Yes"); 
		}  
		else { 
			System.out.println("No"); 
		} 
	}

	static boolean EqualNumbers(int a[], int n) { 
		for (int i = 0; i < n; i++)  { 
			while (a[i] % 2 == 0) { 
				a[i] /= 2; 
			} 
			while (a[i] % 3 == 0) { 
				a[i] /= 3; 
			} 
		} 
		for (int i = 1; i < n; i++) { 
			if (a[i] != a[0]) { 
				return false; 
			} 
		}
		return true; 
	}
}