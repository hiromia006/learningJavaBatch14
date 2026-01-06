package class3;

public class Primitive {
    public static void main(String[] args) {
        // Demonstrating primitive data types in Java

        // 1 byte = 8 bits
        // Integer types
        byte byteVar = 100;               // 8-bit signed integer
        short shortVar = 10000;           // 16-bit signed integer
        int intVar = 100000;              // 32-bit signed integer
        long longVar = 100000L;           // 64-bit signed integer

        // Floating-point types
        float floatVar = 10.5f;           // 32-bit floating point
        double doubleVar = 20.99;         // 64-bit floating point

        // Character type
        char charVar = 'A';               // 16-bit Unicode character

        // Boolean type
        boolean booleanVar = true;        // true or false

        // Print all variables
        System.out.println("Byte Value: " + byteVar);
        System.out.println("Short Value: " + shortVar);
        System.out.println("Integer Value: " + intVar);
        System.out.println("Long Value: " + longVar);
        System.out.println("Float Value: " + floatVar);
        System.out.println("Double Value: " + doubleVar);
        System.out.println("Character Value: " + charVar);
        System.out.println("Boolean Value: " + booleanVar);
    }
}
