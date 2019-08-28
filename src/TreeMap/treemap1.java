package TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class treemap1 {
	
	public static void main(String args[]){  

		TreeMap<Integer,String> hm=new TreeMap<Integer,String>();  
		 hm.put(100,"Amit");  
		 hm.put(102,"Ravi");  
		 hm.put(101,"Vijay");  
		 hm.put(103,"Rahul");  
		 
		 System.out.println("It is same as HashMap instead maintains ascending order");
		 /*
		 for(Map.Entry m:hm.entrySet()){  
			 System.out.println(m.getKey()+" "+m.getValue());  
		 } 
		 */ 
		 System.out.println(hm);
		 
		 //System.out.println("deleted = "+ hm.remove(103));
		 
		 hm.remove(102);
		 
		 System.out.println(hm);
		 
	 }  
}
