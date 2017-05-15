package chapter3.selection;

public class SelectionSortApp {

	public static void main(String[] args) {

		SelectionSort a =  new SelectionSort(100);
		
		for(int i = 0; i < 100; i++){
			a.insert((int)(Math.random()*1000));
		}
		
		a.show();
		a.selectionSort();
		a.show();
		
		
	}

}
