package ArrayList;

import java.util.ArrayList;

public class sub_sequence {
	static void printArrayList(ArrayList<String> arrL) { 
        arrL.remove(""); 
        System.out.println(arrL.size());
    } 
  
    public static ArrayList<String> getSequence(String str) { 
        if (str.length() == 0) { 
            ArrayList<String> empty = new ArrayList<>(); 
            empty.add(""); 
            return empty; 
        } 
        char ch = str.charAt(0); 
        String subStr = str.substring(1); 
  
        ArrayList<String> subSequences = getSequence(subStr); 
        ArrayList<String> res = new ArrayList<>(); 
        for (String val : subSequences) { 
            res.add(val); 
            res.add(ch + val); 
        } 
        return res; 
    } 
    public static void main(String[] args) { 
        String str="12"; 
        printArrayList(getSequence(str)); 
    } 
}
