package learning;
import java.util.regex.Matcher;//to match pattern
import java.util.regex.Pattern;//to pattern
public class RegEx_Pattern {
	public static void main(String[] args) {
		Pattern  pattern =Pattern.compile("JavaCoding,Pattern.CASE_INSENSITIVE");
		Matcher matcher =pattern.matcher("Learn JavaCoding is fun");
		boolean matchFound= matcher.find();
		if(matchFound) {
			System.out.println("Match found");
		}
		else {
			System.out.println("Match  not found");
		}
	}

}
