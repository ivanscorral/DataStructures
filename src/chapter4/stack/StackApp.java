package chapter4.stack;

public class StackApp {
	
	public static void main(String[] args){
		Stack s = new Stack(10);
		
		s.push(6);
		s.push(62);
		s.push(84);
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.push(5);
		System.out.println(s.pop());
	}

}
