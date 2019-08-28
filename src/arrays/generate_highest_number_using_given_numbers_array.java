package arrays;
import java.util.*;
import java.lang.*;

public class generate_highest_number_using_given_numbers_array {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String []str=line.split(" ");
		int len=str.length;
		String res=GenerateHighestNumber(str);
		System.out.println(res);	
	}

	private static String GenerateHighestNumber(String[] str) {
		// TODO Auto-generated method stub
		String []sortedstr=sort(str);
		String res="";
		for(String inStr:sortedstr) {
			res=res+inStr;
		}		
		return res;
	}

	private static String[] sort(String[] str) {
		// TODO Auto-generated method stub
		int len=str.length;
		boolean flag=true;
		for(int i=0;i<len-1;i++) {
			flag=false;
			for(int j=0;j<len-i-1;j++) {
				int aa=Integer.parseInt(str[j]+str[j+1]);
				int bb=Integer.parseInt(str[j+1]+str[j]);
				if(aa<bb) {
					String temp=str[j+1];
					str[j+1]=str[j];
					str[j]=temp;					
					flag=true;					
				}
			}
			
			if(flag==false) {
				break;
			}			
		}		
		
		for(String kk: str) {
			System.out.print(kk+" ");
		}
		System.out.println();
		return str;
	}
}
