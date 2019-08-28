package hashtable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class count_char_in_String {
    public static void main(String[] args) {
        String str="asdas.dxcvbbgvnmnm,nm.tyuytu";
        printcount(str);        
    }

    private static void printcount(String str) {
        // TODO Auto-generated method stub
        char[] ch_array= str.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();  
        for(char ch:ch_array){
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);                
            }
        }  
        Set<Character>keys = hm.keySet();
        for(char key:keys){
            System.out.println(key+" "+hm.get(key));
        } 
    }
}
