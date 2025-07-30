package learning;

public class Main2 implements Runnable {
	public static void main(String[] args) {
		Main obj= new Main();
		Thread thread = new Thread(obj);
		System.out.println("Outside of the thread");
	}
	public void run() {
		System.out.println("This code is running in a thread");
	}

}
