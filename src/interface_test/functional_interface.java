package interface_test;

class test implements function{
	@Override
	public int run() {
		// TODO Auto-generated method stub
		System.out.println("test");
		return 0;
	}
    public void te() {
    	System.out.println("kk");
    }	
}
public class functional_interface {
	public static void main(String[] args) {
		function ftest = new test() {
			@Override
			public int run() {
				// TODO Auto-generated method stub
				System.out.println("test2");
				return 0;
			}
		    public void te() {
		    	System.out.println("kk2");
		    }	
		};		
		ftest.run();
		((test) ftest).te();
	}
}