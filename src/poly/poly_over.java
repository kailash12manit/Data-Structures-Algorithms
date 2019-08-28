package poly;

class superSet{

	protected static void display() {    //1
		System.out.println("superSet:: display()");
	}	
}

public class poly_over extends superSet{
	
	public static void display() {    // 5
		System.out.println("poly_over:: display()");
		//return 5;
	}
	
	public static void main(String[] args) {
		superSet sup = new superSet();
		poly_over po = new poly_over();
		superSet sub = new poly_over();
		sup.display();  // 6
		po.display();   // 7
		sub.display();	// 8	
	}
}
