package learning;
import java.util.HashMap;

public class Hashmap_Program {
	public static void main(String[] args) {
		HashMap<String,String> capital_cities = new HashMap<String, String>();
		capital_cities.put("India","Delhi");
		capital_cities.put("England","London");
		capital_cities.put("Germany","Berlin");
		capital_cities.put("Norway","Oslo");
		capital_cities.put("USA","New York");
		System.out.println(capital_cities);
		System.out.println(capital_cities.get("USA"));
		capital_cities.remove("USA");
		System.out.println(capital_cities);
		//capital_cities.clear();
		//System.out.println(capital_cities);
		System.out.println(capital_cities.size());
		//keyset()-- to get only keys
		//values()--  to get only values
		for(String i:capital_cities.keySet()) {
			System.out.println(i);
		}
		//to get keys and values
		for(String i:capital_cities.keySet()) {
			System.out.println("key:"+ i + "\tvalue:" + capital_cities.get(i));
		}
	}
}
