package learning;

public class Method_decisions {
	static void checkAge(int age ) {
		//if-else stmts
		if(age <18) {
			System.out.println ("Access Denined");	
		}
		else {
			System.out.println("Access Granted!!!!");
		}
		
		
	}
	public static void main(String[] args) {
		checkAge(20);
		checkAge(15);
	}
}
