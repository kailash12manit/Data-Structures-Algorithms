package Trie;

public class trie_insert_search {
	static final int ALPHABET_SIZE = 26;
	
	static TrieNode root; 
	
	private static void insert(String key) {
		// TODO Auto-generated method stub
		TrieNode temp_node=root;
		int level;
		int len=key.length();
		int index;
		
		for(level=0;level<len;level++) {
			index= key.charAt(level)-'a';
			if(temp_node.children[index]==null) {
				temp_node.children[index]=new TrieNode();
			}
			temp_node=temp_node.children[index];			
		}
		temp_node.isEndOfWord=true;
	}
	
	private static boolean search(String key) {
		int level; 
        int length = key.length(); 
        int index; 
        TrieNode temp_node = root; 
       
        for (level = 0; level < length; level++) { 
            index = key.charAt(level) - 'a';        
            if (temp_node.children[index] == null) {
                return false; 
            }
            temp_node = temp_node.children[index]; 
        } 
        return (temp_node != null && temp_node.isEndOfWord); 
	}
	
	public static void main(String[] args) {
		
		// Input keys (use only 'a' through 'z' and lower case) 
				String keys[] = {"the", "a", "there", "answer", "any", 
								"by", "bye", "their"}; 
			
				String output[] = {"Not present in trie", "Present in trie"}; 
			
			
				root = new TrieNode(); 
			
				// Construct trie 
				int i; 
				for (i = 0; i < keys.length ; i++) 
					insert(keys[i]); 
			
				// Search for different keys 
				if(search("the") == true) 
					System.out.println("the --- " + output[1]); 
				else System.out.println("the --- " + output[0]); 
				
				if(search("these") == true) 
					System.out.println("these --- " + output[1]); 
				else System.out.println("these --- " + output[0]); 
				
				if(search("their") == true) 
					System.out.println("their --- " + output[1]); 
				else System.out.println("their --- " + output[0]); 
				
				if(search("thaw") == true) 
					System.out.println("thaw --- " + output[1]); 
				else System.out.println("thaw --- " + output[0]); 
		
	}
}
