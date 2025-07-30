package learning;
import java.util.LinkedList;

public class LinkedList_programs {
	public static void main(String[] args) {
		LinkedList<String> countries = new LinkedList<String>();
		countries.add("USA");
		countries.add("INDIA");
		countries.add("Uk");
		countries.add("Australia");
		countries.add("Canada");
		countries.addFirst("Germany");
		countries.addLast("London");
		System.out.println(countries);
		System.out.println(countries.size());
		countries.removeFirst();
		System.out.println(countries);
		System.out.println(countries.size());
		countries.removeLast();
		System.out.println(countries);
		System.out.println(countries.getFirst());
		System.out.println(countries.getLast());
		
		
	}
}
