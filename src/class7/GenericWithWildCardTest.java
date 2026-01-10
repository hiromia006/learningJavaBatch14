package class7;

public class GenericWithWildCardTest {
    public static void main(String[] args) {
        GenericWithWildCard<Integer> intGeneric = new GenericWithWildCard<>(42);
        System.out.println("Integer Value: " + intGeneric.getValue());

//        GenericWithWildCard<String> stringGeneric = new GenericWithWildCard<>("Hello, Generics!");
//        System.out.println("String Value: " + stringGeneric.getValue());

        GenericWithWildCard<Double> doubleGeneric = new GenericWithWildCard<>(3.14);
        System.out.println("Double Value: " + doubleGeneric.getValue());

        GenericWithWildCard<Long> longGeneric = new GenericWithWildCard<>(123456789L);
        System.out.println("Long Value: " + longGeneric.getValue());

//        GenericWithWildCard<Boolean> booleanGeneric = new GenericWithWildCard<>(true);
//        System.out.println("Boolean Value: " + booleanGeneric.getValue());

        GenericWithWildCard<Float> floatGeneric = new GenericWithWildCard<>(9.81f);
        System.out.println("Float Value: " + floatGeneric.getValue());

//        GenericWithWildCard<Car> carGeneric = new GenericWithWildCard<>(new Car());
//        System.out.println("Car Value: " + carGeneric.getValue());
    }
}
