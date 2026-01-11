package class5;

public class HierarchicalInheritanceMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();   // Inherited from Animal class
        dog.bark();  // Dog class method

        Cat cat = new Cat();
        cat.eat();   // Inherited from Animal class
        cat.meow();  // Cat class method
    }
}
