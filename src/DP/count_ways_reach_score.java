package DP;
import java.util.Arrays;

//https://www.geeksforgeeks.org/count-number-ways-reach-given-score-game/

//Consider a game where a player can score 3 or 5 or 10 points in a move. Given a total score n, 

//find number of ways to reach the given score

public class count_ways_reach_score {
	public static void main(String[] args) {
		int n = 20; 
        System.out.println("Count for "+n+" is "+count(n)); 
      
        n = 13; 
        System.out.println("Count for "+n+" is "+count(n)); 
	}

	private static int count(int n) {
		// TODO Auto-generated method stub
		int table[]= new int[n+1];
		Arrays.fill(table,0);
		table[0]=1;
		
		for(int i=3;i<=n;i++){
			table[i]+=table[i-3];
		}
		
		for(int i=5;i<=n;i++){
			table[i]+=table[i-5];
		}
		
		for(int i=10;i<=n;i++){
			table[i]+=table[i-10];
		}
		
		return table[n];
	}
}
