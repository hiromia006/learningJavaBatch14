package class6.abstractClass;

public class Car extends Vehicle {
    public  int numberOfWheels = 4;
    @Override
    public void start() {
        System.out.println("Car started.");
    }

    public void playMusic() {
        System.out.println("Playing music in the car.");
    }
}
