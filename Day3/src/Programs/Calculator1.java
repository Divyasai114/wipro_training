package Programs;
import java.util.Scanner;
public class Calculator1 {
	public   static double add(double a, double b){
		return a+b;
	}
	public  static double sub(double a,double b) {
		return a-b;
	}
	public static double multiply(double a, double b) {
		return a*b;
	}
	public static double division(double a, double b) {
		if(b==0) {
			System.out.println("cannot divide by zero.");
			return Double.NaN;
		}
		return a/b;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome!");
		
		while(true) {
			System.out.println("Enter the value of a:");
			double a = sc.nextDouble();
			
			System.out.println("Enter the value of b:");
			double b = sc.nextDouble();
			
			System.out.println("chooose an operation:");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Sum:"+add(a,b));
				break;
			case 2:
				System.out.println("Difference:"+sub(a,b));
				break;
			case 3:
				System.out.println("Product:"+multiply(a,b));
				break;
			case 4:
				System.out.println("Quotient:"+division(a,b));
				break;
			case 5:
				System.out.println("Invalid option");
				sc.close();
				return;
			}
			
		}
	}
}
