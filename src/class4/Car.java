package class4;

public class Car {
    public String model;
    public String color;
    public int year;


    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public Car() {

    }


    public void start() {
        System.out.println("Mercedes is starting");
    }

    public void stop() {
        System.out.println("Mercedes is stopping");
    }

    public static void main(String[] args) {
        System.out.println("-------------------");

        Car car2 = new Car("BMW X5", "White", 2023);
        System.out.println("Car Model: " + car2.model);
        System.out.println("Car Color: " + car2.color);
        System.out.println("Car Year: " + car2.year);
        car2.start();
        car2.stop();

        System.out.println("-------------------");
        //Audi
        Car car3 = new Car("Audi Q7", "Black", 2022);
        System.out.println("Car Model: " + car3.model);
        System.out.println("Car Color: " + car3.color);
        System.out.println("Car Year: " + car3.year);
        car3.start();
        car3.stop();

        System.out.println("-------------------");
        //Tesla
        Car car4 = new Car("Tesla Model S", "Red", 2024);
        System.out.println("Car Model: " + car4.model);
        System.out.println("Car Color: " + car4.color);
        System.out.println("Car Year: " + car4.year);
        car4.start();
        car4.stop();
    }
}
