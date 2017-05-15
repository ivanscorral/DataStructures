package chapter3.selection;

public class SelectionSort {
	
	int[] array;
	int nElems;
	int steps;
	int swaps;
	
	public SelectionSort(int maxSize){
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
		int first = array[i];
		int second = array[j];
		array[j] = first;
		array[i] = second;
		swaps++;
	}
	
	public void selectionSort(){
		int min = 0;
		int offset;
		int i;
		
		for(offset = 0; offset < nElems-1; offset++){
			min = offset;
			for(i = offset + 1; i < nElems; i++){
				if(array[i] < array[min]){
					min = i;
				}
				steps++;
			}
			swap(offset, min);
		}
		
		
	}

}
