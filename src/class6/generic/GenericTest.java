package class6.generic;

import class4.Car;

public class GenericTest {
    public static void main(String[] args) {
        Generic<Integer> intGeneric = new Generic<>(42);
        System.out.println("Integer Value: " + intGeneric.getValue());

        Generic<String> stringGeneric = new Generic<>("Hello, Generics!");
        System.out.println("String Value: " + stringGeneric.getValue());

        Generic<Double> doubleGeneric = new Generic<>(3.14);
        System.out.println("Double Value: " + doubleGeneric.getValue());

        Generic<Long> longGeneric = new Generic<>(123456789L);
        System.out.println("Long Value: " + longGeneric.getValue());

        Generic<Boolean> booleanGeneric = new Generic<>(true);
        System.out.println("Boolean Value: " + booleanGeneric.getValue());

        Generic<Float> floatGeneric = new Generic<>(9.81f);
        System.out.println("Float Value: " + floatGeneric.getValue());

        Generic<Car> carGeneric = new Generic<>(new Car());
        System.out.println("Car Value: " + carGeneric.getValue());

    }
}
