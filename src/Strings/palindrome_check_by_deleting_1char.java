package Strings;
import java.util.*;

public class palindrome_check_by_deleting_1char {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			String str=sc.nextLine();
			check_palindrome_byDeleting1char(str);			
		}		
	}

	private static void check_palindrome_byDeleting1char(String str) {
		// TODO Auto-generated method stub
		int len=str.length();
		System.out.println("original string :"+str);
		int count=0;
		char ch='9';
		int i=0,j=len-1;
		while(i<j) {
			System.out.println("str.charAt(i):"+str.charAt(i));
			System.out.println("str.charAt(j):"+str.charAt(j));
			if(str.charAt(i)==str.charAt(j)) {
				i++;
				j--;				
			}
			else {
				if(count>1) {
					System.out.println("more than 1 char need to be deleted");
					return;
				}
				else if(str.charAt(i+1)==str.charAt(j)) {
					count++;
					ch=str.charAt(i);
					System.out.println("case1");
					i++;					
				}
				else if(str.charAt(i)==str.charAt(j-1)) {
					count++;
					ch=str.charAt(j);
					System.out.println("case2");
					j--;
				}				
			}			
		}
		if(count==1) {
			System.out.println("NOT palindrome @@@@@@@:(");
			System.out.println("char need to be deleted:"+ch);
		}
		else {
			System.out.println("string is palindrome");
		}				
	}
}