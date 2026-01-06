package class4;

public class classTest {
    int instanceVar = 50; // Instance variable
    static int staticVar = 100; // Static variable

    public classTest() {
    }

    public classTest(int value) {
        System.out.println("Parameterized Constructor called. Instance Variable set to: " + value);
    }



    public void displayVariables() {
        int localVar = 150; // Local variable
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        classTest testObj1 = new classTest();
          testObj1.displayVariables();

        System.out.println("-------------------");
        classTest testObj2 = new classTest(200);
        testObj2.displayVariables();
    }
}


