package chapter4.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseApp {

	public static void main(String[] args) {
		System.out.println("Enter a word");
		String input = "";
		try{
			input = getString();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		Reverser r = new Reverser(input);
		System.out.println(r.reverse());
	}
	
	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

}
