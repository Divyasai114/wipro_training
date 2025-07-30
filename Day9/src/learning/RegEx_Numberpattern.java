package learning;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegEx_Numberpattern {
	public static void main(String[] args) {
		String[] strings= {
			"123456",
			"3.55",
			"asda",
			"122sdd33",
			"-87777",
			"+200"
		};
		String numerPattern ="[-+]?\\d*\\.?\\d";
		Pattern regex= Pattern.compile(numerPattern);
		for(String str: strings) {
			Matcher matcher =regex.matcher(str);
			if(matcher.matches()) {
				System.out.println(str+"is a valid number");
			}
			else {
				System.out.println(str +"is an invalid number");
			}
		}
	}
}
