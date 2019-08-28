package DP;

public class DP_6_9_20_rupees {
	public static void main(String[] args) {
		
		int coins[] = {9,6,20}; 
		int m = coins.length; 
		int V = 43; 
		System.out.println ( "Minimum coins required is "
							+ minCoins(coins, m, V)); 		
	}

	static int minCoins(int coins[], int m, int V) 
	{ 
		int table[] = new int[V + 1]; 
		table[6] = 1;
		table[9] = 1;
		table[20]= 1;
		
		for (int i = 1; i <= V; i++) 
		{
			//table[i]= table[i-6] || table[i-9] || table[i-20]; 
		}
		return table[V]; 		
	}	
}
