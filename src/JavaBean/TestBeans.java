package JavaBean;

class Student implements java.io.Serializable { 
	private int id; 
	private String name; 
	public Student() { 
	} 
	public void setId(int id) { 
		this.id = id; 
	} 
	public int getId() { 
		return id; 
	} 
	public void setName(String name) { 
		this.name = name; 
	} 
	public String getName() { 
		return name; 
	} 
} 

public class TestBeans {
	public static void main(String args[]) { 
		Student s = new Student(); // object is created 
		s.setName("GFG"); // setting value to the object 
		System.out.println(s.getName()); 
	} 
}
