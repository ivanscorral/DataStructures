package chapter4.stack;

public class StackApp {
	
	public static void main(String[] args){
		Stack s = new Stack(10);
		
		s.push(6);
		s.push(62);
		s.push(84);
		
		while(!s.isEmpty()){
			System.out.print(s.pop());
			System.out.print(" ");
		}
	}

}
