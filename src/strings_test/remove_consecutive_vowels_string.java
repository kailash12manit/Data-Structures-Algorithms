package strings_test;

public class remove_consecutive_vowels_string {
	public static void main(String[] args) {
		String str = "geeks for geeks";
        removeVowels(str);		
	}

	private static void removeVowels(String str) {
		// TODO Auto-generated method stub
		System.out.print(str.charAt(0));
		for(int i=1;i<str.length();i++){
			if( !is_vowel(str.charAt(i-1)) || !is_vowel(str.charAt(i))){
				System.out.print(str.charAt(i));
			}			
		}		
	}

	private static boolean is_vowel(char ch) {
		// TODO Auto-generated method stub
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
			return true;
		}	
		return false;
	}
}
