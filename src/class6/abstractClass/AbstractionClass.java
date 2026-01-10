package class6.abstractClass;

public class AbstractionClass {
    public static void main(String[] args) {
        // Vehicle vehicle = new Vehicle(); // This line would cause an error because we cannot instantiate an abstract class

        Car myCar = new Car();
        myCar.start();  // Output: Car started.
        myCar.playMusic();  // Output: Playing music in the car.
        myCar.stop();  // Output: Vehicle stopped.
        System.out.println(myCar.numberOfWheels);
        System.out.println(myCar.age);

        Vehicle vehicle1 = new Car();
//        System.out.println(vehicle1.numberOfWheels);
        System.out.println(vehicle1.age);
        vehicle1.start();  // Output: Car started.
//        vehicle1.playMusic();  // Output: Playing music in the car.
        vehicle1.stop();  // Output: Vehicle stopped.
    }

}
