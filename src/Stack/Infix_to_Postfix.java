package Stack;

import java.util.Stack;

public class Infix_to_Postfix {
	public static void main(String[] args) {
		 String exp = "a+b*(c^d-e)^(f+g*h)-i"; 
	     System.out.println(infixToPostfix(exp)); 	        
	}

	public int Prec(char ch) {
		switch(ch) {
		case '+':
		case '-': 
			return 1;	
		
		case '/':
		case '*':
			return 2;
		
		case '^':
			return 3;
		}      
        return -1;			
	}
	
	private static char[] infixToPostfix(String exp) {
		// TODO Auto-generated method stub
		Stack<Character>st = new Stack<Character>();
		
		
		return null;
	}
}
