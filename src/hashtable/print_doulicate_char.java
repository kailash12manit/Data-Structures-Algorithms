package hashtable;

import java.util.HashMap;
import java.util.Set;

public class print_doulicate_char {
    public static void main(String[] args) {
        String str="asdasdcvasd";
        print_Duplicate_count(str); 
    }

    private static void print_Duplicate_count(String str) {
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
        for(char key: keys){
            if(hm.get(key)>1){
               System.out.println(key+" "+hm.get(key));
            }
            else{
                System.out.println(key);
            }                
        }
        
        
    }    
}
