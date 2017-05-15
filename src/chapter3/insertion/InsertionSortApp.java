package chapter3.insertion;

public class InsertionSortApp {

	public static void main(String[] args) {
		InsertionSort a = new InsertionSort(100);
		
		a.insert(1);
		a.insert(3);
		a.insert(7);
		a.insert(25);
		a.insert(8);
		a.insert(26);
		a.insert(5);
		a.show();
		a.insertionSort();
		a.show();
	}

}
