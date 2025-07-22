package firstprogram;

public class Calculator_RuntimeData {
	public  int add(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		Calculator_RuntimeData cal = new Calculator_RuntimeData();
		int sum = cal.add(4,11);
		System.out.println("The sum is :" +sum);
	}
}
