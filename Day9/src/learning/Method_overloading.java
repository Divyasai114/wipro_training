package learning;

public class Method_overloading {
	//method overloading: same method name with diff parameters.
	static int addMethod(int x, int y) {
		return x + y;
	}
	static double addMethod(double x, double y) {
		return x + y;
	}
	public static void main(String[] args) {
		int mytot1= addMethod(11,4);
		double mytot2= addMethod(10.64,4.46);
		System.out.println(" "+mytot1);
		System.out.println( "Total is:"+mytot2);
		
	}
}
