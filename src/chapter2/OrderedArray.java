package chapter2;

public class OrderedArray {
	
	private int[] array;
	private int nElems;
	
	public OrderedArray(int maxSize){
		this.array = new int[maxSize];
		this.nElems = 0;
	}
	
	public int find(int searchKey){
		boolean found = false;
		
		int lowerBound = 0;
		int upperBound = nElems - 1;
		
		int guess = -1;
		while(!found){
			guess = (lowerBound + upperBound) / 2;
			if(array[guess] == searchKey){
				found = true;
			}else{
				if(array[guess] < searchKey){
					lowerBound = guess + 1;
				}else{
					upperBound = guess - 1;
				}
			}
		}
		return guess;
	}
	
	public void insert(int value){
		int i;
		for(i = 0; i < nElems; i++){
			if(value < array[i]){
				break;
			}
		}
		for(int j = nElems; j > i; j--){
			array[j] = array[j-1];
		}
		array[i] = value;
		nElems++;
	}
	
	public void delete(int value){
		int pos = find(value);
		for(int i = pos; i < nElems; i++){
			array[i] = array[i + 1];
		}
		nElems--;
	}
	
	public void show(){
		for(int i = 0; i < nElems; i++){
			System.out.println("Index: " + i + ", value: " + array[i]);
		}
	}
	
	public OrderedArray merge(OrderedArray toMerge){
		OrderedArray result = new OrderedArray(this.getSize() + toMerge.getSize() + this.array.length);
		
		for(int i  = 0; i < this.getSize(); i++){
			result.insert(this.get(i));
		}
		for(int i  = 0; i < toMerge.getSize(); i++){
			result.insert(toMerge.get(i));
		}
		return result;
		
	}
	
	public int get(int index){
		if(index >= nElems || index < 0){
			return -1;
		}else{
			return array[index];
		}
	}
	
	public int getSize(){
		return nElems;
	}
	

}
