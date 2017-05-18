package chapter4.stack;

public class Reverser {
	
	private String input;
	private String output;
	
	public Reverser(String input){
		this.input = input;
		this.output = "";
	}
	
	public String reverse(){
		int stackSize = input.length();
		Stack s  = new Stack(stackSize);
		
		for(int i = 0; i < stackSize; i++){
			s.push((int) input.charAt(i));
		}
		
		while(!s.isEmpty()){
			output += (char) s.pop();
		}
		
		return output;
	}

}
