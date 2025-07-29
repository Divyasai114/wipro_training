package learning;

public class Return_program {
	static int  myAdd(int a, int b) {
		return a+b;		
	}
	public static void main(String[] args) {
		System.out.println(myAdd(4,6));
		int c = myAdd(11,4);
		System.out.println(c);
	}
}
