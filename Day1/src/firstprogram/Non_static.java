package firstprogram;

class Counter{
	int count =0;
	public void increment() {
		if(count<5) {
			count++;
		}
	}
	public int getCount() {
		return count;
	}
}
public class Non_static {
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		for(int i =0; i<5; i++) {
			c1.increment();
		}
		for(int i=0; i<3; i++) {
			c2.increment();
		}
		System.out.println(c1.getCount());
		System.out.println(c2.getCount());
	}

}
