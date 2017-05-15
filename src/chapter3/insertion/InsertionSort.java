package chapter3.insertion;

public class InsertionSort {
	int[] array;
	int nElems;
	
	public InsertionSort(int maxSize){
		array = new int[maxSize];
		nElems = 0;

	}
	
	public void insert(int value){
		array[nElems] = value;
		nElems++;
	}
	
	public void show(){
		for(int i = 0; i < nElems; i++){
			System.out.println("Index: " + i + ", value: " + array[i]);
		}

	}
	
	
	public void insertionSort(){
		int outer;
		int inner;
		int temp;
		
		for(outer = 1; outer < nElems; outer++){
			inner = outer;
			temp = array[outer];
			while(inner > 0 && array[inner - 1] >= temp){
				System.out.println("Inner index:" + inner + ", inner value: " + array[inner] + ", temp: " + temp);
				array[inner] = array[inner - 1];
				--inner;
			}
			array[inner] = temp;
		}
	}
	
}
