package learning;
import java.util.ArrayList;

import java.util.Iterator;
public class Iterator_program {
	public static void main(String[] args) {
		ArrayList<String>fruits = new  ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Kiwi");
		fruits.add("Banana");
		fruits.add("Mango");
		Iterator<String>item = fruits.iterator();
		System.out.println(item.next());
		while(item.hasNext()) {
			System.out.println(item.next());
		}	
	}
}