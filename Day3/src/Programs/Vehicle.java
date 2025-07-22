package Programs;

class Vehicle1{
	void start() {
		System.out.println("Vehicle is started.");
	}
}
class car extends Vehicle1{
	void drive() {
		System.out.println("Car is driving.");
	}
}
public class Vehicle {
	public static void main(String[] args) {
		car c= new car();
		c.start();
		c.drive();
	}
}
