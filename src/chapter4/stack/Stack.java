package chapter4.stack;

public class Stack {
	
	private int[] array;
	private int top;
	
	public Stack(int maxSize){
		this.array = new int[maxSize];
		top = -1;
	}
	
	public void push(int value){
		this.array[++top] = value;
	}
	
	public int pop(){
		return this.array[top--];
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
