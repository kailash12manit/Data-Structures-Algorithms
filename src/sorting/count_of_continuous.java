package sorting;
import java.util.Scanner;


public class count_of_continuous {
		
		int N, M;
		int[] TV;    // Sold TV model
		int[] sold;  // Sales q’ty(quantity)
		int[] score; // Popularity
		int[] freq; // frequency
		
		void inputData() {
			int i;
			
			Scanner sc = new Scanner(System.in);
			
			N = sc.nextInt();
			M = sc.nextInt();
			
			TV = new int[100000 + 10];
			sold = new int[100000 + 10];
			freq = new int[100000 + 10];
			score = new int[100000 + 10];
			
			for(i = 0; i < N; i++) {
				TV[i] = sc.nextInt();
			}
			
			sc.close();
		}
		
		int Solve() {
			int i, max;
			
			// Count the sales q’ty of each model
			for (i = 0; i < N; i++) {
				sold[TV[i]]++;
			}
			
			int temp=1;
			for (i = 0; i < N; i++) {
				if(TV[i]==TV[i+1]) {
					temp++;					
				}
				else {
					if(temp>freq[TV[i]]) {
						freq[TV[i]]=temp;
					}
					temp=1;
				}
				
			}			
			
			// Improve the popularity based on the existing method (popularity = sales q’ty)
			for (i = 1; i <= M; i++) {
				score[i] = sold[i]*freq[i];
			}
			
			// Find the model number with the highest popularity.
			max = 1;
			for (i = 2; i <= M; i++) {
				if(score[i] > score[max]) max = i;
			}
			
			return max;
		}
		
		public static void main(String[] args) {
			count_of_continuous m = new count_of_continuous();
			
			m.inputData();					//	Input function
			int sol = m.Solve();			//	Problem solving
			
			System.out.println(sol);		//	Answer output

		}
	}
