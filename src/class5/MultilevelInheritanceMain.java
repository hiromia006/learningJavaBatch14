package class5;

public class MultilevelInheritanceMain {
    public static void main(String[] args) {
        Manager mn = new Manager();
        mn.manage();      // Manager class method
        mn.work();        // Employee class method
        mn.introduce();  // Person class method

        Puppy puppy = new Puppy();
        puppy.eat();   // Inherited from Animal class
        puppy.bark();  // Inherited from Dog class
        puppy.play();  // Puppy class method

    }
}
