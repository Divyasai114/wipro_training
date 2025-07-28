package program;

class Mul3 implements Runnable{
	public void run() {
		for(int i=0; i<=200;i++) {
			System.out.println("This is Divya Sai.");
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}
}

class Mul4 implements Runnable {
	public void run() {
		for(int i=1; i<=200;i++) {
			System.out.println("Multithreading.");
			try {
				Thread.sleep(10);;
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class MultiThreading2{
	public static void main(String[] args) {
		Mul1 m1=new Mul1();
		Mul2 m2= new Mul2();
		//System.out.println(m2.getPriority());
		//m3.setPriority(Thread.MAX_PRIORITY);
		Thread t1=new Thread(m1);
		Thread t2= new Thread(m2);
		t1.start();
		t2.start();
	}

}
