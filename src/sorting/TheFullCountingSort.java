package sorting;

import java.io.*;
import java.util.*;
class ArrList implements Comparable<ArrList>{
    int index;
    int i;
    String str;
    
    public ArrList(int index,int i,String str){
        this.index=index;
        this.i=i;
        this.str=str;       
    }
    public int compareTo(ArrList e){
        return this.i - e.i;
    }

}

public class TheFullCountingSort {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //Scanner sc = new Scanner(System.in);
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        ArrayList<ArrList>al = new ArrayList<ArrList>();
        
        for(int i=1;i<=n;i++){
            String []arr= br.readLine().split(" ");
            int a= Integer.parseInt(arr[0]);
            String value   = (i < n/2) ? "-" : arr[1];
            al.add(new ArrList(i,a,value));
        }
        
        int no_of_times=n/2;
        //Collections.sort(al);
        StringBuilder sb = new StringBuilder();
        
        for(ArrList temp: al){
            if(temp.index <= no_of_times){
                sb.append("-");
            }
            else{
            	sb.append(temp.str);
            }            
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
