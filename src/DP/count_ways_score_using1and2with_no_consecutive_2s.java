package DP;
/*
A cricket player has to score N runs, with condition he can take either 1 or 2 runs only and
 consecutive runs should not be 2. Find all the possible combination he can take. 
 */
public class count_ways_score_using1and2with_no_consecutive_2s {
	
	static  int CountWays(int n, boolean flag) { 
	    if (n == 0) {
	        return 1;
	    }
	    int sum = 0; 
	    
	    // 2 is not scored last time so we can score either 2 or 1 
	    if (flag == false && n > 1) { 
	        sum = sum + CountWays(n - 1, false) + CountWays(n - 2, true); 
	    }
	    
	    // 2 is scored last time so we can only score 1 
	    else {
	        sum = sum + CountWays(n - 1, false); 
	    }
	    
	    return sum; 
	} 
	
	public static void main (String[] args) { 
        int n = 5; 
        System.out.println(CountWays(n, false)); 
	}
}
