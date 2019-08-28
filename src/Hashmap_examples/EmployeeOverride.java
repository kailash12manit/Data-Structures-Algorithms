package Hashmap_examples;

import java.util.HashMap;

class Employee {
	Integer id;
	String name;
	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee[id=" + id + ", name=" + name + "]";		
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj==null) {
			return false;
		}
		if(this.getClass()!=obj.getClass()) {
			return false;
		}
		
		Employee emp = (Employee)obj;
		
		return (emp.id==this.id || emp.id.equals(this.id)) && ( emp.name==this.name || emp.name.equals(this.name));
		
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		
		int hash = (this.id==null ? 0 : this.id.hashCode())+
				(this.name==null ? 0 : this.name.hashCode());
		
		return hash;
	}	
	
}
public class EmployeeOverride {
	public static void main(String[] args) {
		HashMap<Employee, String> hm=new HashMap<Employee, String>();
		hm.put(new Employee(1, "sam"), " Employee 1 record");
		hm.put(new Employee(2, "amy"), " Employee 2 record");
		
		System.out.println(hm);
		System.out.println();
		
		System.out.println("HashMap's data> "+hm);
        System.out.println(hm.get(new Employee(1,"sam")));
        
        hm.put(new Employee(1,"sam"), "employee1 data OVERRIDDEN");
        
        System.out.println("\nAgain display HashMap after overriding data "+
                     "of Employee with id=1 and name=’sam’\n");
        
        System.out.println("HashMap's data> "+hm);
        System.out.println(hm.get(new Employee(1,"sam")));
		
		
		
		
	}
}
