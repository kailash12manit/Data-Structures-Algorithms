package non_access_modifiers;

class childclass {
	public static int UserID=145;	
}
public class final_class_demo {
	public static void main(String[] args) {
		final childclass obj = new childclass();
		obj.UserID=155;		
		childclass obj2 = new childclass();
		System.out.println("k:"+obj.UserID);
	}
}
