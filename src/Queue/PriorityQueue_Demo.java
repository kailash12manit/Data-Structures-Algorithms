package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;


public class PriorityQueue_Demo implements Comparator<Integer>{
	public static void main(String[] args) {
	 
		PriorityQueue<Integer> pr = new PriorityQueue<Integer>(new PriorityQueue_Demo());
		
		pr.add(Integer.parseInt("3"));
		pr.add(Integer.parseInt("9"));
		pr.add(Integer.parseInt("1"));
		pr.add(Integer.parseInt("6"));
		pr.add(Integer.parseInt("4"));
		pr.add(Integer.parseInt("2"));
		pr.add(Integer.parseInt("8"));
		
		
		System.out.println(pr+"\n");
		System.out.println(pr.poll());
		System.out.println(pr+"\n");
		System.out.println(pr.poll());
		System.out.println(pr+"\n");
		System.out.println(pr.poll());
		System.out.println(pr+"\n");
		System.out.println(pr.poll());
		System.out.println(pr+"\n");
		System.out.println(pr.poll());
		System.out.println(pr+"\n");
		
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
}
