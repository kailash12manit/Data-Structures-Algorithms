package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestCollection {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("amit");
		al.add("Kumar");
		al.add("sumit");
		al.add("ram");
		al.add(1,"Sachin");
		
		System.out.println("element at 1st position: "+al.get(0));
		System.out.println("element at 2nd position: "+al.get(1));  
		System.out.println("element at 1st position: "+al.get(2));
		System.out.println("element at 1st position: "+al.get(3));
		System.out.println("element at 1st position: "+al.get(4));
		
		
		ListIterator<String> lr = al.listIterator();
		while (lr.hasNext()) {
			String string = (String) lr.next();
			System.out.println(string);
		}
	}
}
