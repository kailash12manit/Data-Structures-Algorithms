package DP;

import java.util.Arrays;
import java.util.Scanner;

public class multiply_in_various_number_system {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0){
			String []line=sc.nextLine().split(" ");
			int base = Integer.parseInt(line[0]);   // 2 <=base <=36
			String s = line[1];                     // number with digits upto 100
			String d = line[2];                     // number with digits upto 100
			String res=multiplyNum(base,s,d);
			System.out.println(res);
		}				
	}

	private static String multiplyNum(int base, String s, String d) {
		// TODO Auto-generated method stub
		if(base<2 || base>36){
			return "please insert base between 2<=base<=36";
		}	
		if((s.length()==1 && s.charAt(0)=='0')||(d.length()==1 && d.charAt(0)=='0')) {
			return "0";
		}
		
		String res="";
		if((s.charAt(0)=='-' || d.charAt(0)=='-') && (s.charAt(0)!='-' || d.charAt(0)!='-')){
			res="-";
		}
		if(s.charAt(0)=='-'){
			s=s.substring(1);
		}
		if(d.charAt(0)=='-'){
			d=d.substring(1);
		}
		
		int totalLen=s.length()+d.length();
		int rows=d.length();
		char resArr[][]= new char[rows][totalLen];
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<totalLen;j++){
				resArr[i][j]='0';
			}
		}
		char []arr=s.toCharArray();
		char []brr=d.toCharArray();
		
		char number[]=new char[base];
		for(int i=0;i<base;i++){
			if(i<10){
				number[i]=(char)(i+'0');
			}
			else{
				number[i]=(char)(i+65-10);
			}			
		}
		
		for(char ch:number){
			System.out.print(ch+" ");
		}
		System.out.println();	
		
		int index=0;
		int decre_index=0;
		for(int i=d.length()-1;i>=0;i--){
			int carry=0;
			index=resArr[0].length-1-decre_index;			
			for(int j=s.length()-1;j>=0;j--){
				int ss=0;
				int dd=0;
				if( (int)brr[i]<65){
					dd=brr[i]-'0';
				}
				else{
					dd=brr[i]-'A';
				}
				
				if( (int)arr[j]<65){
					ss=arr[j]-'0';
				}
				else{
					ss=arr[j]-'A';
				}				
				//System.out.println(ss+" "+dd);	
				int mm = (ss*dd)+carry;
				//System.out.println(mm);
				if(mm>=base){
					carry=mm/base;
					int quotient=mm%base;
					resArr[i][index]=number[quotient];
				}
				else{
					carry=0;
					resArr[i][index]=number[mm];
				}
				index--;				
			}
			resArr[i][index]=number[carry];			
			decre_index++;
			
			/*
			for(char []ch:resArr){
				for(char kk:ch){
					System.out.print(kk+" ");
				}
				System.out.println();
			}
			System.out.println();
			*/
		}
		
		//System.out.println("kk:"+resArr[0].length+" "+resArr.length);
		int carry=0;
		for(int i=resArr[0].length-1; i>=0;i--){
			int sum=0;
			for(int j=resArr.length-1;j>=0;j--){
				//System.out.println("resArr[j][i]:"+resArr[j][i]);
				sum+=(resArr[j][i]-'0');
				//System.out.println("sum2 :"+sum+" "+carry);				
			}
			sum=sum+carry;
			carry=sum/base;
			//System.out.println("sum:"+sum+" "+carry);
			res=""+(sum%base)+res;		
			//System.out.println("res:"+res);
		}		
		if(res.charAt(res.length()-1)=='-'){
			res="-"+res.substring(0,res.length()-1);
		}
		
		int Startdigit=0;
		while(res.charAt(Startdigit)=='0'){
			res=res.substring(1);
		}
		return res;
	}
}
