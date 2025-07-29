package learning;

public class Methods {
	static void greetings(String fname, int age) {
		System.out.println("Welcome to Java Development.");
		System.out.println("Hello " + fname +".Your age is"+ age);
	}
	static void wish() {
		System.out.println("Hello java .");
	}
	public static void main(String[] args) {
		 greetings("Diya",25);
		 greetings("Divya",20);
		 greetings("Sai",22);
		 wish();
	}
} 