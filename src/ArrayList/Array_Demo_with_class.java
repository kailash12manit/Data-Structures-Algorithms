package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	
	int rollno;
	String name;
	int age;
	public Student(int rollno,String name, int age){
		
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
}
public class Array_Demo_with_class {
	
	public static void main(String[] args) {
		
		Student s1= new Student(14512145,"AA",22);
		Student s2= new Student(14512155,"BB",33);
		Student s3= new Student(14512165,"CC",44);
		Student s4= new Student(14512175,"DD",55);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		Iterator itr= al.iterator();
		while(itr.hasNext()){
			Student st = (Student) itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age );
		}	
			
	}
}
