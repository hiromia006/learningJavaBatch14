package class6.abstractClass;

public abstract class Vehicle {
    public  int age = 19;

    // Abstract method (no body) → must be implemented by child class
    public abstract void start();

    // Concrete method (has body) → common for all vehicles
    public void stop() {
        System.out.println("Vehicle stopped.");
    }
}
