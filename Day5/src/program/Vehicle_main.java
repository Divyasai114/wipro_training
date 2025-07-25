package program;

import java.util.Scanner;

public class Vehicle_main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle2 v= new Car();
        v.brand();
        v.speed();
        v.display();
        sc.close();
    }
}
