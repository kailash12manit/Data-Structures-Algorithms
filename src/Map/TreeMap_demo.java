package Map;

import java.util.Map.Entry;
import java.util.TreeMap;

class student implements Comparable<student>{
	int roll;
	String name;
	public student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}	
	
	@Override
	public int compareTo(student s){
		int ren=this.roll-s.roll;
		if(ren==0){
			ren=this.name.compareTo(s.name);
		}
		return ren;		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return roll+" "+name;
	}	
}

public class TreeMap_demo {
	public static void main(String[] args) {
		TreeMap<student,String> map=new TreeMap<student,String>(); 
		map.put(new student(100,"Amit"),"amit");
		map.put(new student(103,"Ravi"),"ravi");  //    map.put(new student(103,"ravi"),"ravi");
	    map.put(new student(101,"Vijay"),"vijay");    
	    map.put(new student(103,"pahul"),"pahul");    
	    
	    for(Entry<student, String> m:map.entrySet()){    
	        System.out.println(m.getKey()+" : "+m.getValue());    
	    }	
	}
}
