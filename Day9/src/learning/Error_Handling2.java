package learning;
import java.lang.IllegalArgumentException;
public class Error_Handling2 {
	public static void main(String[] args) {
		try {
			int age = 20;
			if(age<0) {
				throw new IllegalArgumentException("Age cannot be negative");
			}
			System.out.println("your age is:"+age);
			
		}catch(IllegalArgumentException e) {
			System.out.println("Exception occurred:"+e.getMessage());
			
		}
	}
}
