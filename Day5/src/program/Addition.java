package program;
class Add{
	public int sum(int a, int b) {
		return a+b;
	}
}
public class Addition {
	public static void main(String[] args) {
		Add adder = new Add();
		int result =adder.sum(20, 30);
		System.out.println("Sum:"+result);
	}
}
