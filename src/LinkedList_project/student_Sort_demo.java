package LinkedList_project;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class student{
	int rollno;
	String name;
	String address;
	int marks;
	public student(int rollno, String name, String address, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}	
}

class student3 implements Comparable{
	int rollno;
	String name;
	String address;
	int marks;
	public student3(int rollno, String name, String address, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Object o1) {
		// TODO Auto-generated method stub
		student3 sb = (student3)o1;
		if(this.name.equals(sb.name)){
			return 0;
		}else
			return this.name.compareTo(sb.name);
	}
}

class sortByRollno implements Comparator<student>{

	@Override
	public int compare(student o1, student o2) {
		// TODO Auto-generated method stub
		return o1.rollno-o2.rollno;
	}	
}

class sortByName implements Comparator<student>{
	
	@Override
	public int compare(student o1, student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}

class sortByMarks implements Comparator<student>{
	
	@Override
	public int compare(student o1, student o2) {
		// TODO Auto-generated method stub
		
		return o2.marks-o1.marks;
	}
}

public class student_Sort_demo {
	public static void main(String[] args) {
		/*
		ArrayList<student> al = new ArrayList<student>();
		al.add(new student(1,"devendra","palera",95));
		al.add(new student(2,"kripal","tikamgarh",90));
		al.add(new student(5,"thakurdas","indore",55));
		al.add(new student(9,"amit","sagar",65));
		al.add(new student(3,"ramadeen","jhansi",85));
		
		System.out.println("print original records\n");
		for(student s1:al){
			System.out.println(s1.rollno+" "+s1.name.toUpperCase()+" "+s1.address+" "+s1.marks);
		}
		
		
		System.out.println("\nprint records based on the rollno\n");
		al.sort(new sortByRollno());
		for(student s1:al){
			System.out.println(s1.rollno+" "+s1.name.toUpperCase()+" "+s1.address+" "+s1.marks);
		}
		
		System.out.println("\nprint records based on the name\n");
		al.sort(new sortByName());
		for(student s1:al){
			System.out.println(s1.rollno+" "+s1.name.toUpperCase()+" "+s1.address+" "+s1.marks);
		}
		
		System.out.println("\nprint records based on the marks\n");
		al.sort(new sortByMarks());
		for(student s1:al){
			System.out.println(s1.rollno+" "+s1.name.toUpperCase()+" "+s1.address+" "+s1.marks);
		}

		*/
		
		ArrayList<student3> al2 = new ArrayList<student3>();
		al2.add(new student3(1,"devendra","palera",95));
		al2.add(new student3(2,"kripal","tikamgarh",90));
		al2.add(new student3(5,"thakurdas","indore",55));
		al2.add(new student3(9,"amit","sagar",65));
		al2.add(new student3(3,"ramadeen","jhansi",85));
		
		Collections.sort(al2);
		for(student3 s1:al2){
			System.out.println(s1.rollno+" "+s1.name.toUpperCase()+" "+s1.address+" "+s1.marks);
		}
		
	}	
}
