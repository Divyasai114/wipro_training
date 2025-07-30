package learning;
import java.util.HashSet;

public class Hashset {
	public static void main(String[] args) {
		HashSet<String> sports = new HashSet<>();
		sports.add("Football");
		sports.add("Cricket");
		sports.add("Tennis");
		sports.add("Badminton");
		sports.add("Basketball");
		System.out.println(sports.contains("Footbal"));	
		//sports.remove("Tennis");
		System.out.println(sports.size());
		for(String i:sports) {
			System.out.println(i);
		}
	}
}
