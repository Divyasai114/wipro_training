package learning;
import java.util.Random;

public class Random_numbers {
	public static void main(String[] args) {
		long random10DigitNumber = generateTenDigitRandomNumber();
		System.out.println("Random 10-Digit Number:"+random10DigitNumber);
	}

	private static long generateTenDigitRandomNumber() {
		// TODO Auto-generated method stub
		Random random = new Random();
		long min = 1000000000L;
		long max = 9999999999L;
		long random10DigitNumber = min +((long)(random.nextDouble()*(max-min+1)));
		return random10DigitNumber;
	}
	
}
