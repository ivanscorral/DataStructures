package chapter4.stack;

public class Stack {
	
	private int[] array;
	private int top;
	
	public Stack(int maxSize){
		this.array = new int[maxSize];
		top = -1;
	}
	
	public void push(int value){
		if(!isFull()){
			this.array[++top] = value;
		}else{
			System.out.println("Stack is full, can't add more elements");
		}
	}
	
	public int pop(){
		if(!isEmpty()){
			return this.array[top--];
		}else{
			System.out.println("Stack is empty, nothing to pop");
			return -1;
		}
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public boolean isFull(){
		return (top == array.length - 1);
	}
	
	public int peek(){
		return this.array[top];
	}
}
