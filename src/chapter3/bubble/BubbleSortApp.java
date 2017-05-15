package chapter3.bubble;

public class BubbleSortApp {

	public static void main(String[] args) {
		
		BubbleSort a = new BubbleSort(1000);
		
		for(int i = 0; i < 1000; i++){
			a.insert((int)(Math.random()*10000));
		}
		
		a.show();
		a.bubbleSort();
		a.show();
		
	}

}
