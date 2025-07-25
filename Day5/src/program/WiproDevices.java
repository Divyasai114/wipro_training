package program;
interface Wiprosystem {
    void devicetype();
    void compilespeed();
}

class Computer implements Wiprosystem {
    public void devicetype() {
        System.out.println("Wipro provides device: Computer");
    }

    public void compilespeed() {
        System.out.println("Computer compile speed is fast.");
    }
}

class Laptop implements Wiprosystem {
    public void devicetype() {
        System.out.println("Wipro provides device: Laptop");
    }
    public void compilespeed() {
        System.out.println("Laptop compile speed is moderate.");
    }
}

public class WiproDevices {
    public static void main(String[] args) {
        Wiprosystem device1 = new Computer();
        device1.devicetype();
        device1.compilespeed();

        System.out.println();

        Wiprosystem device2 = new Laptop();
        device2.devicetype();
        device2.compilespeed();
    }
}
