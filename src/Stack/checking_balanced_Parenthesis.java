package Stack;

public class checking_balanced_Parenthesis {
	static class stack{
		int top=-1;
		char []items= new char[100];
		void push(char ch){
			if(top==99){ // 0 to 99 
				System.out.println("stack is full");
			}
			else{
				items[++top]=ch;
			}
		}
		
		char pop(){
			if(top==-1){
				System.out.println("stack is EMPTY  i.e. undeflow");
				return '\0';
			}
			else{
				char item =items[top];
				top--;
				return item ;
			}			
		}
		
		boolean isEmpty(){
			return (top==-1) ? true:false;
		}
	}
		
	static boolean isMatchingPair(char ch1 , char ch2){
		if(ch1=='(' && ch2==')'){
			return true;
		}
		else if(ch1=='[' && ch2==']'){
			return true;
		}
		else if(ch1=='{' && ch2=='}'){
			return true;
		}	
		else 
			return false;
	}
	
	private static boolean areParenthesisBalanced(char[] exp) {
		// TODO Auto-generated method stub
		stack st = new stack();
		for(int i=0;i<exp.length;i++){
			if(exp[i]=='(' || exp[i]=='[' || exp[i]=='{'){
				st.push(exp[i]);
			}
			if(exp[i]==')' || exp[i]==']' || exp[i]=='}') {
				if(st.isEmpty()){
					return false;
				}
				else if(! isMatchingPair(st.pop(), exp[i])) {
					return false;
				}				
			}
		}
		if(st.isEmpty()){
			return true;
		}
		else{
			return false;
		}
	}
		
	public static void main(String[] args)  { 
		char exp[] = {'{','(',')','}','[',']','{'}; 
		if (areParenthesisBalanced(exp)) 
			System.out.println("Balanced "); 
		else
			System.out.println("Not Balanced "); 
		
		char exp2[] = {'{','(',')','}','[',']'}; 
		if (areParenthesisBalanced(exp2)) 
			System.out.println("Balanced "); 
		else
			System.out.println("Not Balanced ");  
		
	}	
}
