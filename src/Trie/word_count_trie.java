package Trie;

public class word_count_trie {
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

	public static void main(String[] args) {

		// Input keys (use only 'a' through 'z' and lower case) 
		String keys[] = {"the", "a", "there", "answer", "any", 
				"by", "bye", "their"}; 

		String output[] = {"Not present in trie", "Present in trie"}; 


		root = new TrieNode(); 
		for(int i = 0; i < keys.length ; i++) 
			insert(keys[i]); 			

		System.out.println(wordCount(root));
	}

	static int wordCount(TrieNode root) { 
		int result = 0; 

		// Leaf denotes end of a word 
		if (isLeafNode(root)) 
			result++; 

		for (int i = 0; i < ALPHABET_SIZE; i++) {    
			if (root.children[i] != null ) {
				result += wordCount(root.children[i]); 
			}
		}
		return result;    
	}
	static boolean isLeafNode( TrieNode root) { 
	    return root.isEndOfWord != false; 
	} 
}
