package firstprogram;
import java.util.Scanner;
public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		boolean isPrime = num>1;
		for(int i =2; i <= Math.sqrt(num);i++) {
			if(num%i==0) {
				isPrime= false;
				break;
			}
		}
		System.out.println(num +(isPrime ? "is prime,":"is not prime"));
	}
}
