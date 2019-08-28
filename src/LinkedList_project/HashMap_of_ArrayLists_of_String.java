package LinkedList_project;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMap_of_ArrayLists_of_String {
	public static void main(String[] args) {
		HashMap_of_ArrayLists_of_String ha = new HashMap_of_ArrayLists_of_String();
		Map<String , List<String>> hm = ha.getmap();
		
		int i=0;
		for(Map.Entry<String, List<String> >listentry : hm.entrySet()){
			System.out.println("Iterator number is : "+ ++i);
			for(String name : listentry.getValue()){
				System.out.println("City -: "+name);
			}			
		}    
	}
	
	private Map<String , List<String>> getmap(){
			Map< String , List<String>> citymap = new HashMap<String , List<String>>();
			List<String> al = new ArrayList<String>();
			al.add("Delhi");
			al.add("Bangalore");
			citymap.put("1",al);
			
			al = new ArrayList<String>();
			al.add("Mumbai");
			al.add("kolkata");
			al.add("punjab");
			citymap.put("2", al);
			
			al = new ArrayList<String>();
			al.add("Bhopal");
			al.add("Indore");
			al.add("PALERA");
			al.add("JHS");
			citymap.put("3", al);
			
			return citymap;				
	}
}
