package random;

import java.util.ArrayList;
import java.util.Random;

public class random_unique_number {
	public static void main(String[] args) {
		ArrayList<Integer>al= new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			al.add(i+1);
		}
		System.out.println(al+"\n");
		for(int i=0;i<10;i++) {
			int num=getRandom(al);
			System.out.print(num+" ");
			al.remove(al.indexOf(num));
		}
	}
	
	public static int getRandom(ArrayList<Integer>al) {
	    int rnd = new Random().nextInt(al.size());
	    return al.get(rnd);
	}
}
