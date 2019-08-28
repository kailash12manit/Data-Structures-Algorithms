package Strings;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class substring_dist_example  {
	private static final Scanner scanner = new Scanner(System.in);
	 
	public static void main(String[] args) throws IOException {
		
		
		
		int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();
            System.out.println(s);
            int result = superFunctionalStrings(s);
            System.out.println(result);
        
        }	
	}	
	
	/*
     * Complete the superFunctionalStrings function below.
     */
    static int superFunctionalStrings(String str) throws FileNotFoundException {
        /*
         * Write your code here.
         */
    	System.setOut(new PrintStream(new FileOutputStream("output.txt")));
    	
    	Set<String> set = new HashSet<String>();
    	for(int i=0;i<=str.length() ;i++) {
    		for(int j=i+1;j<=str.length() ;j++) {
    			String aa = str.substring(i,j);
    			//System.out.println(aa);
    			set.add(aa);
    		}
    	}
    	int sum=0;
    	    	
    	Iterator iter = set.iterator();
    	while (iter.hasNext()) {
    	    String temp = (String) iter.next();
    	    int length=temp.length();
    	    System.out.println("temp :"+temp+" length:"+length);
    	    char [] ch = temp.toCharArray();
    	    Arrays.sort(ch);
    	    int distinct=1;
    	    for(int i=0;i<temp.length()-1;i++) {
    	    	if(ch[i]!=ch[i+1]) {
    	    		distinct++;
    	    	}
    	    	else {
    	    		continue;
    	    	}
    	    }
    	    System.out.println("distinct:"+distinct);
    	    double temp_sum = Math.pow(length, distinct)%1000000007;
    	    //System.out.println(temp_sum);    	
    	    sum+=temp_sum;
    	       
    	}
    	System.out.println(sum);
    	System.out.println(":DONE:\n");
    	
    	return sum;

    }	
}
