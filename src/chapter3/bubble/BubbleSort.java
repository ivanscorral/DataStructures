package chapter3.bubble;

public class BubbleSort {
	
	int[] array;
	int nElems;
	int steps;
	int swaps;
	
	public BubbleSort(int maxSize){
		array = new int[maxSize];
		nElems = 0;
		steps = 0;
		swaps = 0;
	}
	
	public void insert(int value){
		array[nElems] = value;
		nElems++;
	}
	
	public void show(){
		for(int i = 0; i < nElems; i++){
			System.out.println("Index: " + i + ", value: " + array[i]);
		}
		System.out.println("Sort steps: " + steps);
		System.out.println("Sort swaps: " + swaps);
	}
	
	public void swap(int i, int j){
		int left = array[i];
		int right = array[j];
		if(left > right){
			array[j] = left;
			array[i] = right;
			swaps++;
		}
	}
	
	public void bubbleSort(){
		for(int j = nElems - 1; j > 1; j--){
			for(int i = 0; i < j; i++){
				swap(i, i+1);
				steps++;
			}
		}
	}

}
