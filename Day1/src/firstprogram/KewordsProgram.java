package firstprogram;
import java.util.Scanner;
public class KewordsProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number:");
		int num2 = sc.nextInt();
		System.out.println("The sum of 2 numbers is :" +(num1 +  num2));
		sc.close();
	}

}
