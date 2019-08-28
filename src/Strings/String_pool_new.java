package Strings;

public class String_pool_new {
	public static void main(String[] args) {
		String str1="kailashkumar"; // 12
		String str2="kailashkumar";
		String str3="kailashkumar12";
		if(str1==str2) {
			System.out.println("str1==str2");
		}else {
			System.out.println("str1!=str2");
		}
		
		//str1="kailashkumar12";
		str2=str2.concat("");
		
		if(str1==str2) {
			System.out.println("str1==str2");
		}else {
			System.out.println("str1!=str2" + "\n" + str1 + "\n" + str2);
		}
				
	}
}
