package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class array_list_demo1 {
	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		//System.out.println(list);
		
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
