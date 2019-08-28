package Strings;

import java.util.HashMap;

final class ImmutableClass{
	private final Integer id; //Immutable member variable
    private final String name; //Immutable member variable
    private final HashMap<Integer,String> map; //mutable member variable
    
    public ImmutableClass(Integer id, String name, HashMap<Integer,String> map){
        this.id=id;
        this.name=name;
       
        //assign all mutable member variable using new keyword.
        this.map=new HashMap<Integer, String>(map);
    }

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public HashMap<Integer, String> getMap() {
		return (HashMap<Integer, String>) map.clone();
	}	
}

public class ImmutableClassTest {

	public static void main(String[] args) {
	      
	       Integer localId=new Integer(1); //local
	      
	       String localName=new String("ankit"); //local
	      
	        HashMap<Integer, String> localMap = new HashMap<Integer,String>(); //local
	        localMap.put(11, "audi");
	      
	        ImmutableClass immutableClass = new ImmutableClass(localId, localName, localMap);
	       
	 
	        System.out.println("----Display ImmutableClass members before changing----");
	        System.out.println(immutableClass.getName());  // "ankit"
	        System.out.println(immutableClass.getId());        // 1
	        System.out.println(immutableClass.getMap());   //{11=audi}
	 
	        //Comparing ImmutableClass members with local before changing
	        System.out.println(localName==immutableClass.getName());  //true
	        System.out.println(localId==immutableClass.getId());      //true
	        System.out.println(localMap == immutableClass.getMap());  //false
	 
	       
	        //change local
	        localId = new Integer(2);
	        localName = new String("mittal");
	        localMap.put(12, "ferarri");
	 
	       
	        System.out.println("\n----Display ImmutableClass members after changing----");
	        System.out.println(immutableClass.getName());  // "ankit"
	        System.out.println(immutableClass.getId());        // 1
	        System.out.println(immutableClass.getMap());   //{11=audi}
	 
	        //Comparing ImmutableClass members with local after changing
	        System.out.println(localName==immutableClass.getName());  //false
	        System.out.println(localId==immutableClass.getId());      //false
	        System.out.println(localMap == immutableClass.getMap());  //false
	 
	    }
}
