package Strings;
import java.util.*;


public class palindrome_check {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			String str=sc.nextLine();
			check_palindrome(str);			
		}		
	}

	private static void check_palindrome(String str) {
		// TODO Auto-generated method stub
		int len=str.length();
		System.out.println("original string :"+str);
		for(int i=0;i<len/2;i++) {
			if(str.charAt(i)!=str.charAt(len-1-i)) {
				System.out.println("NOT palindrome @@@@@@@:(");
				return;
			}			
		}
		System.out.println("string is palindrome");		
	}
}
