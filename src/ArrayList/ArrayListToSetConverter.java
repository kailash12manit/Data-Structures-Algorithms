package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListToSetConverter {
	public static void main(String[] args) {
		ArrayList<String> companies = new ArrayList<String>();
		companies.add("Sony");
        companies.add("Samsung");
        companies.add("Microsoft");
        companies.add("Intel");
        companies.add("Sony");
        System.out.println(companies);
        System.out.println(companies.size());
       
        HashSet<String> set = new HashSet<String>(companies);
        System.out.println(set);
        System.out.println(set.size());
    }
}
