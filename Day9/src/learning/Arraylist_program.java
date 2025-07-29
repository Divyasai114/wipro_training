package learning;
import java.util.ArrayList;// importing the arraylist library
import java.util.Collections;//sort() method having
public class Arraylist_program {
	public static void main(String[] args) {
		ArrayList<String>fruits = new  ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Kiwi");
		fruits.add("Banana");
		fruits.add("Mango");
	    //System.out.println(fruits);
	    //based on index we can get a particular item or by suing get()
		//System.out.println(fruits.get(0));
		// to modify item in array list we use array method-- set()
		//fruits.set(3, "Pineapple");
		//System.out.println(fruits);
		//fruits.remove(1);
		//System.out.println(fruits);
		//fruits.clear();
		//System.out.println(fruits);
		System.out.println(fruits.size());
		//for(int i=0; i<fruits.size();i++) {
		//	System.out.println(fruits.get(i));
		//}
		//for(String i: fruits) {
			//System.out.println(i);
		//}
		Collections.sort(fruits);
		System.out.println(fruits);
		ArrayList<Integer>marks = new ArrayList<Integer>();
		marks.add(90);
		marks.add(100);
		marks.add(65);
		marks.add(75);
		marks.add(95);
		
		Collections.sort(marks);
		for(int i=0; i<marks.size();i++) {
			System.out.println(marks.get(i));
		}
		System.out.println(marks);
	}
}
