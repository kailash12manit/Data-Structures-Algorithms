package Multithreading_in_Java;

public class TestGarbage1 {
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("object is garbage collected");
	}
	
	public static void main(String[] args) {
		
		TestGarbage1 k1 = new TestGarbage1();
		TestGarbage1 k2 = new TestGarbage1();
		k1=k2;
		k1=null;
		k2=null;
		System.gc();
		
		Runtime r = Runtime.getRuntime();
		System.out.println(r.freeMemory());
		System.out.println("Free Memory: "+r.freeMemory()); 
		
	}

}
