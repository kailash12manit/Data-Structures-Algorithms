package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionsDemo {

	public static int rankof (int[] marks,int rank){
	
	Map m1 = new HashMap<Integer, Integer>();
	for(int i=0;i<marks.length;i++);
	{
		m1.put(1,marks[0]);
	
	}
	
    System.out.println(" Map Elements");
    Map<String, String> reversedMap = new TreeMap<String, String>(m1);

    //then you just access the reversedMap however you like...
    	for (Map.Entry entry : reversedMap.entrySet()) {
    			System.out.println(entry.getKey() + ", " + entry.getValue());
    		}
		return rank;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]={2,3,4,5,6,5,4};
        int rank=3;
		int rankofstudent= rankof(arr,rank);
	    System.out.println(rankofstudent);
	}

}
