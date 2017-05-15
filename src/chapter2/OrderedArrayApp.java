package chapter2;

public class OrderedArrayApp {

	public static void main(String[] args) {
		
		OrderedArray o = new OrderedArray(100);
		OrderedArray b = new OrderedArray(20);
		
		for(int i = 0; i < 5; i++){
			o.insert((int)(Math.random()*1000));
			b.insert((int)(Math.random()*1000));
		}
		
		System.out.println("o");
		o.show();
		System.out.println("b");
		b.show();
		System.out.println("o+b");
		o.merge(b).show();
	}

}
