package enumset;

import java.util.EnumSet;
import java.util.Iterator;

enum days {  
	  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
	} 

public class enumset1 {
	public static void main(String[] args) {
		
		EnumSet <days> en = EnumSet.of(days.FRIDAY,days.SATURDAY);
		
		Iterator<days> itr =en.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		EnumSet <days> enum_all= EnumSet.allOf(days.class);
		
		System.out.println(enum_all);
		
		EnumSet <days> enum_none= EnumSet.noneOf(days.class);
		
		System.out.println(enum_none);
		
	}

}
