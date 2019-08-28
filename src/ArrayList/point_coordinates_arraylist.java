package ArrayList;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

public class point_coordinates_arraylist  {
	public static void main(String[] args) {
		
		ArrayList<Point> moves = new ArrayList<Point>();
		Scanner in= new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
			
			int n= in.nextInt();
			while(n-->0){
				moves.add(new Point(in.nextInt(), in.nextInt())); 
			}
			for (Point point : moves) {
				System.out.println(point.x +","+point.y);
			}
			System.out.println();
			
			moves.add(new Point(5,0));
			
			for (Point point : moves) {
				System.out.println(point.x +","+point.y);
			}
		}
		
	}
}