package class5;

public class InheritanceMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark(); // Method from Dog class

        dog.eat();  // Inherited method from Animal class
    }
}
