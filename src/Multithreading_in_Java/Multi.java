package Multithreading_in_Java;
public class Multi extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	    int i=10;
	    if(i>0){	
	    	System.out.println("yes");
	    }
	    else
	    {
	    	System.out.println("NO");
	    }
		System.out.println("Java Thread Example by extending Thread class");
	}
	
	public static void main(String[] args) {
	
		Multi T= new Multi();
		T.start();
	}

}
