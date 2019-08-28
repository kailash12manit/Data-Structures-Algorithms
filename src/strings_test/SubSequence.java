package strings_test;

public class SubSequence {
	public static void main(String[] args) {
		String a= "ach";
		String b= "abcefgh";
		
		//Given a string s and a string t, check if s is subsequence of t.
		
		System.out.println(isSubsequence(a,b));	
	}	
	
	public static boolean isSubsequence(String s , String t){
		if(s.length()==0){
			return true;			
		}
		
		int i=0;
		int j=0;
		while(i<s.length() && j<t.length()){
			if(s.charAt(i)==t.charAt(j)){
				i++;
			}
			
			j++;
			if(i==s.length()){
				return true;
			}
		}
		
		return false;
	}
}