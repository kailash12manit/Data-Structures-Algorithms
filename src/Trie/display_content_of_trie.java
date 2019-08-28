package Trie;

public class display_content_of_trie {
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
		String keys[] = {"the", "a", "there", "answer", "any", "by", "bye", "their"}; 
		root = new TrieNode(); 
		
		for(int i = 0; i < keys.length ; i++) {
			insert(keys[i]); 
		}
		char []ch= new char[20];
		display_trie(root,ch,0);
	}

	private static void display_trie(TrieNode root, char[] str, int level) {
		// TODO Auto-generated method stub
		if(isLeafNode(root)) {
			for(int i=0;i<level;i++) {
				System.out.print(str[i]);
			}
			System.out.println();
		}

		int i; 
		for (i = 0; i < ALPHABET_SIZE; i++) { 
			if (root.children[i] != null) { 
				str[level] = (char)(i+'a'); 
				display_trie(root.children[i], str, level + 1); 
			} 
		} 	
	}
	
	static boolean isLeafNode( TrieNode root) { 
	    return root.isEndOfWord != false; 
	} 
}
