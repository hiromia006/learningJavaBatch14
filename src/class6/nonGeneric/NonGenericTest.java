package class6.nonGeneric;

public class NonGenericTest {
    public static void main(String[] args) {
        IntegerTest integerTest = new IntegerTest(42);
        System.out.println("Integer value: " + integerTest.getInteger());

        DoubleTest doubleTest = new DoubleTest(3.14);
        System.out.println("Double value: " + doubleTest.getDoubleValue());

        LongTest longTest = new LongTest(123456789L);
        System.out.println("Long value: " + longTest.getLongValue());

        StringTest stringTest = new StringTest("Hello, Non-Generic World!");
        System.out.println("String value: " + stringTest.getString());

        BooleanTest booleanTest = new BooleanTest(true);
        System.out.println("Boolean value: " + booleanTest.getBooleanValue());

        /*
        *
        *
        *
        *
        *  */
    }
}
