package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class bigsorting {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		String [] arr= new String[n];
		for(int i=0;i<n;i++){
			arr[i]= br.readLine();
		}
		
		Arrays.sort(arr,(x,y) -> {
			if(x.length() != y.length())
				return x.length() - y.length();
			return x.compareTo(y);
		} );			
	    
		for( String s:arr){
			System.out.println(s);
		}
	}
}