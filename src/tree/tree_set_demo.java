package tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	int id_number;
	String name;
	String Depar_name;
	public Employee(int id_number, String name, String depar_name) {
		super();
		this.id_number = id_number;
		this.name = name;
		Depar_name = depar_name;
	}	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id_number "+id_number+" name "+name+" Depar_name "+Depar_name;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id_number-o.id_number;
	}	
}
public class tree_set_demo {
	public static void main(String[] args) {
		
		TreeSet<Employee> tset = new TreeSet<Employee>();
		tset.add(new Employee(1, "test01", "MPS1"));
		tset.add(new Employee(3, "test05", "MPS1"));
		tset.add(new Employee(5, "test03", "MPS2"));
		tset.add(new Employee(2, "test06", "MPS4"));
		tset.add(new Employee(4, "test02", "MPS1"));
		
		Iterator<Employee> it = tset.iterator();
		
		while(it.hasNext() ) {
			System.out.println(it.next());
		}
		
		ArrayList al = new ArrayList(tset);
		
		System.out.println(al);
		
	}	
}
