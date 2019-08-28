package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
//MS Codeathon 2017  Order Strings
public class Order_Strings {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		sc.nextLine();
		ArrayList<ArrayList<String>>al= new ArrayList<ArrayList<String>>();
		for(int i=0;i<n;i++){
			ArrayList<String>pair= new ArrayList<String>();
			String[] atr= sc.nextLine().split(" ");
			for(int yy=0;yy<atr.length;yy++){
				pair.add(atr[yy]);
			}			
			al.add(pair);		
		}
		
		int key= sc.nextInt()-1;
		boolean reverse= sc.nextBoolean();
		String 	comparision=sc.next();
		boolean sort = (comparision.charAt(0)=='l') ? true:false;
		
		sc.close();
		/*
		for(ArrayList<String>aa:al){
			for(String tt:aa){
				System.out.print(tt+" ");
			}
			System.out.println();
		}
		*/
		if(sort){
			sortLexico(al,key);
			if(reverse){
				for(int i=n-1;i>=0;i--){
					 ArrayList<String> pa= al.get(i);
					 for(int j=0;j<pa.size();j++){
						 System.out.print(pa.get(j)+" ");
					 }
					 System.out.println();
				}
			}
			else{
				for(int i=0;i<n;i++){
					 ArrayList<String> pa= al.get(i);
					 for(int j=0;j<pa.size();j++){
						 System.out.print(pa.get(j)+" ");
					 }
					 System.out.println();
				}
			}			
		}
		else{
			
			sortNumeric(al,key);
			if(reverse){
				for(int i=n-1;i>=0;i--){
					 ArrayList<String> pa= al.get(i);
					 for(int j=0;j<pa.size();j++){
						 System.out.print(pa.get(j)+" ");
					 }
					 System.out.println();
				}
			}
			else{
				for(int i=0;i<n;i++){
					 ArrayList<String> pa= al.get(i);
					 for(int j=0;j<pa.size();j++){
						 System.out.print(pa.get(j)+" ");
					 }
					 System.out.println();
				}
			}
		}			
	}
	
	private static void sortNumeric(ArrayList<ArrayList<String>> al, int key) {
		// TODO Auto-generated method stub
		Collections.sort(al, new Comparator<ArrayList<String>>(){
			@Override
			public int compare(ArrayList<String> aa, ArrayList<String> bb) {
				// TODO Auto-generated method stub
				Integer a= Integer.parseInt(aa.get(key));
				Integer b=Integer.parseInt(bb.get(key));
				return a.compareTo(b);
			}
		});			
	}

	private static void sortLexico(ArrayList<ArrayList<String>> al, int key) {
		// TODO Auto-generated method stub
		Collections.sort(al, new Comparator<ArrayList<String>>(){
			@Override
			public int compare(ArrayList<String> a, ArrayList<String> b) {
				// TODO Auto-generated method stub
				return a.get(key).compareTo(b.get(key));
			}
		});		
	}
}
